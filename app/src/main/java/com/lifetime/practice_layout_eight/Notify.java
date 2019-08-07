package com.lifetime.practice_layout_eight;

public class Notify {
    private int color;
    private int avatar;
    private String userName;
    private String time;
    private String notify;
    private int imgOne;
    private int imgTwo;
    private int imgThree;
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

    public Notify(int avatar, String userName, String time, String notify, int imgOne, int imgTwo, int imgThree, int color, int colorTop) {
        this.avatar = avatar;
        this.userName = userName;
        this.time = time;
        this.notify = notify;
        this.imgOne = imgOne;
        this.imgTwo = imgTwo;
        this.imgThree = imgThree;
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

    public String getNotify() {
        return notify;
    }

    public void setNotify(String notify) {
        this.notify = notify;
    }

    public int getImgOne() {
        return imgOne;
    }

    public void setImgOne(int imgOne) {
        this.imgOne = imgOne;
    }

    public int getImgTwo() {
        return imgTwo;
    }

    public void setImgTwo(int imgTwo) {
        this.imgTwo = imgTwo;
    }

    public int getImgThree() {
        return imgThree;
    }

    public void setImgThree(int imgThree) {
        this.imgThree = imgThree;
    }
}
