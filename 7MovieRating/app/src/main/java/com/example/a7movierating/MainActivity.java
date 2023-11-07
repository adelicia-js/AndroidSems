package com.example.a7movierating;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = findViewById(R.id.submit_btn);
        submit.setOnClickListener(v->{
            Intent intent = new Intent(getBaseContext(), MovieReview.class);
            startActivity(intent);
        });
    }
}