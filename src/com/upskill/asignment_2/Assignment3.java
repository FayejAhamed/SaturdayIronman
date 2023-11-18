package com.upskill.asignment_2;

public class Assignment3 {

	public static void main(String[] args) {
/*		3. Write two java functions which will return two different integer values, write a 
			     program to compare those numbers and send message that one number is bigger 
			     than other. (hints: using if..else)

*/
		
		
		
		compareNumber();
	}
	
	
	public static int myFunction1(){
		int a = 30;
				return a;
	}
	

	public static int myFunction2(){
		int b = 34;
				return b;
	}

	public static void compareNumber(){
		if (myFunction1()> myFunction2()){
			System.out.println(myFunction1() + " --->1st function is bigger than 2nd functionj");
		}
		else if (myFunction1()==myFunction2()){
			System.out.println(myFunction2() + "  ==  " + myFunction1()  + " both functionhas the same value"   );
		}
		else{
			System.out.println(myFunction1() + " 1st function is less than 2nd functionj");
		}
	}
	
	
}
