package com.javatraining.javaintermediate.company;

public class Employee {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getInfo(){

        return "직원이름 : " + name + ", 급여 : " + salary + "원";
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

}
