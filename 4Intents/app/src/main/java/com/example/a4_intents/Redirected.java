package com.example.a4_intents;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Toast;
import android.widget.Button;
import android.os.Bundle;

public class Redirected extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_redirected);

        Toast.makeText(getApplicationContext(), "What are your INTENTions 🤨", Toast.LENGTH_LONG).show();

        Button homeBtn = findViewById(R.id.home_btn);

        homeBtn.setOnClickListener(v -> {
            Intent goHome = new Intent(getBaseContext(), MainActivity.class);
            startActivity(goHome);
        });

    }
}