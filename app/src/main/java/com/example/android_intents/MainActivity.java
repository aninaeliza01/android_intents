package com.example.android_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.et1);
        age=findViewById(R.id.et2);
    }
    public void intent(View view){
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("name",name.getText().toString());
        intent.putExtra("age",age.getText().toString());
        startActivity(intent);
    }
}