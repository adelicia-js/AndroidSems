1. Using Relative Layouts

    Centers the image:
    
        android:layout_alignParentTop="true"

        android:layout_alignParentBottom="true"
        
        android:layout_alignParentStart="true"
        
        android:layout_alignParentEnd="true"

2. Packages to import:
    - android.graphics.Bitmap
    - android.graphics.Canvas
    - android.graphics.Color
    - android.graphics.Paint
    - android.graphics.drawable.BitmapDrawable
    - android.widget.ImageView

3. Create a bitmap 

        Bitmap bg = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);

        ImageView iv = findViewById(R.id.graphics);

        iv.setBackground(new BitmapDrawable(this.getResources(), bg));

        Canvas canvas = new Canvas(bg);

        Paint paint = new Paint();

        paint.setTextSize(50);
        paint.setColor(Color.COLOR);

4. Draw on the bitmap

        canvas.drawText("insert label here", x, y, paint);
        
        canvas.drawRect(left, top, right, bottom, paint);

        canvas.drawCircle(x, y, radius, paint);

        canvas.drawLine(x1, y1, x2, y2, paint);

