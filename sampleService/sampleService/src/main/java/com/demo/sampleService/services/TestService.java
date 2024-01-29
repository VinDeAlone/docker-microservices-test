package com.demo.sampleService.services;

import com.demo.sampleService.entities.Test;

public interface TestService {
	
	Test getTest(int id);
	Test createtTest(Test test);

}
