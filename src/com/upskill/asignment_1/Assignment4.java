package com.upskill.asignment_1;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//(A function returns 30, another function returns 50. Write a java program
		//which will display subtraction value from bigger number to smaller.)
		int functionx = 50;
		int functiony = 30;
		int substraction = functionx-functiony;
		System.out.println("subtraction value from bigger number to smaller number is: " + substraction );
		
		
		

		

int num1 = function1();
       int num2 = function2();

       int larger, smaller;

       if (num1 > num2) {
           larger = num1;
           smaller = num2;
       } else {
           larger = num2;
           smaller = num1;
       }

       int result = larger - smaller;

     //  System.out.println("Subtraction value from the larger number to the smaller number is: " + result);
   }

   public static int function1() {
       return 30;
   }

   public static int function2() {
       return 50;
		

	}

}
