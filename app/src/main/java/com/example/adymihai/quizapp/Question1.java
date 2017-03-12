package com.example.adymihai.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.adymihai.quizapp.R.id.next1;


public class Question1 extends AppCompatActivity {
public static int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        toQuestion2();
    }
// intent to Question 2 using the next1 button
    public void toQuestion2() {

        Button next1 = (Button) findViewById(R.id.next1);
        next1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent1 = new Intent("com.example.adymihai.quizapp.Question2");
                        startActivity(intent1);
                    }
                }
        );
    }




}