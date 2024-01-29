package com.demo.testService.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Document
@Data
@Builder
public class Test {
	
	private int id;
	private String name;
	public Test() {
		super();
	}
	public Test(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
