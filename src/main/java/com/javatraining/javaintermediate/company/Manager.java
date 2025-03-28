package com.javatraining.javaintermediate.company;

public class Manager extends Employee{

    private String position;

    public Manager(String name, int salary, String position) {
        super(name, salary);
        this.position = position;
    }

    @Override
    public String getInfo() {
        return "관리자 이름 : " + getName() + ", 직책 : " + position + ", 급여 : " + getSalary() + "원";
    }
}
