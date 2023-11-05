1. Packages to import:
    - android.util.Log
    - android.widget.Toast

2. Methods:
    - onCreate()
    - onStart()
    - onResume()
    - onPause()
    - onStop()
    - onDestroy()

3. Method syntax 

    (i) onCreate()
        
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Log.d("Activity_Lifecycle", "onCreate() was invoked");
            Toast.makeText(MainActivity.this, "onCreate() was invoked", Toast.LENGTH_SHORT).show();    
        }

    (ii) For all, but onCreate()
    
    Example:

        protected void onStart() {
            
            super.onStart();

            // check this in Logcat :)
            Log.d("Activity_Lifecycle", "onStart() was invoked"); 
            
            // will be displayed every time onStart() is called            
            Toast.makeText(MainActivity.this, "onStart() was invoked", Toast.LENGTH_SHORT).show();

        }

[Back to Index](../README.md)
