package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreA = 0, scoreB = 0, fA, fB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void score3A(View view){
        scoreA = scoreA + 3;
        displayA(scoreA);
        fA = 1;
    }

    public void score2A(View view){
        scoreA = scoreA + 2;
        displayA(scoreA);
        fA = 2;
    }

    public void score1A(View view){
        scoreA = scoreA + 1;
        displayA(scoreA);
        fA = 3;
    }

    public void score3B(View view){
        scoreB = scoreB + 3;
        displayB(scoreB);
        fB = 1;
    }

    public void score2B(View view){
        scoreB = scoreB + 2;
        displayB(scoreB);
        fB = 2;
    }

    public void score1B(View view){
        scoreB = scoreB + 1;
        displayB(scoreB);
        fB = 3;
    }

    public void UndoA(View view){

        switch (fA){
            case 1 : scoreA = scoreA - 3;
                displayA(scoreA);
                break;
            case 2 : scoreA = scoreA - 2;
                displayA(scoreA);
                break;
            case 3 : scoreA = scoreA - 1;
                displayA(scoreA);
                break;
        }

    }

    public void UndoB(View view){

        switch (fB){
            case 1 : scoreB = scoreB - 3;
                displayB(scoreB);
                break;
            case 2 : scoreB = scoreB - 2;
                displayB(scoreB);
                break;
            case 3 : scoreB = scoreB - 1;
                displayB(scoreB);
                break;
        }

    }

    public void Reset(View view){
        scoreA = 0;
        scoreB = 0;
        fA = 0;
        fB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

    private void displayA(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreA);
        if (number < 0){
            quantityTextView.setText("0");
        }
        else
        quantityTextView.setText("" + number);
    }

    private void displayB(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.scoreB);
        if (number < 0) {
            quantityTextView.setText("0");
        }
        else
        quantityTextView.setText("" + number);
    }
}