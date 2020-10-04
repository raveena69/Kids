package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberFive extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_five);

        final MediaPlayer soundFive = MediaPlayer.create(this, R.raw.play5);

        Button playFive = (Button) this.findViewById(R.id.btnPlayFive);

        playFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundFive.start();
            }
        });
    }
}