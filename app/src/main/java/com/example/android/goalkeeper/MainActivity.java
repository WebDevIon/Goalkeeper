package com.example.android.goalkeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    TextView scoreViewTeamA;
    TextView foulViewTeamA;
    TextView scoreViewTeamB;
    TextView foulViewTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreViewTeamA = (TextView) findViewById(R.id.points_team_a);
        foulViewTeamA = (TextView) findViewById(R.id.fouls_team_a);
        scoreViewTeamB = (TextView) findViewById(R.id.points_team_b);
        foulViewTeamB = (TextView) findViewById(R.id.fouls_team_b);
    }

    /*
    *Display the score for team A
     */
    public void displayScoreTeamA (int score){
        scoreViewTeamA.setText(String.valueOf(score));
    }

    /*
        *Display the fouls for team A
         */
    public void displayFoulTeamA (int foul){
        foulViewTeamA.setText(String.valueOf(foul));
    }

    /*
        *Increase the score for team A
         */
    public void setScoreTeamA (View view){
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }

    /*
        *Increase the fouls for team A
         */
    public void setFoulTeamA (View view){
        foulTeamA = foulTeamA + 1;
        displayFoulTeamA(foulTeamA);
    }

    /*
    *Display the score for team B
     */
    public void displayScoreTeamB (int score){
        scoreViewTeamB.setText(String.valueOf(score));
    }

    /*
    *Display the fouls for team B
     */
    public void displayFoulTeamB (int foul){
        foulViewTeamB.setText(String.valueOf(foul));
    }

    /*
    *Increase the score for team B
     */
    public void setScoreTeamB (View view){
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }

    /*
    *Increase the fouls for team B
     */
    public void setFoulTeamB (View view){
        foulTeamB = foulTeamB + 1;
        displayFoulTeamB(foulTeamB);
    }


    /*
    *Resets the score and the fouls for both teams
     */
    public void resetAll (View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayFoulTeamA(foulTeamA);
        displayFoulTeamB(foulTeamB);
    }

    /*
    *Save UI state changes to the savedInstanceState.
     */
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt("scoreA", scoreTeamA);
        savedInstanceState.putInt("scoreB", scoreTeamB);
        savedInstanceState.putInt("foulA", foulTeamA);
        savedInstanceState.putInt("foulB", foulTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }

    /*
     *Restore UI state from the savedInstanceState.
     */
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        scoreTeamA = savedInstanceState.getInt("scoreA");
        scoreTeamB = savedInstanceState.getInt("scoreB");
        foulTeamA = savedInstanceState.getInt("foulA");
        foulTeamB = savedInstanceState.getInt("foulB");
    }

}
