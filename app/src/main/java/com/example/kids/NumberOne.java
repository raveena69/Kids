package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_one);


        final MediaPlayer soundOne = MediaPlayer.create(this, R.raw.play1);

        Button playOne = (Button) this.findViewById(R.id.btnPlayOne);

        playOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundOne.start();
            }
        });

    }
}