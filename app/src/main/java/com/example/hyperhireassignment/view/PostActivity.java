package com.example.hyperhireassignment.view;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.example.hyperhireassignment.R;
import com.example.hyperhireassignment.Resource;
import com.example.hyperhireassignment.Status;
import com.example.hyperhireassignment.model.PostModel;
import com.example.hyperhireassignment.viewmodel.PostViewModel;

public class PostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.arrow_back);

        PostViewModel viewModel = new ViewModelProvider(this).get(PostViewModel.class);
        TextView profileTitle = findViewById(R.id.profile_title);

        // Create the observer which updates the UI.
        final Observer<Resource<PostModel>> postModelObserver = new Observer<Resource<PostModel>>() {
            @Override
            public void onChanged(Resource<PostModel> postModelResource) {
                if (postModelResource.status == Status.SUCCESS){
                    profileTitle.setText(postModelResource.data.postTitle);
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