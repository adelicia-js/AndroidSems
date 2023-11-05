1. Using Linear Layouts
    - Set orientation to vertical instead of horizontal.
    - Use layout_margin to space elements.
    - Use layout_gravity to align elements.

2. Packages to import:
    - android.widget.Button
    - android.widget.EditText
    - android.widget.Toast
    - android.view.View
    - android.widget.TextView

3. Use Lambda functions for event listeners:
    
    Example:
        
        btn.setOnClickListener( v -> {
           
           // code to run
        
        });


4. Toast Syntax:

        Toast.makeText(MainActivity.this, "message", Toast.LENGTH_SHORT).show();
        // MainActivity.this is the context (environment ig) 
        // ez