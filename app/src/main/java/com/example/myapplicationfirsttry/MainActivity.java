package com.example.myapplicationfirsttry;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        Button buttonChangeText = findViewById(R.id.buttonChangeText);

        buttonChangeText.setOnClickListener(v -> {
            textView.setText("Button was clicked!");
        });
        Button buttonChangeColor = findViewById(R.id.buttonChangeColor);

        buttonChangeColor.setOnClickListener(v -> {
            textView.setTextColor(Color.RED);
        });
        Button buttonChangeBackground = findViewById(R.id.buttonChangeBackground);
        buttonChangeBackground.setOnClickListener(v -> {
            findViewById(R.id.main).setBackgroundColor(Color.LTGRAY);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}