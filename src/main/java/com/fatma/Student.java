package com.fatma;

public class Student extends Person {
    String school;

    //Constructor
    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void displayInfo() {
        super.displayinfo();
        System.out.println("School: " + this.school);
    }
}
