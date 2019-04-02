import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Employee;
import model.Salary;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
//First Employee  "name" : "Ivanov", "position" : 1, "bonus" : 234}


        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = new Employee();
        employee.setName("Ivanov");
        employee.setPosition(1);
        employee.setBonus(234);
        Employee employee1 = new Employee();
        employee1.setName("Petrov");
        employee1.setPosition(3);
        employee1.setBonus(400);
        Employee employee2 = new Employee();
        employee2.setName("Halimov");
        employee2.setPosition(1);
        employee2.setBonus(700);
        Employee employee3 = new Employee();
        employee3.setName("Medev");
        employee3.setPosition(4);
        employee3.setBonus(100);
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);

        objectMapper.writeValue(new FileOutputStream("employee.json"), employees);


        System.out.println(objectMapper.writeValueAsString(employees));
        System.out.println("---------------------------------------");



        System.out.println("---------------------------------------");

//        "position" : 5, "sal" : 600},
//    { "position" : 1, "sal" : 1000},
//    { "position" : 8, "sal" : 700}
        Salary salary = new Salary();
        salary.setPosition(5);
        salary.setSal(600);
        Salary salary1 = new Salary();
        salary1.setPosition(1);
        salary1.setSal(1000);
        Salary salary2 = new Salary();
        salary2.setPosition(8);
        salary2.setSal(700);
        List<Salary> salaries = new ArrayList<>();
        salaries.add(salary);
        salaries.add(salary1);
        salaries.add(salary2);
        objectMapper.writeValue(new FileOutputStream("salary.json"), salaries);
        System.out.println(objectMapper.writeValueAsString(salaries));

        System.out.println("---------------------------------");




    }

}
