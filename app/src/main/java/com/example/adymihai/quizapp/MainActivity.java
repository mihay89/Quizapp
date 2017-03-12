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
int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    startQuiz();
    }
//start THE Quiz
    public void startQuiz() {
        Button start = (Button) findViewById(R.id.start);
        start.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("com.example.adymihai.quizapp.Question1");
                        startActivity(intent);
                    }
                }
        );

    }
    //calculate score and display result
public void endQuiz(View view) {
    RadioButton yeah = (RadioButton) findViewById(R.id.radio1);
    boolean checked = yeah.isChecked();
    if (checked) {
        score = score + 10;
    }
    CheckBox vanilla = (CheckBox) findViewById(R.id.vanilla);
    boolean likeVanilla = vanilla.isChecked();
    if (likeVanilla) {
        score = score + 10;
    }
    CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate);
    boolean likeChocolate = chocolate.isChecked();
    if (likeChocolate) {
        score = score + 10;
    }
    CheckBox strawberry = (CheckBox) findViewById(R.id.strawberry);
    boolean likeStrawberry = strawberry.isChecked();
    if (likeStrawberry) {
        score = score + 10;
    }
    RadioButton master = (RadioButton) findViewById(R.id.master);
    boolean checked4 = master.isChecked();
    if(checked4){
        score = score + 10;
    }
    CheckBox checkBoxOne = (CheckBox) findViewById(R.id.checkBox1);
    boolean checked1 = checkBoxOne.isChecked();
    if(checked1){
        score = score +10;
    }
    CheckBox checkBoxTwo = (CheckBox) findViewById(R.id.checkBox2);
    boolean checked2 = checkBoxTwo.isChecked();
    if(checked2){
        score = score + 10;
    }
    CheckBox checkBoxThree = (CheckBox) findViewById(R.id.checkBox);
    boolean checked3 = checkBoxThree.isChecked();
    if(checked3){
        score = score+10;
    }
    EditText input = (EditText) findViewById(R.id.edit_message) ;
    String name = input.getText().toString();
    displayMessage(finalMessage(score));
}
    // return the final message
    public String finalMessage(int score) {
    String message = name + ", Your score is: " + score + "\n"
            + "Great Job. You are going to be a great developer!";
        return message;
    }

    //set the text in a textView
    public void displayMessage(String message) {
        TextView finMessage = (TextView) findViewById(R.id.the_score);
        finMessage.setText(message);
    }
}
