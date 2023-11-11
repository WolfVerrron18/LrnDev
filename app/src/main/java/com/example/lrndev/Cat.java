package com.example.lrndev;

import android.util.Log;

public class Cat {
    int age;
    String name;
    String breed;
    String color;

    public Cat(int age, String name, String breed, String color) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void talk() {
        Log.i("talkCat()", "Name = " + name + ", Age = " + age + ", Breed = " + breed + ", Color = " + color);
    }
}
