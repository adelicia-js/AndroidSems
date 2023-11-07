1 - Packages to import:
 - android.widget.Button
 - android.widget.EditText
 - android.widget.TextView
 - android.view.View
 - android.view.View.OnClickListener (interface)
 - android.util.TextUtils

2 - Implement the OnClickListener interface. Create buttons & initialize the onClickListener functions for all operations (+,-,*,/).

    @Override
    public class MainActivity extends AppCompatActivity implements OnClickListener {

        @Override
        protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        Button btn = findViewById(R.id.layout_btn);

        btn.setOnClickListener(this);

        }
        
        //next steps
    }

3 - Define onClick functions for the buttons

    @Override 
    public void onClick(View view) { 

        EditText numOne = findViewById(R.id.num1);

        EditText numTwo = findViewById(R.id.num2);

        float num1, num2;
        
        String operator = ""; 
        // will be used for the result string later
    
        // next steps
    }

4 - Check if EditTexts are empty for num1 & num2

    if(TextUtils.isEmpty(num1.getText().toString()) || TextUtils.isEmpty(num2.getText().toString()) {
        return;
    }
    else {
        //next steps
    }

5 - To parse above inputs to floats for the numbers

    num = Float.parseFloat(numInput.getText().toString());

6 - To get the id of button clicked

    id = view.getId() //v is the view passed earlier

7 - Use a if-else loop to determine the result

8 - Store the result in a string, and pass it to the empty TextView.

    TextView resultView = findViewById(R.id.result);

    resultStr = num1 + oper + num2 + "=" + result;
    
    resultView.setText(resultStr);