package org.github.phani.apple.app;

public enum Colour {
	
	GREEN("green"),RED("red"),BLUE("blue");
	
	private String colour;
	
	private Colour(String colour) {
		this.colour = colour;
	}
 
	public String getColour() {
		return colour;
	}


}
