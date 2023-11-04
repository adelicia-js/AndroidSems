package com.example.a1_login;

import androidx.appcompat.app.AppCompatActivity;

//import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText user = findViewById(R.id.user_input);
        EditText pwd = findViewById(R.id.pwd_input);
        Button submit = findViewById(R.id.submit_btn);

        submit.setOnClickListener(v -> {
            String message = "Welcome " + user.getText().toString();
            if(pwd.length()<6) {
                Toast.makeText(MainActivity.this, "Password too short!",Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(MainActivity.this, message,Toast.LENGTH_LONG).show();
            }
        });

//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(pwdInput.length()>6) {
//                    Toast.makeText(MainActivity.this, "Welcome!",Toast.LENGTH_LONG).show();
//                }
//                else {
//                    Toast.makeText(MainActivity.this, "Password too short!",Toast.LENGTH_LONG).show();
//                }
//            }
//        });

    }
}