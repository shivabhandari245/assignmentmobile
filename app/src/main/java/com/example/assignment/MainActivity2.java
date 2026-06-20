package com.example.assignment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    TextView result;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        result = findViewById(R.id.result);
        back = findViewById(R.id.back);

        String name = getIntent().getStringExtra("name");

        String email = getIntent().getStringExtra("email");

        result.setText("Name: " + name + "\nEmail: " + email);

        back.setOnClickListener(v -> finish());
    }
}