package com.example.a12_menus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.school_menu, menu);
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if(itemId==R.id.bdaSJU){
            Toast.makeText(this, "BDA", Toast.LENGTH_LONG).show();
            return true;
        }
        else if(itemId==R.id.csSJU){
            Toast.makeText(this, "CS", Toast.LENGTH_LONG).show();
            return true;
        }
        else if(itemId==R.id.phySJU){
            Toast.makeText(this, "Physics", Toast.LENGTH_LONG).show();
            return true;
        }
        else if(itemId==R.id.mathSJU){
            Toast.makeText(this, "Math", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}