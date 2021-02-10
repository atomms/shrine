package com.google.codelabs.mdc.java.shrine;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.toolbox.NetworkImageView;
import com.google.codelabs.mdc.java.shrine.network.ProductEntry;

import java.util.List;

import static java.lang.Thread.sleep;

public class ProductCardViewHolder extends RecyclerView.ViewHolder {

    public List<ProductEntry> productList;
    public List<ProductItem> productItem;
    public NetworkImageView productImage;
    public TextView productTitle;
    public TextView productPrice;


    public ProductCardViewHolder(@NonNull View itemView) {
        super(itemView);
        productImage = itemView.findViewById(R.id.product_image);
        productTitle = itemView.findViewById(R.id.product_title);
        productPrice = itemView.findViewById(R.id.product_price);


    }

}

