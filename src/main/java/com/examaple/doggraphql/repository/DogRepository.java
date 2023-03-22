package com.examaple.doggraphql.repository;

import com.examaple.doggraphql.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
