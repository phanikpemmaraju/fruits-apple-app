package org.github.phani.apple.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppleTest {
	
	private Apple objectUnderTest;

	@Before
	public void setUp() throws Exception {
		objectUnderTest = new Apple();
	}

	@After
	public void tearDown() throws Exception {
		objectUnderTest = null;
	}

	@Test
	public void GivenNoApple_ShouldReturnNull() {
		Apple apple = null;
		assertNull(apple);
	}
	
	@Test
	public void GivenApple_ShouldReturnApple() {
		assertNotNull(objectUnderTest);
	}

}
