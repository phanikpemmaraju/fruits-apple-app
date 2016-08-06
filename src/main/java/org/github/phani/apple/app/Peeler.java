package org.github.phani.apple.app;

public class Peeler {
	
	private static PeelerTypeFactory peelerFactory = new PeelerTypeFactory();
	
	static Apple peel(Apple apple) {
		
		if(apple.getIsWorm() == true || apple.getTaste().getValue() <= 3){
			return null;
		}
		
		PeelerType peeler = peelerFactory.getPeeler(apple);	
		return peeler.peel(apple);			
	}


}
