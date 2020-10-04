package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberNine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_nine);

        final MediaPlayer soundNine = MediaPlayer.create(this, R.raw.play9);

        Button playNine = (Button) this.findViewById(R.id.btnPlayNine);

        playNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundNine.start();
            }
        });
    }
}