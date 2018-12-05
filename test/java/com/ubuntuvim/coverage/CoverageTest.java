package com.ubuntuvim.coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.ubuntuvim.coverage.Coverage;
import com.ubuntuvim.coverage.MyException;

public class CoverageTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private Coverage c = null;

	@Before
	public void setUp() {
		c = new Coverage();
	}
	
	@Test
	public void testNormalOne() {
		String s = c.normal(1);
		assertEquals("one", s);
	}

	@Test
	public void testNormalOther() {
		String s = c.normal(2);
		assertEquals("other", s);
	}

	@Test
	public void testExceptMethodP() {
		int i = c.exceptMethod(10);
		assertEquals(2, i);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testExceptMethod() {
		c.exceptMethod(0);
	}

	@Test
	public void testThrowExceptP() throws MyException {
		int i = c.throwExcept(10);
		assertEquals(2, i);
	}
	
	@Test
	public void testThrowExcept() throws MyException {
		thrown.expect(MyException.class);
		thrown.expectMessage("0不能做分母。");
		c.throwExcept(0);
	}

}
