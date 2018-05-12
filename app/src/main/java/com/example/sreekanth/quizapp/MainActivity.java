package com.example.sreekanth.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox check1A, check1B, check1C, check1D, check4A, check4B, check4C, check4D,
            check6A, check6B, check6C, check6D, check8A, check8B, check8C, check8D;
    RadioButton radio2A, radio2B, radio2C, radio2D, radio3A, radio3B, radio3C, radio3D,
            radio5A, radio5B, radio5C, radio5D, radio7A, radio7B, radio7C, radio7D,
            radio9A, radio9B, radio9C, radio9D;
    Button showAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display();
        showAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quizApp = new Intent(getApplicationContext(),SecondClass.class);
                startActivity(quizApp);
            }
        });
    }

    public void display() {
        check1A = (CheckBox) findViewById(R.id.checkBox1A);
        check1B = (CheckBox) findViewById(R.id.checkBox1B);
        check1C = (CheckBox) findViewById(R.id.checkBox1C);
        check1D = (CheckBox) findViewById(R.id.checkBox1D);
        radio2A = (RadioButton) findViewById(R.id.radioBox2A);
        radio2B = (RadioButton) findViewById(R.id.radioBox2B);
        radio2C = (RadioButton) findViewById(R.id.radioBox2C);
        radio2D = (RadioButton) findViewById(R.id.radioBox2D);
        radio3A = (RadioButton) findViewById(R.id.radioBox3A);
        radio3B = (RadioButton) findViewById(R.id.radioBox3B);
        radio3C = (RadioButton) findViewById(R.id.radioBox3C);
        radio3D = (RadioButton) findViewById(R.id.radioBox3D);
        check4A = (CheckBox) findViewById(R.id.checkBox4A);
        check4B = (CheckBox) findViewById(R.id.checkBox4B);
        check4C = (CheckBox) findViewById(R.id.checkBox4C);
        check4D = (CheckBox) findViewById(R.id.checkBox4D);
        radio5A = (RadioButton) findViewById(R.id.radioBox5A);
        radio5B = (RadioButton) findViewById(R.id.radioBox5B);
        radio5C = (RadioButton) findViewById(R.id.radioBox5C);
        radio5D = (RadioButton) findViewById(R.id.radioBox5D);
        check6A = (CheckBox) findViewById(R.id.checkBox6A);
        check6B = (CheckBox) findViewById(R.id.checkBox6B);
        check6C = (CheckBox) findViewById(R.id.checkBox6C);
        check6D = (CheckBox) findViewById(R.id.checkBox6D);
        radio7A = (RadioButton) findViewById(R.id.radioBox7A);
        radio7B = (RadioButton) findViewById(R.id.radioBox7B);
        radio7C = (RadioButton) findViewById(R.id.radioBox7C);
        radio7D = (RadioButton) findViewById(R.id.radioBox7D);
        check8A = (CheckBox) findViewById(R.id.checkBox8A);
        check8B = (CheckBox) findViewById(R.id.checkBox8B);
        check8C = (CheckBox) findViewById(R.id.checkBox8C);
        check8D = (CheckBox) findViewById(R.id.checkBox8D);
        radio9A = (RadioButton) findViewById(R.id.radioBox9A);
        radio9B = (RadioButton) findViewById(R.id.radioBox9B);
        radio9C = (RadioButton) findViewById(R.id.radioBox9C);
        radio9D = (RadioButton) findViewById(R.id.radioBox9D);
        showAnswer = (Button) findViewById(R.id.showAns);

    }

    public void submitQuiz(View view) {
        int message = 0;
        String mess = "TotalScore ";
        String messa = " out of 9";

        if (check1A.isChecked() && check1B.isChecked() && check1C.isChecked() && check1D.isChecked()) {
            message = message - 1;
        } else if (check1B.isChecked() || check1C.isChecked() || check1D.isChecked()) {
            message = message - 1;
        } else if (check1A.isChecked()) {
            message = message + 1;
        }

        if (radio2A.isChecked() || radio2B.isChecked() || radio2D.isChecked()) {
            message = message - 1;
        } else if (radio2C.isChecked()) {
            message = message + 1;
        }
        if (radio3A.isChecked() || radio3B.isChecked() || radio3C.isChecked()) {
            message = message - 1;
        } else if (radio3D.isChecked()) {
            message = message + 1;
        }
        if (check4A.isChecked() && check4B.isChecked() && check4C.isChecked() && check4D.isChecked()) {
            message = message - 1;
        } else if (check4B.isChecked() || check4C.isChecked() || check4D.isChecked()) {
            message = message - 1;
        } else if (check4A.isChecked()) {
            message = message + 1;
        }
        if (radio5A.isChecked() || radio5D.isChecked() || radio5C.isChecked()) {
            message = message - 1;
        } else if (radio5B.isChecked()) {
            message = message + 1;
        }
        if (check6A.isChecked() && check6B.isChecked() && check6C.isChecked() && check6D.isChecked()) {
            message = message - 1;
        } else if (check6A.isChecked() || check6B.isChecked() || check6C.isChecked()) {
            message = message - 1;
        } else if (check6D.isChecked()) {
            message = message + 1;
        }
        if (radio7A.isChecked() || radio7D.isChecked() || radio7B.isChecked()) {
            message = message - 1;
        } else if (radio7C.isChecked()) {
            message = message + 1;
        }
        if (check8A.isChecked() && check8B.isChecked() && check8C.isChecked() && check8D.isChecked()) {
            message = message - 1;
        } else if (check8D.isChecked() || check8B.isChecked() || check8C.isChecked()) {
            message = message - 1;
        } else if (check8A.isChecked()) {
            message = message + 1;
        }
        if (radio9A.isChecked() || radio9C.isChecked() || radio9B.isChecked()) {
            message = message - 1;
        } else if (radio9D.isChecked()) {
            message = message + 1;
        }
        showNotification(message, mess, messa);
    }


    public void showNotification(int messageToDisplay, String mess, String messa) {
        Toast.makeText(this, mess + messageToDisplay + messa, Toast.LENGTH_LONG).show();
    }

}
