package com.example.a5_registration;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email = findViewById(R.id.email_input);
        CheckBox update = findViewById(R.id.updates_agree);
        RadioGroup genderGroup = findViewById(R.id.gender);
        Button register = findViewById(R.id.submit_btn);

        register.setOnClickListener(v->{

            String emailStr = email.getText().toString();

            boolean isChecked = update.isChecked();

            String terms = isChecked ? "Yes" : "No";

            int selected = genderGroup.getCheckedRadioButtonId();

            RadioButton genderSelected = findViewById(selected);

            String genderInput = genderSelected != null
                                 ? genderSelected.getText().toString() 
                                 : "";
            String newView = "Your details are:" +"\nEmail:"+ emailStr + "\nGender:" +genderInput+ "\nEmail Updates Enabled:" +terms;

            Toast.makeText(this, "Successful", Toast.LENGTH_LONG).show();
        });
    }
}