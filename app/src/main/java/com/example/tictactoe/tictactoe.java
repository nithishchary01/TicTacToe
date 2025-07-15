package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class tictactoe extends AppCompatActivity {

    Button button;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tictactoe);

        button = findViewById(R.id.button);
        txt = findViewById(R.id.txt);

        button.setOnClickListener(view -> {
            Intent intent = new Intent(tictactoe.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
