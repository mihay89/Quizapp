package com.example.adymihai.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import static com.example.adymihai.quizapp.Question1.score;
import static com.example.adymihai.quizapp.R.id.next2;
import static com.example.adymihai.quizapp.R.id.previous1;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
    }
    // open Question4
    public void toQuestion4(View view) {

        Button next3 = (Button) findViewById(R.id.next3);
        next3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent5 = new Intent("com.example.adymihai.quizapp.Question4");
                        startActivity(intent5);
                    }
                }
        );
    }
// go to Question2
    public void back2(View view) {
        Button previous2 = (Button) findViewById(R.id.previous2);
        previous2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent4 = new Intent("com.example.adymihai.quizapp.Question2");
                        startActivity(intent4);
                    }
                }
        );
    }
}
