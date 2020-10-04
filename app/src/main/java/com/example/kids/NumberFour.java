package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_four);

        final MediaPlayer soundFour = MediaPlayer.create(this, R.raw.play4);

        Button playFour = (Button) this.findViewById(R.id.btnPlayFour);

        playFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundFour.start();
            }
        });

    }
}