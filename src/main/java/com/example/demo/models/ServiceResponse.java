package com.example.demo.models;

public class ServiceResponse<T> {
    private boolean success;
    private String message;
    private T data;

    public ServiceResponse(boolean success, String message) {
        this.success = success;
        this.message = message;
    }

    public ServiceResponse(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
