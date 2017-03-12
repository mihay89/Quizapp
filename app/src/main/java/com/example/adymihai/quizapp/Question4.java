package com.example.adymihai.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import static com.example.adymihai.quizapp.Question1.score;
import static com.example.adymihai.quizapp.R.id.strawberry;
import static com.example.adymihai.quizapp.R.id.chocolate;
import static com.example.adymihai.quizapp.R.id.next3;
import static com.example.adymihai.quizapp.R.id.the_score;
import static com.example.adymihai.quizapp.R.id.previous2;

public class Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

    }

    //go to Question3 activity
    public void back3(View view) {
        Button previous3 = (Button) findViewById(R.id.previous3);
        previous3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent7 = new Intent("com.example.adymihai.quizapp.Question3");
                        startActivity(intent7);
                    }
                }
        );
    }
}
