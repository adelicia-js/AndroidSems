package com.example.a8_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = findViewById(R.id.add_btn);
        Button subBtn = findViewById(R.id.sub_btn);
        Button mulBtn = findViewById(R.id.mul_btn);
        Button divBtn = findViewById(R.id.div_btn);

        addBtn.setOnClickListener(this);
        subBtn.setOnClickListener(this);
        mulBtn.setOnClickListener(this);
        divBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        EditText numOne = findViewById(R.id.number1_input);
        EditText numTwo = findViewById(R.id.number2_input);
        TextView resultView = findViewById(R.id.result);
        float num1;
        float num2;
        float result = 0;
        String operator = "";

        if(TextUtils.isEmpty(numOne.getText().toString()) || TextUtils.isEmpty(numTwo.getText().toString()))
            return;
        else {

            num1 = Float.parseFloat(numOne.getText().toString());

            num2 = Float.parseFloat(numTwo.getText().toString());

            int id = v.getId();

            if(id==R.id.add_btn) {
                operator = "+";
                result = num1 + num2;
            } else if(id==R.id.sub_btn) {
                operator = "-";
                result = num1 - num2;
            } else if(id==R.id.mul_btn) {
                operator = "*";
                result = num1 * num2;
            } else if(id==R.id.div_btn) {
                operator = "/";
                result = num1 / num2;
            }
        }
        String resultStr = num1 + " " + operator + " " + num2 + " = " + result;
        resultView.setText(resultStr);
    }
}