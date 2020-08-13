package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        txt = findViewById(R.id.next_txt);

        String t = getIntent().getStringExtra("key");
        txt.setText(t);
    }
}