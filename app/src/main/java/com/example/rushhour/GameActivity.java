package com.example.rushhour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GameActivity extends AppCompatActivity {
    TextView tvLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BoardGame boardGame = new BoardGame(this);
        setContentView(boardGame);
        int position = getIntent().getExtras().getInt("position",0);
        tvLevel = findViewById(R.id.tvLevel);

        //ofek is good
        //ofek is better

    }





}