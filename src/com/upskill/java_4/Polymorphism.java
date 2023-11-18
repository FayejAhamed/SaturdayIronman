package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType {
	
	/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		
		car();
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
	}
	
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		int bonus = 25000;
		int rent = 15000;
		int side = 10000;
		int totalIncome = calculateAnnualIncome + rent + side + side;
		
		System.out.println("My AnnualIncome = " + totalIncome);
		
	}
	
	
	
	public static void car(){
		System.out.println("My car is Tesla");
	}
	
	public static void car (String color){
		System.out.println("My car is Tesla ! It has color: " + color);
	}

	public static void car (int door){
		System.out.println("My car is Tesla ! It has door: " + door);
	}
	
	

	public static void car ( int door, String color){
		System.out.println("My car is Tesla ! It has door: " + door + ", My car is Tesla ! It has door: " + color );
	}

	
	
	public static void car (String seat, int key){
		System.out.println("My car is Tesla ! It has seat: " + seat + "Key Abilable" + key);
	}
	
	
	public static void car (int key, int cost){
		System.out.println("My car is Tesla ! It has door: " + key + cost);
	}
	
	public static void car (boolean isEV){
		System.out.println("My car is Tesla ! It has door: " + isEV);
	}
	
	
}
