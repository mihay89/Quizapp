package com.example.adymihai.quizapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.name;
import static android.content.Context.MODE_PRIVATE;
import static android.icu.util.ULocale.getName;
import static com.example.adymihai.quizapp.Question1.score;
import static com.example.adymihai.quizapp.R.id.strawberry;
import static com.example.adymihai.quizapp.R.id.chocolate;
import static com.example.adymihai.quizapp.R.id.next3;

public class Question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
    }

    public int question4() {
        score = 0;
        CheckBox vanilla = (CheckBox) findViewById(R.id.vanilla);
        boolean likeVanilla = vanilla.isChecked();
        CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate);
        boolean likeChocolate = chocolate.isChecked();
        CheckBox strawberry = (CheckBox) findViewById(R.id.strawberry);
        boolean likeStrawberry = strawberry.isChecked();
if(likeVanilla){
            score = score + 10;
        }
        if(likeChocolate){
            score = score + 10;
        }
        if(likeStrawberry){
            score = score + 10;
        }
        return score;
    }

    public void endQuiz(View view){
        score = score + question4();
        if(score < 30) {
            Toast.makeText(this, message2(score), Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, message1(score), Toast.LENGTH_LONG).show();
        }

    }
    // return the final message
    public String message1(int score) {
        String message1 = "Thank you for taking the quiz! \n" +
                " Your score is: " + score + "\n"
                + "Great Job!\n" + "You are going to be a great developer!";
        return message1;
    }
    public String message2(int score) {
        String message2 = "Thank you for taking the quiz! \n" +
                " Your score is: " + score + "\n"
                + "Hey! If you don't get along with android, there's plenty of stuff to study in computer science." +
                "Start another course!! ";
        return message2;
    }
/*
    //set the text in a textView
    public void displayMessage(String message) {
        TextView finMessage = (TextView) findViewById(R.id.text);
        finMessage.setText(message);
    }*/
}
