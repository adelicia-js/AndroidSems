1. Packages to import:
    - android.content.SharedPreferences
    - android.widget.Button 
    - android.widget.Toast
    - android.widget.EditText
    - android.widget.TextView
    - android.widget.Switch

2. Declare following variables:

        public static final String SHARED_PREFS = "sharedPrefs";

        public static final String TEXT = "text";

        public static final String SWITCH = "switch";

        private String text, name, roll, phone;
        private boolean switchCheck;

        // Create objects for widgets

3. Define objects. 
        
        textBanner = findViewById(R.id.banner);
        editBanner = findViewById(R.id.edit_name);
        
        applyBtn = findViewById(R.id.apply_btn);
        saveBtn = findViewById(R.id.save_btn);
        
        switchSwitch = findViewById(R.id.
        switch_switch);
        
        editName = findViewById(R.id.edit_name);
        editRoll = findViewById(R.id.edit_roll);
        editPhone = findViewById(R.id.edit_phone);

4. Set OnClickListeners for buttons

        applyBtn.setOnClickListener(v->{
            textBanner.setText(editBanner.getText.toString());
        })

        saveBtn.setOnClickListener(v->{
            saveData();
        })
        loadData();
        updateViews();

5. Define methods mentioned above

    (i) `saveData()`
        
        public void saveData() {

            SharedPreferences sf = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
            
            SharedPreferences.Editor editor = sf.edit();

            editor.putString(TEXT, editBanner.getText().toString());

            editor.putBoolean(SWITCH, switchSwitch.isChecked());

            editor.putString("NAME", editName.getText().toString());
            editor.putString("ROLL", editRoll.getText().toString());
            editor.putString("PHONE", editPhone.getText().toString());

            editor.apply();

            Toast.makeToast(this, "Saved", Toast.LENGTH_SHORT).show();
        }

    (ii) `loadData()`

        public void loadData() {

            SharedPreferences sf = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);

            text = sf.getString(TEXT, ""); // key , default value

            switchCheck = sf.getBoolean(SWITCH, false);

            name = sf.getString("NAME", "");
            roll = sf.getString("ROLL", "");
            phone = sf.getString("PHONE", "");

        }


    (iii) `updateViews()`

        public void updateViews() {

            textBanner.setText(text);

            switchSwitch.setChecked(switchCheck);

            editName.setText(name);
            editRoll.setText(roll);
            editPhone.setText(phone);

        }