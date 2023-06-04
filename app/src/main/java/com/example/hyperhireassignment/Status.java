package com.example.hyperhireassignment;

public enum Status {
    SUCCESS,
    ERROR,
    LOADING;

    /**
     * Returns `true` if the [Status] is success else `false`.
     */
    boolean isSuccessful() {
        return this == SUCCESS;
    }

    /**
     * Returns `true` if the [Status] is loading else `false`.
     */
    boolean isLoading() {
        return this == LOADING;
    }

    /**
     * Returns `true` if the [Status] is in error else `false`.
     */
    boolean isError() {
        return this == ERROR;
    }
}
