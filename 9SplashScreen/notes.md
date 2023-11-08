1. Add a image to `app/main/res/drawable`

2. Create a second activity, `activity_splash.xml`

3. Swap out the MainActivity with SplashActivity in `AndroidManifest.xml` as the LAUNCHER activity

4. Insert the image in an ImageView

        <ImageView
            <!-- other styles -->
            android:src="@drawable/img_name"   
        />

5. Packages to import:
    - android.os.Handler
    - android.content.Intent

6. Set up splash screen

            Handler handler = new Handler();

            handler.postDelayed(new Runnable(){
        
        @Override
        public void run(){   
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            
            startActivity(intent);
            
            finish();
        }}, 3000);
    
[Back to Index](../README.md)
