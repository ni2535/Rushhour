package com.example.rushhour;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ChooseLevelActivity extends AppCompatActivity implements View.OnClickListener {
    RecyclerView rvLevels;
    LevelsAdapter levelsAdapter;
    TextView tvDifficulty;
    int difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);
        difficulty = getIntent().getExtras().getInt("difficulty");
        init();
    }

    private void init() {
        rvLevels = findViewById(R.id.rvLevels);
        String[] levelsTitles = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};//need to be changed
        rvLevels.setLayoutManager(new LinearLayoutManager(this));
        levelsAdapter = new LevelsAdapter(levelsTitles,this);
        rvLevels.setAdapter(levelsAdapter);
        tvDifficulty = findViewById(R.id.tvDifficulty);
        if (difficulty == 0)
            tvDifficulty.setText("Easy");
        if (difficulty == 1)
            tvDifficulty.setText("Medium");
        if (difficulty == 2)
            tvDifficulty.setText("Difficult");


    }

    @Override
    public void onClick(View view) {
    }
}