package com.OOPs.Comparator;

public class Student implements Comparable<Student>{
    int marks;
    int rollNo;

    Student(int rollNo,int marks){
        this.marks = marks;
        this.rollNo = rollNo;
    }

    @Override
    public int compareTo(Student o) {
        return this.marks - o.marks;
    }

    @Override
    public String toString() {
        return marks+" ";
    }
}
