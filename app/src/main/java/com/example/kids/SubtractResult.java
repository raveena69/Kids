package com.example.kids;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class SubtractResult extends AppCompatActivity {



    ListView listView;
    DatabaseReference reff;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;
    SubtractTable subTable;
    Button btnDelSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtract_result);

        subTable = new SubtractTable();
        listView =(ListView) findViewById(R.id.subListView);
        btnDelSub=(Button)findViewById(R.id.btnDeleteSubRes);
        reff = FirebaseDatabase.getInstance().getReference().child("SubtractTable");
        list = new ArrayList<>();
        adapter =new ArrayAdapter<String>(this,R.layout.subresult_row,R.id.subResult,list);


        btnDelSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDeleteDataDialog();
            }
        });


        reff.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds: snapshot.getChildren()){

                    String res;
                    subTable =ds.getValue(SubtractTable.class);
                    String num1 = Integer.toString(subTable.getSubtractNum1());
                    String num2 = Integer.toString(subTable.getSubtractNum2());
                    String userans = Integer.toString(subTable.getUserAnswer());
                    String correctans = Integer.toString(subTable.getCorrectAnswer());
                    if (subTable.isResult()==true){
                        res= "Correct";
                    }else {
                        res = "Incorrect";
                    }
                    list.add("Maths Question        :   "+ num1 + " - "+num2+ "\n"
                            +"User Answer              :   "+userans+"\n"
                            +"Correct Answer         :   "+correctans+"\n"
                            +"Result                          :   "+res);

                }
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



    }

    private void showDeleteDataDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(SubtractResult.this);
        builder.setTitle("Clear Stats");
        builder.setMessage("Are you Sure to Clear the Stats");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                reff.setValue(null);
                Toast.makeText(SubtractResult.this, "Stats Cleared Successfuly", Toast.LENGTH_SHORT).show();
                Intent refresh = getIntent();
                finish();
                startActivity(refresh);
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



}