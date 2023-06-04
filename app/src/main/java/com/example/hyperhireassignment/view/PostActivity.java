package com.example.hyperhireassignment.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hyperhireassignment.R;
import com.example.hyperhireassignment.Resource;
import com.example.hyperhireassignment.Status;
import com.example.hyperhireassignment.model.PostModel;
import com.example.hyperhireassignment.viewmodel.PostViewModel;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.chip.ChipGroup;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.arrow_back);

        PostViewModel viewModel = new ViewModelProvider(this).get(PostViewModel.class);
        ImageView profileImage = findViewById(R.id.profile_image);
        TextView userName = findViewById(R.id.profile_title);
        TextView measurements = findViewById(R.id.measurements);
        TextView status = findViewById(R.id.status);
        TextView postTitle = findViewById(R.id.post_title);
        TextView postDesc = findViewById(R.id.post_description);
        ChipGroup hashtagChips = findViewById(R.id.chip_group);
        //Chip chip = new Chip(this);
        //ChipDrawable drawable = ChipDrawable.createFromAttributes(this, null, 0, com.google.android.material.R.style.Theme_MaterialComponents_Light);
        //chip.setChipDrawable(drawable);
        TextView likesCount = findViewById(R.id.likes_count);
        TextView commentCount = findViewById(R.id.comment_count);
        ImageView commentProfileImage = findViewById(R.id.comment_profile_image);
        TextView commentProfileTitle = findViewById(R.id.comment_profile_title);
        TextView commentProfileStatus = findViewById(R.id.comment_user_status);
        TextView comment = findViewById(R.id.comment);
        TextView commentLikesCount = findViewById(R.id.comment_likes_count);
        TextView replyCount = findViewById(R.id.reply_count);
        ImageView userProfileImage = findViewById(R.id.user_profile_image);
        TextView userTitle = findViewById(R.id.user_title);
        TextView userStatus = findViewById(R.id.reply_user_status);
        TextView userComment = findViewById(R.id.user_comment);
        TextView userLikesCount = findViewById(R.id.user_likes_count);


        final Observer<Resource<PostModel>> postModelObserver = new Observer<Resource<PostModel>>() {
            @Override
            public void onChanged(Resource<PostModel> postModelResource) {
                if (postModelResource.status == Status.SUCCESS) {
                    profileImage.setImageResource(R.mipmap.profile_image);
                    userName.setText(postModelResource.data.userModel.status);
                    measurements.setText(String.format("%s %s", postModelResource.data.userModel.height, postModelResource.data.userModel.height));
                    status.setText(postModelResource.data.userModel.status);
                    postTitle.setText(postModelResource.data.postTitle);
                    postDesc.setText(postModelResource.data.postDescription);

                    /*postModelResource.data.hashtags.forEach(s -> {
                        chip.setText(s);
                        hashtagChips.addView(chip);
                    });*/
                    likesCount.setText(String.valueOf(postModelResource.data.likesCount));
                    commentCount.setText(String.valueOf(postModelResource.data.comments.size()));
                    commentProfileImage.setImageResource(R.mipmap.profile_image);
                    commentProfileTitle.setText(postModelResource.data.userModel.userName);
                    commentProfileStatus.setText(postModelResource.data.userModel.status);
                    comment.setText(postModelResource.data.userModel.comment);
                    commentLikesCount.setText(String.valueOf(postModelResource.data.comments.get(0).likesCount));
                    replyCount.setText(String.valueOf(postModelResource.data.comments.size()));
                    userProfileImage.setImageResource(R.mipmap.secondary_profile_image);
                    userTitle.setText(postModelResource.data.comments.get(0).userModel.userName);
                    userStatus.setText(postModelResource.data.comments.get(0).userModel.status);
                    userComment.setText(postModelResource.data.comments.get(0).userModel.comment);
                    userLikesCount.setText(String.valueOf(postModelResource.data.comments.size()));
                }
            }
        };

        viewModel.postModelData.observe(this, postModelObserver);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
}