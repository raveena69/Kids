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

public class SColours extends AppCompatActivity {


    EditText inputcolour1,inputcolour2,inputcolour3,inputcolour4,inputcolour5;
    Button colourbutton;
    DatabaseReference  reff;
    Colour colour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_colours);


        inputcolour1=findViewById(R.id.inputcolour1);
        inputcolour2=findViewById(R.id.inputcolour2);
        inputcolour3=findViewById(R.id.inputcolour3);
        inputcolour4=findViewById(R.id.inputcolour4);
        inputcolour5=findViewById(R.id.inputcolour5);
        colourbutton =findViewById(R.id.colourbutton);
        colour= new Colour();
        reff = FirebaseDatabase.getInstance().getReference().child("Colour");

        colourbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(SColours.this,SChecking.class);
                startActivity(intent);

                colour.setRed(inputcolour1.getText().toString().trim());
                colour.setGreen(inputcolour2.getText().toString().trim());
                colour.setBlue(inputcolour3.getText().toString().trim());
                colour.setPink(inputcolour4.getText().toString().trim());
                colour.setYellow(inputcolour5.getText().toString().trim());
                reff.push().setValue(colour);
                Toast.makeText(SColours.this,"data insert successfully",Toast.LENGTH_LONG).show();

            }
        });

    }
}