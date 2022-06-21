package com.example.DogRestApi.Service;

import com.example.DogRestApi.Entity.Dog;
import com.example.DogRestApi.Repo.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DogServiceImpl implements DogService{

    @Autowired
    DogRepository dogRepository;
    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    public List<String> retrieveDogBreed() {
        return (List<String>) dogRepository.findAllBreed();
    }
        public String retrieveDogBreedById(Long id) {
            Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
            String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
            return breed;
        }


    public List<String> retrieveDogNames() {
        return (List<String>) dogRepository.findAllName();
    }
}
