package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;

public class Subtract extends AppCompatActivity {

    Button btnSubmit;
    Button btnFinish;
    TextView tvNum1;
    TextView tvNum2;
    EditText etAns;
    DatabaseReference reff;
    SubtractTable subTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtract);

        btnSubmit = (Button) findViewById(R.id.btnSubmitSub);
        btnFinish = (Button)findViewById(R.id.btnFinishSub);
        tvNum1 = (TextView) findViewById(R.id.tvSubNum1);
        tvNum2 = (TextView) findViewById(R.id.tvSubNum2);
        etAns = (EditText) findViewById(R.id.etSubAnswer);
        subTable= new SubtractTable();
        reff= FirebaseDatabase.getInstance().getReference().child("SubtractTable");

        RunReset();



        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String etAnstTest =etAns.getText().toString();
                if (etAnstTest.matches("")){
                    Toast.makeText(Subtract.this, "Please enter the answer and next", Toast.LENGTH_SHORT).show();
                }else {

                    int num1 = Integer.parseInt(tvNum1.getText().toString());
                    int num2 = Integer.parseInt(tvNum2.getText().toString());

                    int ans = num1 - num2;

                    int get_user_ans = Integer.parseInt(etAns.getText().toString());


                    //res++;

                    if (ans== get_user_ans){
                        subTable.setSubtractNum1(num1);
                        subTable.setSubtractNum2(num2);
                        subTable.setCorrectAnswer(ans);
                        subTable.setUserAnswer(get_user_ans);
                        subTable.setResult(true);
                        reff.push().setValue(subTable);
                        Toast.makeText(Subtract.this, "Correct: "+ans, Toast.LENGTH_SHORT).show();
                    }
                    else {
                        subTable.setSubtractNum1(num1);
                        subTable.setSubtractNum2(num2);
                        subTable.setCorrectAnswer(ans);
                        subTable.setUserAnswer(get_user_ans);
                        subTable.setResult(false);
                        reff.push().setValue(subTable);
                        Toast.makeText(Subtract.this, "Incorrect: " + ans, Toast.LENGTH_SHORT).show();
                    }

                    RunReset();
                }

            }
        });



        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishGameDialog();
            }
        });


    }


    public void RunReset(){
        Random rand = new Random();

        int number1 = rand.nextInt(9) +1;
        int number2 = rand.nextInt(9)+1;

        if (number1<number2){
            number1 = number1+number2+2;
        }

        tvNum1.setText(""+number1);
        tvNum2.setText(""+number2);
        etAns.setText("");
    }


    private void finishGameDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(Subtract.this);
        builder.setTitle("Proceed");
        builder.setMessage("Do yo want to finish the quiz");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                openAddResultAct();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.dismiss();
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    public void openAddResultAct(){
        Intent intent = new Intent(this,SubtractResult.class);
        startActivity(intent);
    }


}