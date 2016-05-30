package com.example.android.birdsofindia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener {

    static final String EXTRA_BIRD_TYPE = "com.example.android.birdsofindia.EXTRA_BIRD_TYPE";
    private TextView[] tViews;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        /**
         * Keep the text views for the bird categories in an array
         */
        tViews = new TextView[7];
        tViews[0] = (TextView) findViewById(R.id.flamText);
        tViews[1] = (TextView) findViewById(R.id.pheaText);
        tViews[2] = (TextView) findViewById(R.id.herText);
        tViews[3] = (TextView) findViewById(R.id.hawkText);
        tViews[4] = (TextView) findViewById(R.id.parText);
        tViews[5] = (TextView) findViewById(R.id.owlText);
        tViews[6] = (TextView) findViewById(R.id.kingText);

        /**
         * Set onClickListener for each
         */
        for (int i = 0; i < 7; i++) {
            tViews[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        /**
         * Intent for next ExploreTypesActivity
         */
        Intent intent = new Intent(this, ExploreTypesActivity.class);

        intent.putExtra(MainActivity.EXTRA_IS_QUIZ_TRIGGER, false);
        /**
         * Depending on the view which was clicked, provide the BIRD_TYPE extra parameter
         * to the next ExploreTypes Activity
         */
        if (v == tViews[0]) {
            Log.d("INDIABIRDS", "Flamingoes!!");
            intent.putExtra(EXTRA_BIRD_TYPE, 0);
        } else if (v == tViews[1]) {
            Log.d("INDIABIRDS", "Pheasants!!");
            intent.putExtra(EXTRA_BIRD_TYPE, 1);
        } else if (v == tViews[2]) {
            Log.d("INDIABIRDS", "Herons!!");
            intent.putExtra(EXTRA_BIRD_TYPE, 2);
        } else if (v == tViews[3]) {
            Log.d("INDIABIRDS", "Hawks!!");
            intent.putExtra(EXTRA_BIRD_TYPE, 3);
        } else if (v == tViews[4]) {
            Log.d("INDIABIRDS", "Parrots!!");
            intent.putExtra(EXTRA_BIRD_TYPE, 4);
        } else if (v == tViews[5]) {
            Log.d("INDIABIRDS", "Owls!!");
            intent.putExtra(EXTRA_BIRD_TYPE, 5);
        } else if (v == tViews[6]) {
            Log.d("INDIABIRDS", "Kingfishers!!");
            intent.putExtra(EXTRA_BIRD_TYPE, 6);
        } else {
            Log.e("INDIABIRDS", "Invalid button!!");
            return;
        }

        startActivity(intent);
    }
}
