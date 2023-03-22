package com.examaple.doggraphql.mutator;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.examaple.doggraphql.entity.Dog;
import com.examaple.doggraphql.exception.BreedNotFoundException;
import com.examaple.doggraphql.exception.DogNotFoundException;
import com.examaple.doggraphql.repository.DogRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Mutation implements GraphQLMutationResolver {
    private DogRepository dogRepository;

    public Mutation(DogRepository dogRepository) { this.dogRepository = dogRepository;}

    public boolean deleteDogBreed(String breed) {
        boolean deleted = false;
        Iterable<Dog> allDogs = dogRepository.findAll();
        // Loop through all dogs to check their breed.
        // Deleting by id is more effective but this is per the demo course example
        for (Dog d:allDogs){
            if (d.getBreed().equals(breed)) {
                // Delete if the breed is found
                dogRepository.delete(d);
                deleted = true;
            }
        }
        if (!deleted) {
            throw new BreedNotFoundException("Breed Not Found", breed);
        }

        return true;
    }

    public Dog updateDogName(String newName, Long id) {
        Optional<Dog> optionalDog = dogRepository.findById(id);

        if (optionalDog.isPresent()) {
            Dog dog = optionalDog.get();

            dog.setName(newName);
            dogRepository.save(dog);

            return dog;
        }
        else {
            throw new DogNotFoundException("Dog Not Found", id);
        }
    }
}
