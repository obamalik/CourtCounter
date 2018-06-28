package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA, scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    public void displayForTeamA(int scoreA){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreB){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void incrementAByTwo(View view) {
        //int quantity = 2;
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void incrementBByTwo(View view) {
        //int quantity = 2;
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }


    public void incrementAByThree(View view) {
        //int quantity = 2;
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void incrementBByThree(View view) {
        //int quantity = 2;
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void incrementAFreeThrow(View view) {
        //int quantity = 2;
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void incrementBFreeThrow(View view) {
        //int quantity = 2;
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void resetScore(View view) {
        //int quantity = 2;
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}
