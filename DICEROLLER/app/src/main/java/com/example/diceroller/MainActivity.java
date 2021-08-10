package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
public MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img;
        Button b;
        img=findViewById(R.id.img);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min=1;
                int max=6;
                mediaPlayer=MediaPlayer.create(MainActivity.this,R.raw.rolling_dice_sound);
                mediaPlayer.start();
                int random_int=(int)Math.floor(Math.random()*(max-min+1)+min);
                switch(random_int)
                {
                    case 1:
                        img.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        img.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        img.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        img.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        img.setImageResource(R.drawable.dice6);
                        break;

                }
            }
        });
    }
}