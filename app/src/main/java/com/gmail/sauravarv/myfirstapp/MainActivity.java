package com.gmail.sauravarv.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    EditText et1, et2;
    Button b;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText)findViewById(R.id.et1);
        et2 = (EditText)findViewById(R.id.et2);
        b = (Button)findViewById(R.id.b1);
        tv = (TextView)findViewById(R.id.tv3);
    }

    public void add(View v)
    {
        double i = Double.parseDouble(et1.getText().toString());
        double j = Double.parseDouble(et2.getText().toString());
        double k = i + j;
        tv.setText("Sum = " + k);
    }

}