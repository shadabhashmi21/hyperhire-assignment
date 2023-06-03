package com.example.hyperhireassignment.model;

public class CommentModel {
    final UserModel userModel;
    final boolean isReplied;
    final int likesCount;
    final long timestamp;

    public CommentModel(UserModel userModel, boolean isReplied, int likesCount, long timestamp) {
        this.userModel = userModel;
        this.isReplied = isReplied;
        this.likesCount = likesCount;
        this.timestamp = timestamp;
    }
}
