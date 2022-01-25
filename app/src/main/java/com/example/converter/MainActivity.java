package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText TextNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2=findViewById(R.id.textView2);
        TextNumber = findViewById(R.id.TextNumber);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
             String s=  TextNumber.getText().toString();
             int dollar=Integer.parseInt(s);
             double rupee= dollar * 73.02;
             textView2.setText("dollar in rupee" + rupee);
           }
       });
    }
}