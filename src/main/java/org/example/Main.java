package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tom", "Smith", Buyer.Gender.MALE);
        Employee employee2 = new Employee("Jhon", "Hartnett", Buyer.Gender.MALE);
        Employee employee3 = new Employee("Sarah", "Connor", Buyer.Gender.FEMALE);
        Employee employee4 = new Employee("Olivia", "Terner", Buyer.Gender.FEMALE);
        Employee employee5 = new Employee("Tim", "Potter", Buyer.Gender.MALE);

        List<Employee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(employee1);
        listOfEmployee.add(employee2);
        listOfEmployee.add(employee3);
        listOfEmployee.add(employee4);
        listOfEmployee.add(employee5);

        Celebrate.checkCelebrateDay(listOfEmployee);
    }
}