package com.example.kids;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Mpictureidentify extends AppCompatActivity {

    TextView text2,text5,text3,text6,text4,text7;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mpictureidentify);

         text2= findViewById(R.id.text2);
        text5   = findViewById(R.id.text5);
        text3   = findViewById(R.id.text3);
        text6 = findViewById(R.id.text6);
        text4   = findViewById(R.id.text4);
        text7   = findViewById(R.id.text7);
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mpictureidentify.this,Mcolours.class);
                startActivity(intent);
            }
        });

        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mpictureidentify.this,NumberDash.class);
                startActivity(intent);
            }
        });

        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mpictureidentify.this,Mpictureidentify.class);
                startActivity(intent);
            }
        });

        text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mpictureidentify.this,MainActivity.class);
                startActivity(intent);
            }
        });

        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mpictureidentify.this,Mflowers.class);
                startActivity(intent);
            }
        });

        text7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mpictureidentify.this,LoginMainActivity.class);
                startActivity(intent);
            }
        });

    }
}