package com.example.a13_changestyles;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private int []colors = {Color.RED, Color.BLUE, Color.GREEN};
    private int initial_color = 0;
    TextView countText, colorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countText = findViewById(R.id.counter_text);
    }

    public void countNext(View view){
        counter++;
        countText.setText(Integer.toString(counter));
    }

    public void countPrev(View view){
        counter--;
        countText.setText(Integer.toString(counter));
    }

    public void changeTextColor(View view){
        colorText = findViewById(R.id.color_text);
        colorText.setTextColor(colors[initial_color]);
        initial_color = (initial_color + 1) % colors.length;
    }
}