package com.example.sjcet.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText ed1;
EditText ed2;
Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=(EditText)findViewById(R.id.ed1);
        ed1=(EditText)findViewById(R.id.ed2);
        bt1=(Button)findViewById(R.id.bt1);
        {
            if (ed1.getText()==ed2.getText()==0)
            {

            Intent intent = new Intent(this,nextactivity);
                startActivity(intent);

        }{
        else
            {
                Toast.makeText(this, "username and password is incorrect", Toast.LENGTH_SHORT).show();
            }
        }
    }
}}
