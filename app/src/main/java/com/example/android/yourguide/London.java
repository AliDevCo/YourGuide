package com.example.android.yourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class London extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_info);

        ImageView placeImg = (ImageView) findViewById(R.id.placeImg);
        placeImg.setImageResource(R.drawable.london);

        TextView placeLocation = (TextView) findViewById(R.id.placeLocation);
        placeLocation.setText(R.string.londonLocation);
        TextView placePopulation = (TextView) findViewById(R.id.placePopulation);
        placePopulation.setText(R.string.londonPopulation);

    }
}
