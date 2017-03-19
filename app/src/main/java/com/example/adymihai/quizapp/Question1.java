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
public  static int score ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
    }
public int question1 () {
    RadioButton yeah = (RadioButton) findViewById(R.id.radio1);
    boolean isChecked = yeah.isChecked();
    if (isChecked) {
        score = score + 10;
    }
    return score;
}

// intent to Question 2 using the next1 button
    public void toQuestion2(View view) {
        score = score + question1();
                        Intent intent1 = new Intent("com.example.adymihai.quizapp.Question2");
                        startActivity(intent1);
                    }




}