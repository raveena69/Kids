package com.example.kids;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    DatabaseReference databaseReference;
    List<String> title_list, story_list;
    ArrayAdapter<String> adapter;
    MyStory myStory;

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.comments);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,Comments.class);
                startActivity(intent);


            }
        });

        listView = findViewById(R.id.listView);
        databaseReference= FirebaseDatabase.getInstance().getReference("storybook");
        myStory = new MyStory();
        title_list = new ArrayList<>();
        story_list = new ArrayList<>();
        adapter = new ArrayAdapter<>(this,R.layout.item,R.id.item_txt,title_list);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                title_list.clear();
                story_list.clear();

                for (DataSnapshot ds: dataSnapshot.getChildren()){
                    myStory  = ds.getValue(MyStory.class);
                    if (myStory != null) {
                        title_list.add(myStory.getTitle());
                    }
                    if (myStory != null) {
                        story_list.add(myStory.getStory());
                    }
                }
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent = new Intent(MainActivity.this, NextActivity.class);
                        String p = story_list.get(position);
                        intent.putExtra("key",p);
                        startActivity(intent);
                    }
                });

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}