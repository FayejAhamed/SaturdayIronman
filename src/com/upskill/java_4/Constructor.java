package com.upskill.java_4;

public class Constructor {
	

	String studentName;
	private int studentAge;
	
	public Constructor(String name , int age){
		studentName = name;
		studentAge = age;
	}
	
	int studentAge2;
	public Constructor(int age2){
		
		studentAge2 = age2;
	
	}
	
	
	int studentAge3;
	String studentName3;

	public Constructor( int  age3, String name3  ){
		studentName3 = name3;
		studentAge3 = age3;
		
		//ergasgf
		//change
	}
	
	
	
	

	public static void main(String[] args) {
		Constructor obj = new Constructor("Foyez", 12);
		Constructor obj2 = new Constructor( 25);
		Constructor obj3 = new Constructor( 26, "abdullah");
		
		System.out.println(obj.studentName);
		System.out.println(obj.studentAge);
		System.out.println(obj2.studentAge2);
		System.out.println(obj3.studentName3);
		System.out.println(obj3.studentAge3);
		
		
	}

}
