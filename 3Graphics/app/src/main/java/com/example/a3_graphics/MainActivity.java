package com.example.a3_graphics;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bitmap bg = Bitmap.createBitmap(720,1280,Bitmap.Config.ARGB_8888);
        ImageView I = findViewById(R.id.graphics);
        I.setBackground(new BitmapDrawable(this.getResources(), bg));
        Canvas canvas = new Canvas(bg);
        Paint paint = new Paint();
        paint.setTextSize(50);
        paint.setColor(Color.BLUE);
        canvas.drawText("Rectangle", 80, 150, paint);
        canvas.drawRect(50,200,350,600, paint);
        paint.setColor(Color.GREEN);
        canvas.drawText("Circle", 480, 150, paint);
        canvas.drawCircle(550,400,150,paint);
        paint.setColor(Color.CYAN);
        canvas.drawText("Square", 120, 800, paint);
        canvas.drawRect(50,850,350,1150,paint);
        paint.setColor(Color.GRAY);
        canvas.drawText("Line", 480, 800, paint);
        canvas.drawLine(520, 850, 620, 1150, paint);
    }
}