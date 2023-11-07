package com.example.a14sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;
import android.widget.Switch;
import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TextView textBanner;
    private EditText editBanner, editName, editRoll, editPhone;
    private Button applyBtn, saveBtn;
    private Switch switchSwitch;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String TEXT = "text";
    public static final String SWITCH = "switch";
    private String text, name, roll, phone;
    private boolean switchCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBanner = findViewById(R.id.banner);
        editBanner = findViewById(R.id.edit_name);
        applyBtn = findViewById(R.id.apply_btn);
        saveBtn = findViewById(R.id.save_btn);
        switchSwitch = findViewById(R.id.switch_switch);
        editName = findViewById(R.id.edit_name);
        editRoll = findViewById(R.id.edit_roll);
        editPhone = findViewById(R.id.edit_phone);

        applyBtn.setOnClickListener(v->{
            textBanner.setText(editBanner.getText().toString());
        });

        saveBtn.setOnClickListener(v->{
            saveData();
        });
        loadData();
        updateViews();
    }

    public void saveData() {

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        SharedPreferences.Editor editor =  sharedPreferences.edit();

        editor.putString(TEXT, editBanner.getText().toString());

        editor.putBoolean(SWITCH, switchSwitch.isChecked());

        editor.putString("NAME", editName.getText().toString());
        editor.putString("ROLL", editRoll.getText().toString());
        editor.putString("PHONE", editPhone.getText().toString());

        editor.apply();

        Toast.makeText(this, "Data saved!", Toast.LENGTH_LONG).show();

    }

    public void loadData() {

        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

        text = sharedPreferences.getString(TEXT, "");

        switchCheck = sharedPreferences.getBoolean(SWITCH, false);

        name = sharedPreferences.getString("NAME","");
        roll = sharedPreferences.getString("ROLL", "");
        phone = sharedPreferences.getString("PHONE", "");

    }
    public void updateViews() {

        textBanner.setText(text);

        switchSwitch.setChecked(switchCheck);

        editName.setText(name);
        editRoll.setText(roll);
        editPhone.setText(phone);

    }
}