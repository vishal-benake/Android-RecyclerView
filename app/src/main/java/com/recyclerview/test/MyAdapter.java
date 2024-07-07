package com.recyclerview.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Models> modelsList;

    public MyAdapter(Context context, List<Models> modelsList) {
        this.context = context;
        this.modelsList = modelsList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.models, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.Name.setText(modelsList.get(position).getName());
        holder.Email.setText(modelsList.get(position).getEmail());
        holder.imageView.setImageResource(modelsList.get(position).getImageView());
    }

    @Override
    public int getItemCount() {
        return modelsList.size();
    }
}
