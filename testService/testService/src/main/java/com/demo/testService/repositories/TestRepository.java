package com.demo.testService.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demo.testService.entities.Test;

public interface TestRepository extends MongoRepository<Test, Integer> {

}
