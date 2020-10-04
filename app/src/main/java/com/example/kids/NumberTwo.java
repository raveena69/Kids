package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_two);

        final MediaPlayer soundTwo = MediaPlayer.create(this, R.raw.play2);

        Button playTwo = (Button) this.findViewById(R.id.btnPlayTwo);

        playTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundTwo.start();
            }
        });


    }
}