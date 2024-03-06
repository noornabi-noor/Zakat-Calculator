package com.example.zakatcalculator;

import static java.lang.Thread.sleep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SpalashClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalash_class);

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent myIntent = new Intent(SpalashClass.this, MainActivity.class);
                    startActivity(myIntent);
                    finish();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });myThread.start();
    }
}