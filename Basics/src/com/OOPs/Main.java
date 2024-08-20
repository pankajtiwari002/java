package com.OOPs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student pankaj = new Student("Pankaj",101,93.4f);
//        System.out.println(pankaj);

        int n = 5;
        Student[] students = new Student[n];

        for(int i=0;i<n;i++){
            students[i] = new Student();
            students[i].takeInput();
        }

        System.out.println("Students Array:");
        for(Student student : students){
            System.out.println(student);
        }
    }
}

class Student{
    String name;
    int rollNo;
    float marks;
    public Student(){
        this("Default Person",102,90);
    } // default constructor
    Student(String name,int rollNo,float marks){
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }

    Student(Student other){
        this.name = other.name;
        this.marks = other.marks;
        this.rollNo = other.rollNo;
    }

    @Override
    public String toString(){
        String s = "{\n\trollNo: " + rollNo + "\n\tname: " + name + "\n\tmarks: " + marks + "\n}";
        return s;
    }

    void takeInput(){
        Scanner sc = new Scanner(System.in);
        rollNo = sc.nextInt();
        name = sc.next();
        marks = sc.nextFloat();
    }
}
