package com.upskill.java_4;

public class Encapsulation {
	
	//Encapsulautaion used to hide then data using setter and getter method

	private String name = "UpSkill";
	private int ssn = 456845;
	private String username = "raslealam";

	//setter Method  - name							//set data , write
	public void setName(String value){
		name = value;
	}

	//getter method - name						//get the data, Read
	public String getName (){
		return name;
	}
	
	//setter Method  - ssn							//set data , write
	public void setSSN(int value){
		ssn= value;
	}
	
	
	//getter method - name						//get the data, Read
	public String getusername (){
		return username;
	}
	
	
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		
		obj.setName("Rasel");
		obj.setSSN(1245234);
		System.out.println(obj.getName());
		System.out.println(obj.getusername());
		
	}
	
	

}
