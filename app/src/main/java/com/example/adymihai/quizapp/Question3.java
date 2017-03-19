package com.example.adymihai.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import static com.example.adymihai.quizapp.Question1.score;
import static com.example.adymihai.quizapp.R.id.master;
import static com.example.adymihai.quizapp.R.id.next2;

public class Question3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
    }
    // open Question4
    public void toQuestion4(View view) {
        score = score + question3();
                        Intent intent5 = new Intent("com.example.adymihai.quizapp.Question4");
                        startActivity(intent5);
                    }

public int question3(){
    score = 0;
RadioButton master = (RadioButton) findViewById(R.id.master);
    Boolean isChecked = master.isChecked();
    if(isChecked){
        score = score + 10;
    }
    return score;
}
}
