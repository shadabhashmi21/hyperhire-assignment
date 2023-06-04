package com.example.hyperhireassignment.model;

public class CommentModel {
    public final UserModel userModel;
    public final boolean isReplied;
    public final int likesCount;
    public final long timestamp;

    public CommentModel(UserModel userModel, boolean isReplied, int likesCount, long timestamp) {
        this.userModel = userModel;
        this.isReplied = isReplied;
        this.likesCount = likesCount;
        this.timestamp = timestamp;
    }
}
