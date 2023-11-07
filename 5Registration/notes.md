1. Using mutiple linear layouts

2. Packages to import:
    - android.widget.Button
    - android.widget.Toast
    - android.widget.CheckBox
    - android.widget.RadioButton
    - android.widget.RadioGroup
    - android.widget.EditView

3. To get Radio Button input

        RadioGroup group = findViewById(R.id.group);
        
        int id = group.geytCheckedRadioButtonId();
        
        RadioButton btnSelected = findViewById(id);

        String btnStr = //if not null
                        btnSelected != null 
                        
                        // then get string
                        ? btnSelected.getText.toString() 
  
                        // else, empty string
                        : "" 


4. To get CheckBox input  

        CheckBox box = findViewById(R.id.box);

        boolean isChecked = box.isChecked();

        String str = isChecked ? "Checked" : "Unchecked";

5. Use Shared Preferences if possible to redirect after sign up.

[Back to Index](../README.md)
