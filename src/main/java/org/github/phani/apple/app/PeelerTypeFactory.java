package org.github.phani.apple.app;

public class PeelerTypeFactory {
	
	public PeelerType getPeeler(Apple apple){
		
		if(apple == null){
			return null;
		}
		if(apple.getColour().getColour().equalsIgnoreCase("green") || apple.getColour().getColour().equalsIgnoreCase("red")){
			return new AnyPeelerType();
		}
		
		if(apple.getColour().getColour().equalsIgnoreCase("blue")){
			return new ValyrianSteelPeelerType();
		}
		
		return null;
		
	}

}
