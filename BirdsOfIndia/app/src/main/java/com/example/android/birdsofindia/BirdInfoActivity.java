package com.example.android.birdsofindia;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;



import com.example.android.birdsofindia.adapters.BirdsViewAdapter;
import com.example.android.birdsofindia.models.BirdInfo;

import org.w3c.dom.Text;


/**
 * Created by vardhan on 27-05-2016.
 */
public class BirdInfoActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birdinfo);

        /* fetch context to pass on to the onClickListener in the inner class below */
        final Context context = this;

        /** fetch the BIRD_SPEC extra passed to this activity from ExploreTypesActivity */
        Bundle bundle = getIntent().getExtras();
        int birdSpec = bundle.getInt(BirdsViewAdapter.EXTRA_BIRD_SPEC);

        /* fetch the info the bird based on the birdType global and the passed BIRD_SPEC */
        final BirdInfo birdInfo = ExploreTypesActivity.birds[ExploreTypesActivity.birdType][birdSpec];
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

    /**
     * Toast to show info about the extinction abbrevs
     * @param v
     */
    public void extinctionToast(View v) {
        String extMsg = "Conservation status legend\nEX: Extinct\nEW:Extinct in the wild\nCR: Critically endangered\n"+
                "EN: Endangered\nVU: Vulnerable\nNT: Near Threatened\nLC: Least Concern";
        Toast.makeText(getApplicationContext(), extMsg, Toast.LENGTH_LONG).show();
    }
}