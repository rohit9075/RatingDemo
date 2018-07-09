package com.rohit.ratingdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private RatingBar mRatingbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRatingbar = findViewById(R.id.ratingBar);
        mRatingbar.setOnClickListener(this);

        Button mButtonShowRating = findViewById(R.id.button);
        mButtonShowRating.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.button){
            String rating=String.valueOf(mRatingbar.getRating());
            Toast.makeText(this, rating, Toast.LENGTH_SHORT).show();
        }

        }
}
