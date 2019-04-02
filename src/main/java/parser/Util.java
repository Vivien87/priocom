package parser;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Employee;
import model.Salary;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Util {
    private static ObjectMapper objectMapper = new ObjectMapper();



    public static List<Employee> MergeByPosition(List<Employee> employeeList, List<Salary> salaryList) {

        List<Employee> newEmployeeList = new ArrayList<>();
        for (Employee employee : employeeList) {
            for (Salary salary : salaryList) {
                if (employee.getPosition() == salary.getPosition()) {
                    employee.setSalary(salary.getSalary());
                    newEmployeeList.add(employee);

                }
            }

        }
        return newEmployeeList;

    }

    public static List<Employee> readFromFileEmployee(String pathToEmployeeFile) throws IOException {
        byte[] mapDataEmployee = Files.readAllBytes(Paths.get(pathToEmployeeFile + ".json"));
        List<Employee> myMapEmployee = objectMapper
                .readValue(mapDataEmployee, new TypeReference<List<Employee>>() {
                });
        return myMapEmployee;
    }


    public static List<Salary> readFromFileSalaryByFilter(String pathToSalaryFile, final int salary) throws IOException {
        byte[] mapDataSalary = Files.readAllBytes(Paths.get(pathToSalaryFile + ".json"));
        List<Salary> myMapSalary = objectMapper
                .readValue(mapDataSalary, new TypeReference<List<Salary>>() {
                });

        return myMapSalary.stream().filter(item -> item.getSalary() >= salary).collect(Collectors.toList());

    }

    public static<T> void writeToFile(String newNameFile, List<T> list) throws IOException {
        objectMapper.writeValue(new FileOutputStream(newNameFile + ".json"), list);
    }
}
