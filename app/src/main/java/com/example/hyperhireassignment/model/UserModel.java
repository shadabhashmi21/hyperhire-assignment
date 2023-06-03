package com.example.hyperhireassignment.model;

public class UserModel {
    final int profileImageResource;
    final String userName;
    final boolean isVerified;
    final String status;
    final String height;
    final String weight;
    final boolean isFollowed;

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
