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

public class ProductCardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

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



        // Set the OnClickListener to the entire view.
            itemView.setOnClickListener(this);
        }

    @Override
    public void onClick(View view) {
//        Toast.makeText(view.getContext(), "ueeeeee" + productList.get(getAdapterPosition()), Toast.LENGTH_SHORT).show();
//        try {
//            sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//      TODO
//        ProductEntry mproductitem = productList.get(getAdapterPosition());
//
////        ProductCardViewHolder mProductData = null;
////        RecyclerView.ViewHolder mProductData = null;
////        ProductItem mProduct = productList.get(getAdapterPosition());
////        int mproductitem = mProductTitle.getAdapterPosition();
//
        Intent detailIntent = new Intent(view.getContext(), DetailActivity.class);
//        detailIntent.putExtra("title", mproductitem.title);

//      TODO
//          detailIntent.putExtra("title", mproductitem.title);
                view.getContext().startActivity(detailIntent);

//
//
////        detailIntent.putExtra("title", (Parcelable) productTitle);
////        detailIntent.putExtra("image_resource",
////                currentSport.getImageResource());
//        view.getContext().startActivity(detailIntent);

    }
}
