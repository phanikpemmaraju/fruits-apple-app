package org.github.phani.apple.app;

public class PeelerFactory {
	
	public Peeler getPeeler(){
		return new AnyPeeler();
	}

}
