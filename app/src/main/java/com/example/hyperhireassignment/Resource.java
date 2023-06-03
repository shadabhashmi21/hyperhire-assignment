package com.example.hyperhireassignment;

public class Resource<ResultType> {
    Status status;
    ResultType data;
    String errorMessage;

    public Resource(Status status, ResultType data, String errorMessage){
        this.status = status;
        this.data = data;
        this.errorMessage = errorMessage;
    }
}
