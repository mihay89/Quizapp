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
import static com.example.adymihai.quizapp.R.id.checkBox;
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
        score = score + question2();
                        Intent intent2 = new Intent("com.example.adymihai.quizapp.Question3");
                        startActivity(intent2);
                    }

public int question2(){
    score = 0;
    CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
    boolean isChecked = checkBox.isChecked();
    if(isChecked){
        score = score + 10;
    }
    CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
    boolean isChecked1 = checkBox1.isChecked();
    if(isChecked1){
        score = score + 10;
    }
    CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
    boolean isChecked2 = checkBox2.isChecked();
    if(isChecked1){
        score = score + 10;
    }
return score;
}

}
