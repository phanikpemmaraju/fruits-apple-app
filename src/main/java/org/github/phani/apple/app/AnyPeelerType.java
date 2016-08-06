package org.github.phani.apple.app;

public class AnyPeelerType implements PeelerType{

	@Override
	public Apple peel(Apple apple) {
		// TODO Auto-generated method stub
		System.out.println("Apple is peeled with any peeler");
		return apple;
	}

}
