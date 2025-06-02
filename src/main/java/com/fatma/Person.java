package com.fatma;

public abstract class Person {
    String name;
    int age;

    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayinfo() {
        System.out.println("Name: " + name + "Age: " + age);
    }

    public abstract void displayInfo();
}
