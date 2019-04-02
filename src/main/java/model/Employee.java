package model;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Employee {



    // First Employee  "name" : "Ivanov", "position" : 1, "bonus" : 234}
    @JsonProperty
    private String name;
    @JsonProperty
    private  int position;
    @JsonProperty
    private int bonus;
    private int salary;
    private int total;

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTotal() {
        return bonus+salary;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", bonus=" + bonus +
                ", salary=" + salary +
                ", total=" + total +
                '}';
    }
}