package com.lifetime.practice_layout_eight;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    ArrayList<rvInfo> infors;
    Context context;

    public CustomAdapter(ArrayList<rvInfo> infors, Context context) {
        this.infors = infors;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        holder.bindView(infors.get(position));
    }

    @Override
    public int getItemCount() {
        return infors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        ImageView img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.item_row_text);
            img = itemView.findViewById(R.id.item_row_img);
        }
        public void bindView(rvInfo info){
            text.setText(info.getText());
            img.setImageResource(info.getImg());
        }
    }
}
