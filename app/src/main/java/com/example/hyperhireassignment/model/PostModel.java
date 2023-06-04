package com.example.hyperhireassignment.model;

import java.util.List;

public class PostModel {
    public final String postTitle;
    public final String postDescription;
    public final List<String> hashtags;
    public final String postImageLink;
    public final int likesCount;
    public final boolean isBookMarked;
    public final long timeStamp;
    public final List<CommentModel> comments;
    public final UserModel userModel;

    public PostModel(String postTitle, String postDescription, List<String> hashtags, String postImageLink, int likesCount, boolean isBookMarked, long timeStamp, List<CommentModel> comments, UserModel userModel) {
        this.postTitle = postTitle;
        this.postDescription = postDescription;
        this.hashtags = hashtags;
        this.postImageLink = postImageLink;
        this.likesCount = likesCount;
        this.isBookMarked = isBookMarked;
        this.timeStamp = timeStamp;
        this.comments = comments;
        this.userModel = userModel;
    }
}
