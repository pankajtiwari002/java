package com.Java8;

import java.util.ArrayList;
import java.util.function.Consumer;

class Employee{
    String name;
    double salary;
    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }
}

interface EmployeeConstructor{
    Employee get(String name,double salary);
}

public class ConstructorReference {
    public static void main(String[] args) {
        EmployeeConstructor emp = Employee::new;
        Consumer<Employee> print = (e) -> {
            System.out.println("Name: " + e.name);
            System.out.println("Salary: " + e.salary);
            System.out.println();
        };

        ArrayList<Employee> list = new ArrayList<>();
        list.add(emp.get("Pankaj",1000000));
        list.add(emp.get("Nikhil",600000));
        list.add(emp.get("Manish",500000));
        list.add(emp.get("Harshit",400000));

        for(Employee e: list){
            print.accept(e);
        }
    }
}
