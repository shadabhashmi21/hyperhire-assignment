package com.example.hyperhireassignment.model;

public class UserModel {
    public final int profileImageResource;
    public final String userName;
    public final boolean isVerified;
    public final String status;
    public final String height;
    public final String weight;
    public final boolean isFollowed;

    public UserModel(int profileImageResource, String userName, boolean isVerified, String status, String height, String weight, boolean isFollowed) {
        this.profileImageResource = profileImageResource;
        this.userName = userName;
        this.isVerified = isVerified;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.isFollowed = isFollowed;
    }
}
