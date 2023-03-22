package com.examaple.doggraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.examaple.doggraphql.entity.Dog;
import com.examaple.doggraphql.exception.DogNotFoundException;
import com.examaple.doggraphql.repository.DogRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Query implements GraphQLQueryResolver {
    private DogRepository dogRepository;

    public Query(DogRepository dogRepository) {this.dogRepository = dogRepository;}

    public Iterable<Dog> findAllDogs(){return dogRepository.findAll();}

    public Dog findDogById(Long id){
        Optional<Dog> dog = dogRepository.findById(id);

        if(dog.isPresent()){
            return dog.get();
        }
        else{
            throw new DogNotFoundException("Dog Not Found", id);
        }
    }
}
