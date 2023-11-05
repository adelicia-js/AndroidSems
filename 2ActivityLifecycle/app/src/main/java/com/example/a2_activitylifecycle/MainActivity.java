package com.example.a2_activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Activity_Lifecycle", "onCreate invoked!");
        Toast.makeText(MainActivity.this, "Created", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity_Lifecycle", "onStart invoked!");
        Toast.makeText(MainActivity.this, "Started", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity_Lifecycle", "onResume invoked!");
        Toast.makeText(MainActivity.this, "Resumed", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity_Lifecycle", "onPause invoked!");
        Toast.makeText(MainActivity.this, "Paused", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity_Lifecycle", "onStop invoked!");
        Toast.makeText(MainActivity.this, "Stopped", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity_Lifecycle", "onRestart invoked!");
        Toast.makeText(MainActivity.this, "Restarted", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity_Lifecycle", "onDestroy invoked!");
        Toast.makeText(MainActivity.this, "Destroyed", Toast.LENGTH_LONG).show();
    }
}