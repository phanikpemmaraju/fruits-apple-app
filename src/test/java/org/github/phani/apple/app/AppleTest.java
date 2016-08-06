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
	
	@Test
	public void GivenAppleWithAttributes_ShouldReturnApple() {
		objectUnderTest = new Apple("green",15,Taste.ONE,false);
		assertNotNull(objectUnderTest);
		assertEquals(objectUnderTest.getColour(),"green");
		assertEquals(objectUnderTest.getWeight().intValue(),15);
		assertEquals(objectUnderTest.getTaste().getValue(),1);
		assertFalse(objectUnderTest.getIsWorm());
	}
	
	@Test
	public void GivenAppleWithNoColour_ShouldReturnApple() {
		objectUnderTest = new Apple(null,15,Taste.ONE,false);
		assertNotNull(objectUnderTest);
		assertEquals(objectUnderTest.getColour(),null);
	}
	
	@Test(expected=NullPointerException.class)
	public void GivenAppleWithNoTaste_ShouldReturnException() {
		objectUnderTest = new Apple("blue",15,null,false);
		assertNotNull(objectUnderTest);
		assertEquals(objectUnderTest.getTaste().getValue(),0);
	}

	@Test(expected=NullPointerException.class)
	public void GivenAppleWithNoWeight_ShouldReturnException() {
		objectUnderTest = new Apple("blue",null,Taste.THREE,false);
		assertNotNull(objectUnderTest);
		assertEquals(objectUnderTest.getWeight().intValue(),0);
	}

	@Test
	public void GivenAppleWithWorm_ShouldReturnApple() {
		objectUnderTest = new Apple("red",11,Taste.FOUR,true);
		assertNotNull(objectUnderTest);
		assertTrue(objectUnderTest.getIsWorm());
	}


}
