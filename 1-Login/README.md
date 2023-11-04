1. Using Linear Layouts
    - Set orientation to vertical instead of horizontal.
    - Use layout_margin to space elements.
    - Use layout_gravity to align elements.

2. Use Lambda functions for event listeners:
    Example:
        ```
        
        btn.setOnClickListener( v -> {
           
           // code to run
        
        });

        ```

3. Toast Syntax:
    ```
    
    Toast.makeText(MainActivity.this, "message", Toast.LENGTH_SHORT).show();
    // MainActivity.this is the context (environment ig) 
    //ez
    
    ```