package com.google.codelabs.mdc.java.shrine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.google.codelabs.mdc.java.shrine.network.ImageRequester;

public class DetailActivity extends AppCompatActivity {

    //constructor for images
    ImageRequester imageRequester = new ImageRequester();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView titulo = (TextView)findViewById(R.id.product_title);
        TextView precio = (TextView)findViewById(R.id.product_price);
        NetworkImageView product = findViewById(R.id.product_image);
        Intent i = getIntent();
        String titulo1 = i.getStringExtra("titulo");

        titulo.setText(titulo1);
        String precio1 = i.getStringExtra("precio");
        precio.setText(precio1);

        String url = i.getStringExtra("url");
        imageRequester.setImageFromUrl(product, url);
        imageRequester = ImageRequester.getInstance();

    }
}