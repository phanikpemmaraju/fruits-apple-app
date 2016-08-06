package org.github.phani.apple.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ValyrianSteelPeelerTypeTest {
	
	private PeelerType peelerType;

	@Before
	public void setUp() throws Exception {
		peelerType = new ValyrianSteelPeelerType();
	}

	@After
	public void tearDown() throws Exception {
		peelerType = null;
	}

	@Test
	public void GivenNoApple_ShouldReturnNull() {
		Apple apple = null;
		assertNull(peelerType.peel(apple));
	}
	
	@Test
	public void GivenGreenApple_ThenPeel_ShouldReturnApple() {
		Apple apple = new Apple(Colour.GREEN,87,Taste.FOUR,false);;
		assertNotNull(peelerType.peel(apple));
	}
	
	@Test
	public void GivenRedApple_ThenPeel_ShouldReturnApple() {
		Apple apple = new Apple(Colour.RED,11,Taste.FOUR,false);;
		assertNotNull(peelerType.peel(apple));
	}

	@Test
	public void GivenBlueApple_ThenPeel_ShouldReturnApple() {
		Apple apple = new Apple(Colour.BLUE,45,Taste.FOUR,false);;
		assertNotNull(peelerType.peel(apple));
	}

}
