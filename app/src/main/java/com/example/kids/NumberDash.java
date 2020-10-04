package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberDash extends AppCompatActivity {

    private Button btnNumLearn;
    private Button btnAdd,btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_dash);


        btnNumLearn =(Button) findViewById(R.id.btnNumber);
        btnAdd =(Button) findViewById(R.id.btnAddition);
        btnSub =(Button) findViewById(R.id.btnSubtract);





        btnNumLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //openNumberLearnAct();
                Intent intent = new Intent(NumberDash.this,NumberLearn.class);
                startActivity(intent);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //openAdditionAct();
                Intent intent = new Intent(NumberDash.this,Addition.class);
                startActivity(intent);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //openSubtractAct();
                Intent intent = new Intent(NumberDash.this,Subtract.class);
                startActivity(intent);
            }
        });


    }


    public void openNumberLearnAct(){
        //Intent intent = new Intent(this,NumberLearn.class);
       // startActivity(intent);
    }

    public void openAdditionAct(){
        //Intent intent = new Intent(this,Addition.class);
       // startActivity(intent);
    }

    public void openSubtractAct(){
        //Intent intent = new Intent(this,Subtract.class);
        //startActivity(intent);
    }


}