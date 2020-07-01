package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Movie a = new Movie("Game of thronese" , "Jone" , 9.4 , 10 , "Madry");
        Movie v = new Movie("The whicer" , "geralt" , 9.4 , 10 , "Madry");

    }
}