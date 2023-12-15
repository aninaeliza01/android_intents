package com.example.android_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv=findViewById(R.id.textView);
        String user=getIntent().getStringExtra("name");
        String age=getIntent().getStringExtra("age");
        tv.setText("Hello "+user +" age is "+age);
    }
}