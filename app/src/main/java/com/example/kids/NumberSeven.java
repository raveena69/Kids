package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberSeven extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_seven);

        final MediaPlayer soundSeven = MediaPlayer.create(this, R.raw.play7);

        Button playSeven = (Button) this.findViewById(R.id.btnPlaySeven);

        playSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundSeven.start();
            }
        });
    }
}