package com.lifetime.practice_layout_eight;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TimelineAdapter extends RecyclerView.Adapter {
    Context context;
    private final ArrayList allItems;

    public TimelineAdapter(ArrayList allItems, Context context) {
        this.allItems = allItems;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case 0:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.timeline_item_row, parent, false);
                return new StatusViewHolder(view);
            case 1:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.timeline_item_row, parent, false);
                return new StatusViewHolder(view);
            case 2:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_notification, parent, false);
                return new NotifyViewHolder(view);
            default:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.timeline_item_row, parent, false);
                return new StatusViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int colorIndex = 0;
        switch (position) {
            case 0:
                ((StatusViewHolder) holder).bindView((Status) allItems.get(position));
                break;
            case 1:
                ((StatusViewHolder) holder).bindView((Status) allItems.get(position));
                break;
            case 2:
                ((NotifyViewHolder) holder).bindView((Notify) allItems.get(position));
                break;
            default:
                ((StatusViewHolder) holder).bindView((Status) allItems.get(position));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return allItems.size();
    }

    public class StatusViewHolder extends RecyclerView.ViewHolder {
        ImageView avatar;
        TextView userName;
        TextView time;
        TextView content;
        ImageView background;
        TextView likeNumber;
        TextView commentNumber;
        CardView circleView;
        View circleViewTop;
        View circleViewBottom;

        public StatusViewHolder(@NonNull View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar);
            userName = itemView.findViewById(R.id.user_name);
            time = itemView.findViewById(R.id.time);
            content = itemView.findViewById(R.id.content_timeline);
            background = itemView.findViewById(R.id.item_row_background);
            likeNumber = itemView.findViewById(R.id.like_number);
            commentNumber = itemView.findViewById(R.id.comment_number);
            circleView = itemView.findViewById(R.id.circle_view);
            circleViewTop = itemView.findViewById(R.id.top_circle);
            circleViewBottom = itemView.findViewById(R.id.bottom_circle);
        }

        public void bindView(final Status status) {
            avatar.setImageResource(status.getAvatar());
            userName.setText(status.getUserName());
            time.setText(status.getTime());
            content.setText(status.getContent());
            background.setImageResource(status.getImg());
            likeNumber.setText(status.getLike_number());
            commentNumber.setText(status.getComment_number());
            circleView.setCardBackgroundColor(status.getColor());
            circleViewBottom.setBackgroundColor(status.getColor());
            circleViewTop.setBackgroundColor(status.getColorTop());
        }
    }

    public class NotifyViewHolder extends RecyclerView.ViewHolder {
        ImageView avatar;
        TextView userName;
        TextView time;
        TextView content;
        ImageView followerOne;
        ImageView followerTwo;
        ImageView followerThree;
        CardView circleView;
        View circleViewTop;
        View circleViewBottom;

        public NotifyViewHolder(@NonNull View itemView) {
            super(itemView);
            avatar = itemView.findViewById(R.id.avatar_notify);
            userName = itemView.findViewById(R.id.user_name_notify);
            time = itemView.findViewById(R.id.time_notify);
            content = itemView.findViewById(R.id.content_timeline_notify);
            followerOne = itemView.findViewById(R.id.follower_1);
            followerTwo = itemView.findViewById(R.id.follower_2);
            followerThree = itemView.findViewById(R.id.follower_3);
            circleView = itemView.findViewById(R.id.view_circle_notify);
            circleViewTop = itemView.findViewById(R.id.notify_top_circle);
            circleViewBottom = itemView.findViewById(R.id.notify_bottom_circle);
        }

        public void bindView(Notify notify) {
            avatar.setImageResource(notify.getAvatar());
            userName.setText(notify.getUserName());
            time.setText(notify.getTime());
            content.setText(notify.getNotify());
            followerOne.setImageResource(notify.getImgOne());
            followerTwo.setImageResource(notify.getImgTwo());
            followerThree.setImageResource(notify.getImgThree());
            circleViewBottom.setBackgroundColor(notify.getColor());
            circleView.setCardBackgroundColor(notify.getColor());
            circleViewTop.setBackgroundColor(notify.getColorTop());
        }
    }
}
