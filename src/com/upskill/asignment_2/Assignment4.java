package com.upskill.asignment_2;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Write a for loop upto 500 which will increase the value double every time
*/		
		loopDoubleValue();
	}
	
	public static void loopDoubleValue(){
		for (int i =1; i < 500; i = i * 2){
			System.out.println("Double value : " + i);
		}
	}

}
