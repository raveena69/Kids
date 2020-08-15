package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView txt,title1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        txt = findViewById(R.id.next_txt);
        //title1 = findViewById(R.id.next_title);

        //String t1 = getIntent().getStringExtra("key");
        //title1.setText(t1);

        String t = getIntent().getStringExtra("key");
        txt.setText(t);
    }
}