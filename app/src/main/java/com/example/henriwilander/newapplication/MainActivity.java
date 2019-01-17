package com.example.henriwilander.newapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.text.TextWatcher;
import android.text.Editable;

public class MainActivity extends Activity {

    TextView text;
    EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        userInput = findViewById(R.id.userInput);

        userInput.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable s) {
                text.setText(userInput.getText());
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // TODO Auto-generated method stub
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // TODO Auto-generated method stub
            }
        });
    }


    public void printText(View v) {
        System.out.println("Hello world!");
    }

}

