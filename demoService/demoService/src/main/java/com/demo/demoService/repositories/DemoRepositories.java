package com.demo.demoService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.demoService.entities.Demo;

public interface DemoRepositories extends JpaRepository<Demo, Integer> {

}
