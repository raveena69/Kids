package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberSix extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_six);

        final MediaPlayer soundSix = MediaPlayer.create(this, R.raw.play6);

        Button playSix = (Button) this.findViewById(R.id.btnPlaySix);

        playSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundSix.start();
            }
        });
    }
}