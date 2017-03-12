package com.example.adymihai.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.R.attr.checked;
import static android.R.attr.displayOptions;
import static android.R.attr.name;
import static com.example.adymihai.quizapp.Question1.score;
import static com.example.adymihai.quizapp.R.id.next1;
import static com.example.adymihai.quizapp.R.id.next2;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }


    // open Question3 activity when next2 button is pressed
    public void toQuestion3(View view) {
        Button next2 = (Button) findViewById(R.id.next2);
        next2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent("com.example.adymihai.quizapp.Question3");
                        startActivity(intent2);
                    }
                }
        );
    }

    // go back to Question1
    public void back(View view) {
        Button previous1 = (Button) findViewById(R.id.previous1);
        previous1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent3 = new Intent("com.example.adymihai.quizapp.Question1");
                        startActivity(intent3);
                    }
                }
        );
    }
}
