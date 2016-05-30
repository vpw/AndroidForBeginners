package com.example.android.birdsofindia;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.android.birdsofindia.models.BirdInfo;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    public static BirdInfo bInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        /* fetch context to pass on to the onClickListener in the inner class below */
        final Context context = this;

        /* generate a random bird reference */
        int bType;
        Random rnd = new Random();
        rnd.setSeed(System.nanoTime());
        bType = rnd.nextInt(7);
        Log.d(getClass().getName(), "bType = " + bType);
        int items = (MainActivity.birds)[bType].length;
        int bItem = rnd.nextInt(items);
        Log.d(getClass().getName(), "bItem = " + bItem);
        bInfo = MainActivity.birds[bType][bItem];

        /* Set the first Quiz screen */
        ImageView qImg = (ImageView) findViewById(R.id.quiz_image);
        qImg.setImageResource(bInfo.imgId);

        FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.FAB);
        myFab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /* media player, opens the sound for the bird */
                MediaPlayer mediaPlayer = MediaPlayer.create(context, getResources().getIdentifier(bInfo.sound, "raw", getPackageName()));
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mediaPlayer.start();
            }
        });

    }

    public void quizAnswer(View v) {
        Intent intent = new Intent(this, BirdInfoActivity.class);

        intent.putExtra(MainActivity.EXTRA_IS_QUIZ_TRIGGER, true);
        startActivity(intent);
    }
}
