package com.example.lrndev;

import android.util.Log;

public class Cat extends Animal {
    protected int age;
    String name;
    static int numberOfLegs = 4;
    private String breed;
    private String color;

    public Cat() {
        this.name = "John Snow";
        this.age = 12;
    }

    public Cat(int age, String name, String breed, String color) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void talk() {
        Log.i("talk()", "Meow, I`m Cat " + "Name = " + name + ", Age = " + age + ", Breed = " + breed + ", Color = " + color + Cat.whatCatsLike());
    }

    public void talk(int count) {
        Log.i("Meow()", "I said " + count + " meow");
    }

    public void talk(String hello) {
        Log.i("Hello()", "Meow, " + hello);
    }

    public static final String whatCatsLike() {
        return "I`m like jumping, playing and scratching!";
    }
}
