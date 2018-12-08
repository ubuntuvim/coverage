package com.ubuntuvim.coverage.base;

import org.junit.runners.model.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class JUnitLog4jClassRunner extends SpringJUnit4ClassRunner {

	static {
	}

	public JUnitLog4jClassRunner(Class<?> clazz) throws InitializationError {
		super(clazz);
	}

}
