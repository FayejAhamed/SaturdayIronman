package com.upskill.java_1;

public class Variables {
	
	//variables in java


	
	//method parameter - variable used as method parameter
	

	public String country = "USA";  	//instance or global veriable - variables declared in class level , outside method
	
	public static String region = "North America"; //static variable - variable belons to class and don't required creating object

	public static void main(String[] args) {
		Variables obj = new Variables();
		
		String city = "New York"; 	//local variable - variable delclared in method
		
		String police = "NYPD";
		
		System.out.println(city);
		
		System.out.println(region);
		System.out.println(obj.country);
		nj("Essex");
		pa("Bensal");
		

	}
	
	
	public static void nj(String county){
		String city = "Bloomfield";
		String police = "BPD";
		System.out.println(city);
		System.out.println(police);
		System.out.println(county);
	}
	
	public static void pa(String county){
		String city = "Phili";
		String police = "PPD";
		System.out.println(city);
		System.out.println(police);
		System.out.println(county);
	}
	
	
	
	

}
