package com.example.lrndev;

import android.util.Log;

public class Cat extends Animal {
    protected int age;
    String name;
    private String breed;
    private String color;

    public Cat() {

    }

    public Cat(int age, String name, String breed, String color) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void talk() {
        Log.i("talk()", "Name = " + name + ", Age = " + age + ", Breed = " + breed + ", Color = " + color);
    }
}
