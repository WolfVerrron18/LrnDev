package com.example.lrndev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cat cat1 = new Cat();
        Log.i("numberOfLegs", "cat1 number of legs " + cat1.numberOfLegs + " " + Cat.whatCatsLike());

        Lion lion = new Lion();
        lion.talk();
    }
}