package com.example.DogRestApi.Service;

import com.example.DogRestApi.Entity.Dog;

import java.util.List;

public interface DogService {



    List<Dog> retrieveDogs();
    List<String> retrieveDogBreed();
    String retrieveDogBreedById(Long id);
    List<String> retrieveDogNames();
}
