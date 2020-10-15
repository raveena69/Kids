package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Flowers extends AppCompatActivity {
    EditText inputflower1 ,inputflower2 ,inputflower3 ,inputflower4 ,inputflower5;
    Button flowerbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers);

        inputflower1= findViewById(R.id.inputcolour1);
        inputflower2= findViewById(R.id.inputcolour2);
        inputflower3= findViewById(R.id.inputcolour3);
        inputflower4= findViewById(R.id.inputcolour4);
        inputflower5= findViewById(R.id.inputcolour5);
        flowerbutton= findViewById(R.id.flowerbutton);



        flowerbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Flowers.this,FlowerAnswer.class);
                startActivity(intent);


            }


        });



    }
}