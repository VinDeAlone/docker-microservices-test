package com.demo.testService.services;

import com.demo.testService.entities.Test;

public interface TestService {
	
	Test getTestById(int id);
	Test createTest(Test test);

}
