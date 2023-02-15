package com.example.p7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ex4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);


        TextView resultView = findViewById(R.id.textViewans);

        Intent intent = getIntent();
        int factorial = intent.getIntExtra("factorial", 0);
        resultView.setText("Factorial: " + factorial);
    }
}