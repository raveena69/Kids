package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_three);

        final MediaPlayer soundThree = MediaPlayer.create(this, R.raw.play3);

        Button playThree = (Button) this.findViewById(R.id.btnPlayThree);

        playThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundThree.start();
            }
        });


    }
}