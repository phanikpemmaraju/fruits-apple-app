package org.github.phani.apple.app;

public class Peeler {
	
	static Apple peel(Apple apple) {
		
		if(apple.getIsWorm() == true || apple.getTaste().getValue() <= 3){
			return null;
		}
		
		return apple;
			
	}


}
