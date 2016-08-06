package org.github.phani.apple.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PeelerTypeFactoryTest {
	
	private PeelerTypeFactory peelerTypeFactory;

	@Before
	public void setUp() throws Exception {
		peelerTypeFactory = new PeelerTypeFactory();
	}

	@After
	public void tearDown() throws Exception {
		peelerTypeFactory = null;
	}

	@Test
	public void GivenNoApple_ShouldReturnNull() {
		Apple apple = null;
		assertNull(peelerTypeFactory.getPeeler(apple));
	}
	
	@Test
	public void GivenGreenApple_ShouldReturnAnyPeelerType() {
		Apple apple = new Apple(Colour.GREEN,87,Taste.FOUR,false);
		assertTrue(peelerTypeFactory.getPeeler(apple) instanceof AnyPeelerType);
	}

	@Test
	public void GivenRedApple_ShouldReturnAnyPeelerType() {
		Apple apple = new Apple(Colour.RED,22,Taste.FOUR,false);
		assertTrue(peelerTypeFactory.getPeeler(apple) instanceof AnyPeelerType);
	}

	
	@Test
	public void GivenBlueApple_ShouldReturnValyrianSteelPeelerType() {
		Apple apple = new Apple(Colour.BLUE,100,Taste.FOUR,false);
		assertTrue(peelerTypeFactory.getPeeler(apple) instanceof ValyrianSteelPeelerType);
	}


}
