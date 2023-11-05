package com.example.a4_intents;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button explicitBtn = findViewById(R.id.explicit_btn);

        Button implicitBtn = findViewById(R.id.implicit_btn);

        explicitBtn.setOnClickListener(v -> {
            Intent explicitIntent = new Intent(getBaseContext(), Redirected.class);
            startActivity(explicitIntent);
        });

        implicitBtn.setOnClickListener(v -> {
            Intent implicitIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/GitHub"));
            startActivity(implicitIntent);
        });

        Toast.makeText(getApplicationContext(), "Welcome home!", Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "Leaving home :(", Toast.LENGTH_LONG).show();
    }
}