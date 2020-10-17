package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Mypicture extends AppCompatActivity {
    TextView ctext1,ftext2,fatext4,atext5,Vtext3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypicture);

       ctext1 =findViewById(R.id.ctext1);
       ftext2 =findViewById(R.id.ftext2);
       fatext4 =findViewById(R.id.fatext4);
       atext5 =findViewById(R.id.atext5);
       Vtext3 =findViewById(R.id.Vtext3);

        ctext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mypicture.this,colour.class);
                startActivity(intent);
            }
        });

        ftext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mypicture.this,flower.class);
                startActivity(intent);
            }
        });
        fatext4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mypicture.this,family.class);
                startActivity(intent);
            }
        });
        atext5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mypicture.this,Animals.class);
                startActivity(intent);
            }
        });
      Vtext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Mypicture.this,vehicle.class);
                startActivity(intent);
            }
        });
    }
}