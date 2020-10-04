package com.example.kids;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumberTen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_ten);

        final MediaPlayer soundTen = MediaPlayer.create(this, R.raw.play10);

        Button playTen = (Button) this.findViewById(R.id.btnPlayTen);

        playTen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundTen.start();
            }
        });
    }
}