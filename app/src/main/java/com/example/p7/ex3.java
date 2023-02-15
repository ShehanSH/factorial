package com.example.p7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ex3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex3);

        EditText numberInput = findViewById(R.id.fcnum);
        Button factorialButton = findViewById(R.id.button6);

        factorialButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = Integer.parseInt(numberInput.getText().toString());
                int factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }
                Intent intent = new Intent(ex3.this, ex4.class);
                intent.putExtra("factorial", factorial);
                startActivity(intent);
            }
        });
    }
}