package com.example.DogRestApi.Service;

public class DogNotFoundException extends RuntimeException{

    public DogNotFoundException() {
    }

    public DogNotFoundException(String message) {
        super(message);
    }
}
