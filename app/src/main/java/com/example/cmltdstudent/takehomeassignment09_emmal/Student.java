package com.example.cmltdstudent.takehomeassignment09_emmal;

import java.io.Serializable;

/**
 * Created by cmltdstudent on 4/2/17.
 */

public class Student implements Serializable
{
    private String name;
    private int age;
    private boolean graduated;

    public Student(){};

    public Student(String name, int age, boolean graduated) {
        this.name = name;
        this.age = age;
        this.graduated = graduated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + graduated;
    }
}
