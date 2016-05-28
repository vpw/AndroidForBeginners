package com.example.android.birdsofindia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Launches the Explore view
     * @param view
     */
    public void explore(View view) {
        Intent intent = new Intent(this, ExploreActivity.class);
        startActivity(intent);
    }

    /**
     * TODO - next version
     * @param view
     */
//    public void search(View view) {
//        Intent intent = new Intent(this, SearchActivity.class);
//        startActivity(intent);
//    }
//

    /**
     * TODO - next version
     * @param view
     */
    public void quiz(View view) {
//        Intent intent = new Intent(this, QuizActivity.class);
//        startActivity(intent);
    }

    /**
     * Launch the About screen
     * @param view
     */
    public void aboutUs(View view) {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
    }
}
