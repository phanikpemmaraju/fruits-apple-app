package org.github.phani.apple.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PeelerTest {
	
	private Peeler peeler;

	@Before
	public void setUp() throws Exception {
		peeler = new Peeler();
	}

	@After
	public void tearDown() throws Exception {
		peeler = null;
	}
	
	@Test
	public void GivenEmptyApple_ThenPeel_ShouldReturnNull() {
		Apple apple = null;
		assertNull(Peeler.peel(apple));
	}


	@Test
	public void GivenApple_ThenPeel_ShouldReturnApple() {
		Apple apple = new Apple(Colour.GREEN,15,Taste.ONE,false);
		assertNotNull(Peeler.peel(apple));
	}

}
