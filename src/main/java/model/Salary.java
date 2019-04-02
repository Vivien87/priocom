package model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Salary {


//        "position" : 5, "sal" : 600},
//    { "position" : 1, "sal" : 1000},
//    { "position" : 8, "sal" : 700}

    @JsonProperty
    private int position;
    @JsonProperty
    private int salary;


    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
