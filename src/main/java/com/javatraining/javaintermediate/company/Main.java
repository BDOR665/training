package com.javatraining.javaintermediate.company;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("철수", 3000000);
        Manager manager = new Manager("짱구", 5000000, "팀장");

        System.out.println(employee.getInfo());
        System.out.println(manager.getInfo());

    }
}
