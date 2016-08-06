package org.github.phani.apple.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TasteTest {
	
	private Taste taste;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		taste = null;
	}
	
	@Test
	public void GivenNoTaste_ShouldReturnNull() {
		Taste tasteNull = null;
		assertNull(tasteNull);
	}

	@Test
	public void GivenZeroTaste_ShouldReturnZero() {
		taste = Taste.ZERO;		
        assertEquals(taste.getValue(),0);
	}

	@Test
	public void GivenOneTaste_ShouldReturnOne() {
		taste = Taste.ONE;		
        assertEquals(taste.getValue(),1);
	}

	@Test
	public void GivenTwoTaste_ShouldReturnTwo() {
		taste = Taste.TWO;		
        assertEquals(taste.getValue(),2);
	}

	@Test
	public void GivenThreeTaste_ShouldReturnThree() {
		taste = Taste.THREE;		
        assertEquals(taste.getValue(),3);
	}
	
	@Test
	public void GivenFourTaste_ShouldReturnFour() {
		taste = Taste.FOUR;		
        assertEquals(taste.getValue(),4);
	}


}
