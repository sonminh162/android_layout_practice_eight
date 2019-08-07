package com.lifetime.practice_layout_eight;

public class Status {
    private int color;
    private int avatar;
    private String userName;
    private String time;
    private String content;
    private int img;
    private String like_number;
    private String comment_number;
    private int colorTop;

    public int getColorTop() {
        return colorTop;
    }

    public void setColorTop(int colorTop) {
        this.colorTop = colorTop;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public Status(int avatar, String userName, String time, int img, String like_number, String comment_number, int color, int colorTop) {
        this.avatar = avatar;
        this.userName = userName;
        this.time = time;
        this.img = img;
        this.like_number = like_number;
        this.comment_number = comment_number;
        this.color = color;
        this.colorTop = colorTop;
    }

    public Status(int avatar, String userName, String time, String content, String like_number, String comment_number, int color, int colorTop) {
        this.avatar = avatar;
        this.userName = userName;
        this.time = time;
        this.content = content;
        this.like_number = like_number;
        this.comment_number = comment_number;
        this.color = color;
        this.colorTop = colorTop;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getLike_number() {
        return like_number;
    }

    public void setLike_number(String like_number) {
        this.like_number = like_number;
    }

    public String getComment_number() {
        return comment_number;
    }

    public void setComment_number(String comment_number) {
        this.comment_number = comment_number;
    }
}
