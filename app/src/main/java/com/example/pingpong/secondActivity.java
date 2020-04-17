package com.example.pingpong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {


    private EditText input;
    private  TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        input = (EditText) findViewById((R.id.editText));
        output = (TextView) findViewById(R.id.textView1);
        Intent i = getIntent();
        output.setText(i.getStringExtra("transported"));
    }


    public void pong(View v){

        String back = input.getText().toString();
        Intent returnIntent = new Intent();
        returnIntent.putExtra("back",back);
        setResult(RESULT_OK,returnIntent);
        finish();

    }
}