package com.example.rushhour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnEasy;
    Button btnMedium;
    Button btnDifficult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        onClickListeners();

    }
    private void init(){
        btnEasy = findViewById(R.id.btnEasy);
        btnMedium = findViewById(R.id.btnMedium);
        btnDifficult= findViewById(R.id.btnDifficult);
    }
    private void onClickListeners(){
        btnEasy.setOnClickListener(this);
        btnMedium.setOnClickListener(this);
        btnDifficult.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view==btnEasy) {
            Intent nextIntent = new Intent(this, ChooseLevelActivity.class);
            nextIntent.putExtra("difficulty",0);
            startActivity(nextIntent);
        }
        if (view==btnMedium) {
            Intent nextIntent = new Intent(this, ChooseLevelActivity.class);
            nextIntent.putExtra("difficulty",1);
            startActivity(nextIntent);
        }
        if (view==btnDifficult) {
            Intent nextIntent = new Intent(this, ChooseLevelActivity.class);
            nextIntent.putExtra("difficulty",2);
            startActivity(nextIntent);
        }
    }
}