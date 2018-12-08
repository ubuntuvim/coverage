package com.ubuntuvim.coverage.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ubuntuvim.coverage.base.AbstractBaseJunit4Test;
import com.ubuntuvim.coverage.domain.User;
import com.ubuntuvim.coverage.service.IUserService;


public class UserServiceImplTest extends AbstractBaseJunit4Test {

	@Autowired
	private IUserService iUserService;
	
	
	@Test
	public void testGetUser() {
		User u = iUserService.getUser("123");
		assertNotNull(u);
		assertEquals("123", u.getId());
		assertEquals("ubuntuvim", u.getUsername());
		assertEquals(20, u.getAge());
		assertNotNull(u.toString());
	}

}
