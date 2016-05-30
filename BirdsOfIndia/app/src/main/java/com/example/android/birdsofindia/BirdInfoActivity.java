package com.example.android.birdsofindia;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.android.birdsofindia.adapters.BirdsViewAdapter;
import com.example.android.birdsofindia.models.BirdInfo;

import org.w3c.dom.Text;


/**
 * Created by vardhan on 27-05-2016.
 * This activity can be triggered either from:
 * 1. The explore types activity or
 * 2. From the Quiz activity - to show the answer
 */
public class BirdInfoActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birdinfo);

        /* fetch context to pass on to the onClickListener in the inner class below */
        final Context context = this;


        Bundle bundle = getIntent().getExtras();

        /* fetch the IS_QUIZ_TRIGGER extra passed to this activity from ExploreTypesActivity */
        boolean isQuizTrigger = bundle.getBoolean(MainActivity.EXTRA_IS_QUIZ_TRIGGER);

        if (isQuizTrigger) {
            /* in this case, modify the layout to the quiz answer format */
            quizActions(context);
            return;
        }

        /* fetch the BIRD_SPEC extra passed to this activity from ExploreTypesActivity */
        int birdSpec = bundle.getInt(BirdsViewAdapter.EXTRA_BIRD_SPEC);

        /* fetch the info the bird based on the birdType global and the passed BIRD_SPEC */
        final BirdInfo birdInfo = MainActivity.birds[MainActivity.birdType][birdSpec];
        /* set the view parameters based on the data object */
        ImageView image = (ImageView) findViewById(R.id.bird_info_image);
        TextView common = (TextView) findViewById(R.id.common_name);
        TextView sci = (TextView) findViewById(R.id.sci_name);
        TextView desc = (TextView) findViewById(R.id.desc);
        ImageView extImage = (ImageView) findViewById(R.id.ext_img);
        TextView url = (TextView) findViewById(R.id.bird_url);

        image.setImageResource(birdInfo.imgId);
        common.setText(birdInfo.name);
        sci.setText(birdInfo.sciName);
        desc.setText(birdInfo.desc);
        extImage.setImageResource(birdInfo.extImgId);
        url.setText(birdInfo.url);
        Linkify.addLinks(url, Linkify.WEB_URLS);

        /* FAB for the sound */
        FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.FAB);
        myFab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /* media player, opens the sound for the bird */
                MediaPlayer mediaPlayer = MediaPlayer.create(context, getResources().getIdentifier(birdInfo.sound, "raw", getPackageName()));
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mediaPlayer.start();
            }
        });
    }

    public void quizActions(final Context context) {

        /* remove the image view from layout */

        ImageView image = (ImageView) findViewById(R.id.bird_info_image);
        ViewGroup vg = (ViewGroup) (image.getParent());
        vg.removeView(image);

        /* add the next quiz button to layout */
        Button nextQuiz = new Button(this);
        nextQuiz.setText("Got it!\nShow Next.");
        nextQuiz.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(context, QuizActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        nextQuiz.setTextColor(ContextCompat.getColor(context,R.color.primary_text));
        nextQuiz.setBackgroundColor(ContextCompat.getColor(context,R.color.primary_dark));
        vg.addView(nextQuiz);

        /* remove the sample text view from the layout */
        TextView sample = (TextView) findViewById(R.id.sampleTxt);
        vg = (ViewGroup) (sample.getParent());
        vg.removeView(sample);

        /* remove the floating action button from the layout */
        FloatingActionButton myFab = (FloatingActionButton) findViewById(R.id.FAB);
        vg = (ViewGroup) (myFab.getParent());
        vg.removeView(myFab);

        /* set the remaining views based on the selected birdInfo in QuizAcivity */
        TextView common = (TextView) findViewById(R.id.common_name);
        TextView sci = (TextView) findViewById(R.id.sci_name);
        TextView desc = (TextView) findViewById(R.id.desc);
        ImageView extImage = (ImageView) findViewById(R.id.ext_img);
        TextView url = (TextView) findViewById(R.id.bird_url);

        BirdInfo bInfo = QuizActivity.bInfo;
        common.setText(bInfo.name);
        sci.setText(bInfo.sciName);
        desc.setText(bInfo.desc);
        extImage.setImageResource(bInfo.extImgId);
        url.setText(bInfo.url);
        Linkify.addLinks(url, Linkify.WEB_URLS);

    }

    /**
     * Toast to show info about the extinction abbrevs
     *
     * @param v
     */
    public void extinctionToast(View v) {
        String extMsg = "Conservation status legend\nEX: Extinct\nEW:Extinct in the wild\nCR: Critically endangered\n" +
                "EN: Endangered\nVU: Vulnerable\nNT: Near Threatened\nLC: Least Concern";
        Toast.makeText(getApplicationContext(), extMsg, Toast.LENGTH_LONG).show();
    }
}