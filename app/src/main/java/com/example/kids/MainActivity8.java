package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity8 extends AppCompatActivity {

    EditText txtName;
    Button save,button1,delete;
    DatabaseReference dbRef;
    FindImage fnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);


        txtName=findViewById(R.id.editTextTextPersonName6);
        save=findViewById(R.id.button65);
        delete=findViewById(R.id.button67);

        fnd =new FindImage();

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                dbRef= FirebaseDatabase.getInstance().getReference().child("FindImage").child("fnd1");
                dbRef.removeValue();
                Toast.makeText(getApplicationContext(),"Deleted Succesfully",Toast.LENGTH_SHORT).show();
            }
        });


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dbRef= FirebaseDatabase.getInstance().getReference().child("FindImage");
                try{

                    if(TextUtils.isEmpty(txtName.getText().toString()))
                        Toast.makeText(getApplicationContext(),"empty",Toast.LENGTH_SHORT).show();


                    else{

                        fnd.setName(txtName.getText().toString().trim());
                        dbRef.child("fnd1").setValue(fnd);
                    }

                }
                catch(NumberFormatException nfe){

                    Toast.makeText(getApplicationContext(),"invalid",Toast.LENGTH_SHORT).show();
                }

            }
        });




    }
}