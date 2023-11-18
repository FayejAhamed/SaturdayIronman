package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	@Override
	public void iDoor() {
		System.out.println("My car has 4 door");
		
	}
	
	@Override
	public int iWheel() {
		System.out.println("My car has 4 Wheel");
		return 4;
	}

	@Override
	public String iEngine() {
		System.out.println("My car hasdual motor engine");
		return "Dual motor";
	}

	@Override
	public void iColor() {
		
		System.out.println("My car is white");
	}


}
