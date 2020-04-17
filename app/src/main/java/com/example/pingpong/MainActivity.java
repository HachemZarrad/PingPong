package com.example.pingpong;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView message;
    private EditText input;
    private  TextView confirmation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById((R.id.editText));
        message = (TextView) findViewById(R.id.textView1);
        confirmation = (TextView) findViewById(R.id.textView);
    }


    public void ping(View v){

        String transported = input.getText().toString();
        Intent intent = new Intent(this, secondActivity.class);
        intent.putExtra("transported", transported);
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent i) {
         super.onActivityResult(requestCode, resultCode, i);
         String back = i.getStringExtra("back");
         message.setText(back);
         confirmation.setText("message received");

    }

    //    @Override
//    protected void onResume() {
//        super.onResume();
//        Intent intent = getIntent();
//        message.setText(intent.getStringExtra("back"));
//        confirmation.setText("message received");
//    }
}
