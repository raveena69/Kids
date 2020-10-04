package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberEight extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_eight);

        final MediaPlayer soundEight = MediaPlayer.create(this, R.raw.play8);

        Button playEight = (Button) this.findViewById(R.id.btnPlayEight);

        playEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundEight.start();
            }
        });
    }
}