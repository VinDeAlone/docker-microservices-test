package com.demo.sampleService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.sampleService.entities.Demo;

public interface DemoRepository extends JpaRepository<Demo, Integer> {

}
