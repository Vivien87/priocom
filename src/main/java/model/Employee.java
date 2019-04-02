package model;

public class Employee {
   // First Employee  "name" : "Ivanov", "position" : 1, "bonus" : 234}

    private String name;
    private  int position;
    private int bonus;

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
}
