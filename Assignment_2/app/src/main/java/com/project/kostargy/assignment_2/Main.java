package com.project.kostargy.assignment_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class Main extends AppCompatActivity {

    private int scoreA = 0;
    private int scoreB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

    }


    public void threea(View view){
        scoreA+=3;
        updatescreen();
    }

    public void threeb(View view){
        scoreB+=3;
        updatescreen();
    }

    public void twoa(View view){
        scoreA+=2;
        updatescreen();
    }

    public void twob(View view){
        scoreB+=2;
        updatescreen();
    }

    public void freea(View view){
        scoreA+=1;
        updatescreen();
    }

    public void freeb(View view){
        scoreB+=1;
        updatescreen();
    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        updatescreen();
    }

    public void updatescreen(){


        TextView pointsA = (TextView) findViewById(R.id.pointsa);
        TextView pointsB = (TextView) findViewById(R.id.pointsb);
        pointsA.setText(String.valueOf(scoreA));
        pointsB.setText(String.valueOf(scoreB));

    }
}
