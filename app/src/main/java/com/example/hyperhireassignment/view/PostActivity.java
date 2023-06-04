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
        //TextView likesCount = findViewById(R.id.)


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