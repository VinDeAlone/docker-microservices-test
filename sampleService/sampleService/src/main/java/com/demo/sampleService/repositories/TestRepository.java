package com.demo.sampleService.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.sampleService.entities.Test;

public interface TestRepository extends MongoRepository<Test, Integer> {

}
