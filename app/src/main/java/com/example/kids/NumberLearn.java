package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberLearn extends AppCompatActivity {


    private Button btnOne;
    private Button btnTwo;
    private Button btnThree;
    private Button btnFour;
    private Button btnFive;
    private Button btnSix;
    private Button btnSeven;
    private Button btnEight;
    private Button btnNine;
    private Button btnTen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_learn);

        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnTen = (Button) findViewById(R.id.btnTen);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumberOneAct();
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumberTwoAct();
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumberThreeAct();
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumberFourAct();
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumberFiveAct();
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumberSixAct();
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumberSevenAct();
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumberEightAct();
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumberNineAct();
            }
        });

        btnTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNumberTenAct();
            }
        });



    }

    public void openNumberOneAct(){
        Intent intent = new Intent(this,NumberOne.class);
        startActivity(intent);
    }

    public void openNumberTwoAct (){
        Intent intent = new Intent(this, NumberTwo.class);
        startActivity(intent);
    }
    public void openNumberThreeAct (){
        Intent intent = new Intent(this, NumberThree.class);
        startActivity(intent);
    }
    public void openNumberFourAct (){
        Intent intent = new Intent(this, NumberFour.class);
        startActivity(intent);
    }
    public void openNumberFiveAct (){
        Intent intent = new Intent(this, NumberFive.class);
        startActivity(intent);
    }
    public void openNumberSixAct (){
       Intent intent = new Intent(this, NumberSix.class);
       startActivity(intent);
    }
    public void openNumberSevenAct (){
        Intent intent = new Intent(this, NumberSeven.class);
        startActivity(intent);
    }
    public void openNumberEightAct (){
        Intent intent = new Intent(this, NumberEight.class);
        startActivity(intent);
    }
    public void openNumberNineAct (){
       // Intent intent = new Intent(this, NumberNine.class);
      //  startActivity(intent);
    }
    public void openNumberTenAct (){
        //Intent intent = new Intent(this, NumberTen.class);
       // startActivity(intent);
    }



}