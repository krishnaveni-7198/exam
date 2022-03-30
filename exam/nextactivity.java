package com.example.sjcet.myapplication;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Adapter;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.EditText;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.security.PublicKey;

public class nextactivity extends AppCompatActivity {
    TextView Textview4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextactivity);
        Textview4 = (TextView) findViewById(R.id.textView4);
        button = (Button) findViewById(R.id.button);
        String message=getIntent().getStringExtra("my key");
        Textview4.setText("");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(menu.);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
        {
            Switch(getTaskId());
            {
                Case.r.signout:
                {
                    Toast.makeText(this, "sigouted", Toast.LENGTH_SHORT).show();
    }
}
}

}
