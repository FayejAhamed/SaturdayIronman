package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hasmap_Hashset_HasTable {

	public static void main(String[] args) {
		
		int age = 30;					//variable
		int [] ageIronMan = new int []{25, 32, 37, 21, 27,56};  //array
		
		
		System.out.println("Student Age  : " + ageIronMan[2]);
		System.out.println("Total Student  : " + ageIronMan.length);

		String name;
		String [] nameIronMan = new String []{"Abdullah", "Chowdury", "fahim", "Nakib", "Foyez"};
		System.out.println("Student name  :" + nameIronMan[3]); 
		System.out.println("Total Student  :" + nameIronMan.length); 
			
		//Multi-Dimentional
		
		int [][] ageIronMan2D = {{5, 32, 37, 21, 27,56}, //[0][0] [0][1] [0][2] [0][3] [0][4]  [0][5]
				 {26, 30, 34, 65}};						//[1][0]  [1][1] [1][2] [1][3] [1][4]
		
		
		System.out.println("Student Age 2D : " + ageIronMan2D[1][3]);
		System.out.println("Student length 2D : " + ageIronMan2D.length);
		
		//Hashmap store multiple data using key -value pair, implementation of map interface
		
		HashMap<String, Integer > Student = new HashMap<String, Integer>();
		
		Student.put("Yousuf", 28);
		Student.put("Abdullah", 22);
		Student.put("Saiful", 38);
		Student.put("Nakib", 18);
		Student.put("Hapsa", 21);
		
		System.out.println("HashMap Student Age : " + Student.get("Hapsa"));
		
		
		
HashMap<String, String > Country = new HashMap<String, String>();
		
Country.put("Bd", "Dhaka");
Country.put("USA", "DC");
Country.put("UK", "London");
Country.put("KSA", "Riad");
Country.put("UAE", "Dubai");
		
		System.out.println("HashMap Country Capital : " + Country.get("KSA"));
		
		//Hashset store unorderd collection contain unique value , implemantion of set interface
		
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Toyota");
		car.add("Tesla");
		car.add("Audi");
		car.add("Audi");

 
		System.out.println("Car  : " + car);
		
		
		//HashTable store multiple data using key-value pair, no duplicate,
		//also is synchronized (only one thread can be modified)
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");

		
		System.out.println("Region : " + Region.get("BD"));
		
		
		
		
		
		
		
		
	}

}
