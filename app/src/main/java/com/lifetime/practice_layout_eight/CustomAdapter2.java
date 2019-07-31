package com.lifetime.practice_layout_eight;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter2 extends RecyclerView.Adapter<CustomAdapter2.ViewHolder> {

    ArrayList<rvInfo> infors;
    Context context;

    public CustomAdapter2(ArrayList<rvInfo> infors, Context context) {
        this.infors = infors;
        this.context = context;
    }

    @NonNull
    @Override
    public CustomAdapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View itemView = layoutInflater.inflate(R.layout.item_row_new,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter2.ViewHolder holder, int position) {
        holder.bindView(infors.get(position));
    }

    @Override
    public int getItemCount() {
        return infors.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView text;
        Button img;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.session_number);
            img = itemView.findViewById(R.id.button_play);
        }
        public void bindView(rvInfo info){
            text.setText(info.getText());
            img.setBackgroundResource(info.getImg());
        }
    }
}
