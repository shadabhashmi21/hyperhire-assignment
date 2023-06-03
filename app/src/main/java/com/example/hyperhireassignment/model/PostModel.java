package com.example.hyperhireassignment.model;

import java.util.List;

public class PostModel {
    final String postTitle;
    final String postDescription;
    final List<String> hashtags;
    final String imageLink;
    final int likesCount;
    final boolean isBookMarked;
    final int timeStamp;
    final List<CommentModel> comments;
    final UserModel userModel;

    public PostModel(String postTitle, String postDescription, List<String> hashtags, String imageLink, int likesCount, boolean isBookMarked, int timeStamp, List<CommentModel> comments, UserModel userModel) {
        this.postTitle = postTitle;
        this.postDescription = postDescription;
        this.hashtags = hashtags;
        this.imageLink = imageLink;
        this.likesCount = likesCount;
        this.isBookMarked = isBookMarked;
        this.timeStamp = timeStamp;
        this.comments = comments;
        this.userModel = userModel;
    }
}
