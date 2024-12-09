package com.serenitydojo;

public class Dog {
    public String name;
    public String toy;
    public int age;

    // consturctor method
    public Dog(String name, String toy, int age) {
        this.name = name;
        this.toy = toy;
        this.age = age;
    }
//Get Method
    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return toy;
    }

    public int getAge() {
        return age;
    }
}




