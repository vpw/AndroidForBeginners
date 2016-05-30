package com.example.android.birdsofindia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.android.birdsofindia.R;
import com.example.android.birdsofindia.adapters.BirdsViewAdapter;
import com.example.android.birdsofindia.models.BirdInfo;

import java.util.ArrayList;
import java.util.List;

public class ExploreTypesActivity extends AppCompatActivity {

    static final String EXTRA_BIRD_TYPE = "com.example.android.birdsofindia.EXTRA_BIRDTYPE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore_types);

        /**
         * Get the passed extra - BIRD_TYPE
         */
        Bundle bundle = getIntent().getExtras();
        MainActivity.birdType = bundle.getInt(ExploreActivity.EXTRA_BIRD_TYPE);

        /**
         * Get the reference of the {@link RecyclerView } inside {@link R.layout.activity_explore_types}
         */
        RecyclerView birdsRecyclerView = (RecyclerView) findViewById(R.id.list_view);

        if (birdsRecyclerView != null) {

            // fetch the list of birds based on the birdType
            List<BirdInfo> birds = getBirds(MainActivity.birdType);

            /**
             * Create an {@link Adapter} to control {@link birdsRecyclerView}
             */
            BirdsViewAdapter birdsAdapter = new BirdsViewAdapter(birds);

            /**
             * Set the {@link Adapter} to {@link birdsRecyclerView}
             */
            birdsRecyclerView.setAdapter(birdsAdapter);

            birdsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        }

    }

    /**
     * Based on the birdType get the list of birds from the @link birds array
     *
     * @param birdType
     * @return
     */
    public List<BirdInfo> getBirds(int birdType) {

        List<BirdInfo> birdInfoList = new ArrayList<>();

        for (int i = 0; i < MainActivity.birds[birdType].length; i++)
            birdInfoList.add(new BirdInfo(MainActivity.birds[birdType][i]));

        return birdInfoList;
    }
}
