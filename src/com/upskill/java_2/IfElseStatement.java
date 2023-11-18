package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int age = 0;
		
		if(age <= 13){
			if(age <=0 ){
				System.out.println("You are in the womb");
			}
			else
				System.out.println("You are children");
		}
		else if(age > 13 && age < 18){
			System.out.println("You are Teenager");
		}
		else if(age >= 60){
			if( age >= 100){
				System.out.println("You are Champion");
			}
			else
				System.out.println("You are Senior");
		}
		
		else{
			System.out.println("You are adult");
		}
		
		

	}

}
