package com.ubuntuvim.coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class CoverageTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	private Coverage c = null;

	@Before
	public void setUp() {
		c = new Coverage();
	}
	
	@Test  // 测试type为1的情况
	public void testNormalOne() {
		String s = c.normal(1);
		assertEquals("one", s);
	}

	@Test  // 测试type为2的情况
	public void testNormalOther() {
		String s = c.normal(2);
		assertEquals("other", s);
	}

	@Test  // 测试正常的情况 （try语句块里的代码）
	public void testExceptMethodP() {
		int i = c.exceptMethod(10);
		assertEquals(2, i);
	}
	
	// 测试出现异常的情况（catch语句块里的代码）
	@Test(expected = ArithmeticException.class)
	public void testExceptMethod() {
		c.exceptMethod(0);
	}

	@Test  // 测试正常的情况
	public void testThrowExceptP() throws MyException {
		int i = c.throwExcept(10);
		assertEquals(2, i);
	}
	
	@Test  // 测试出现异常的情况
	public void testThrowExcept() throws MyException {
		// 出现异常的情况会返回MyException异常
		thrown.expect(MyException.class);
		thrown.expectMessage("0不能做分母。");
		c.throwExcept(0);
	}

}
