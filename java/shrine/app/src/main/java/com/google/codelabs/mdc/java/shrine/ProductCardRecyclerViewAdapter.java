package com.google.codelabs.mdc.java.shrine;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.codelabs.mdc.java.shrine.network.ImageRequester;
import com.google.codelabs.mdc.java.shrine.network.ProductEntry;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Adapter used to show a simple grid of products.
 */
public class ProductCardRecyclerViewAdapter extends RecyclerView.Adapter<ProductCardViewHolder> {

    private List<ProductEntry> productList;
    private ImageRequester imageRequester;

    ProductCardRecyclerViewAdapter(List<ProductEntry> productList) {
        this.productList = productList;
        imageRequester = ImageRequester.getInstance();

    }


    @NonNull
    @Override
    public ProductCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.shr_product_card, parent, false);
        return new ProductCardViewHolder(layoutView);

    }

    @Override
    public void onBindViewHolder(@NonNull final ProductCardViewHolder holder, int position) {

////                ProductEntry mproductitem = productList.get(getAdapterPosition());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//
//
//
//            @Override
//            public void onClick(View view) {
////                Toast.makeText(view.getContext(), "ueeeeee" + productList.get(getAdapterPosition()), Toast.LENGTH_SHORT).show();
////                Intent intent = new Intent(view.getContext(), DetailActivity.class);
////                view.getContext().startActivity(intent);
//
////                        intent.putExtra("title", ProductItem.());
////        detailIntent.putExtra("image_resource",
////                currentSport.getImageResource());
//
////                int itemPosition = getLayoutPosition();
////                Toast.makeText(context, "" + itemPosition, Toast.LENGTH_SHORT).show();
////                holder.productTitle.setText(android.get(position).get());
////                viewHolder.tv_version.setText(android.get(i).getOfferType());
////                Picasso.with(context).load(android.get(i).getImg()).transform(new CircleTransform()).into(img);
//
//            }
//        });

        // TODO: Put ViewHolder binding code here in MDC-102
        if (productList != null && position < productList.size()) {
            ProductEntry product = productList.get(position);
            holder.productTitle.setText(product.title);
            holder.productPrice.setText(product.price);
            imageRequester.setImageFromUrl(holder.productImage, product.url);
        }

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }
}
