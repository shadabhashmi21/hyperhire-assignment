package com.example.hyperhireassignment.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.hyperhireassignment.DummyDataGenerator;
import com.example.hyperhireassignment.Resource;
import com.example.hyperhireassignment.Status;
import com.example.hyperhireassignment.model.PostModel;

public class PostViewModel extends ViewModel {
    private final DummyDataGenerator dummyDataGenerator = new DummyDataGenerator();
    public final MutableLiveData<Resource<PostModel>> postModelData = new MutableLiveData<>();

    public PostViewModel() {
        populateData();
    }

    void populateData() {
        postModelData.setValue(new Resource<>(Status.LOADING, null, null));
        postModelData.setValue(new Resource<>(Status.SUCCESS, dummyDataGenerator.generatePost(), null));
    }
}