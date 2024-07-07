package com.recyclerview.test;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;
    public TextView Name, Email;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        Name = itemView.findViewById(R.id.Name);
        Email = itemView.findViewById(R.id.Email);
        imageView = itemView.findViewById(R.id.imageView);
    }
}
