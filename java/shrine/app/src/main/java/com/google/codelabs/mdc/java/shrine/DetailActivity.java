package com.google.codelabs.mdc.java.shrine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

//        Open DetailActivity and initialize the ImageView and title TextView in onCreate():

        TextView productTitle = findViewById(R.id.titledetail);
//        ImageView sportsImage = findViewById(R.id.sportsImageDetail);

//        Get the title from the incoming Intent and set it to the TextView:
//        productTitle.setText(getIntent().getStringExtra("title"));
        productTitle.setText("Product Title");

    }
}