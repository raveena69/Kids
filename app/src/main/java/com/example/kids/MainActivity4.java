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

public class MainActivity4 extends AppCompatActivity {

    EditText txtName;
    Button save,button1;
    DatabaseReference dbRef;
    FindImage fnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        txtName=findViewById(R.id.editTextTextPersonName);
        save=findViewById(R.id.button57);

         fnd =new FindImage();


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

        button1 = (Button) findViewById(R.id.button58);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(intent);
            }
        });


    }
}