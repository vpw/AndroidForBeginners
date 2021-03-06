package com.example.android.courtcounter;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void add1TeamA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    public void add2TeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void add3TeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void add1TeamB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    public void add2TeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void add3TeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view) {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(0);
        displayForTeamB(0);
    }
}
