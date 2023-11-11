package com.example.lrndev;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    Cat myCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(30, "oleg", "shpiz", "yellow");
        myCat.talk();

        Puma puma = new Puma();
        puma.name = "Leo";
        puma.age = 109332;
        puma.breed = "Vanya";
        puma.color = "Black";
        puma.breathe();
        puma.talk();
        puma.iaAlive = true;
        Log.i("isAlive()", String.valueOf(puma.iaAlive));
        Log.i("breathe()", "My name is " + puma.name + " and " + puma.breathe());
    }
}