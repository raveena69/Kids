package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vehicle extends AppCompatActivity {

    Button vehiclebutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle);

        vehiclebutton =findViewById(R.id.vehiclebutton);


       vehiclebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(vehicle.this,vehicleAnswer.class);
                startActivity(intent);
            }
        });




    }
}