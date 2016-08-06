package org.github.phani.apple.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ColourTest {
	
	private Colour colour;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		colour = null;
	}

	@Test
	public void GivenNoColour_ShouldReturnNull() {
		Colour colourNull = null;
		assertNull(colourNull);
	}
	
	@Test
	public void GivenGreenColour_ShouldReturnGreenApple() {
		colour = Colour.GREEN;		
        assertEquals(colour.getColour(),"green");
	}
	
	@Test
	public void GivenRedColour_ShouldReturnRedApple() {
		colour = Colour.RED;		
        assertEquals(colour.getColour(),"red");
	}

	
	@Test
	public void GivenBlueColour_ShouldReturnBlueApple() {
		colour = Colour.BLUE;		
        assertEquals(colour.getColour(),"blue");
	}



}
