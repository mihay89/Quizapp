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
import android.widget.Toast;

import static android.R.attr.button;
import static android.R.attr.checked;
import static android.R.attr.name;
import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.example.adymihai.quizapp.Question1.score;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//start THE Quiz
    public void startQuiz(View view) {
        Intent intent = new Intent("com.example.adymihai.quizapp.Question1");
        startActivity(intent);
                    }


        }
