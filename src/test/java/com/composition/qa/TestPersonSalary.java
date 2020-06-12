package com.composition.qa;

public class TestPersonSalary {
    public static void main(String[] args) {
        Person person = new Person();
        long salary = person.getSalary();
        System.out.println("Salary is :" + salary);
    }
}
