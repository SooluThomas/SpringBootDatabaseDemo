package com.example.databaseDemo;

import javax.persistence.*;
//import javax.persistence.GenerationType;


@Entity
//@Table(name="Student")
public class Student {

    @Id
    //@GeneratedValue //(strategy = GenerationType.AUTO)
    private int num;

    private String name;

    public Student() {
    }

    public Student(int no, String name) {
        super();
        this.num = no;
        this.name = name;
    }

    public Student(String name) {
        super();
//        this.num= @GeneratedValue(strategy = GenerationType.AUTO) num;
        this.name = name;
    }

    public int getNo() {
        return num;
    }

    public void setNo(int no) {
        this.num = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
