package com.example.lrndev;

import android.util.Log;

public class Lion extends Cat{
    public void talk() {
        Log.i("talk()", "R-r-r, I`m Lion " + "Name = " + name + ", Age = " + age + " " + Cat.whatCatsLike());
    }
}
