package com.example.p7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ex1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);

        Button button1 = findViewById(R.id.button4);
        EditText urllink = findViewById(R.id.urlsite);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String websitego = urllink.getText().toString();
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://" + websitego));
                startActivity(intent);

            }
        });


    }
}