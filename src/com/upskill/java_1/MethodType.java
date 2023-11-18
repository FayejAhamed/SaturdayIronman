package com.upskill.java_1;

public class MethodType {
	
	
	/*  Types of Method
	
	1.Void Method
	2.Static Method
	3.Return Type Method
*/	
	public static int hourlyIncome = 65;
	

	public static void main(String[] args) {


		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		System.out.println("My Monthly Income =" + obj.mothlyIncomeReturn());
		weeklyIncomeStatic();
		


	}
	//void method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My AnnualIncome = " + calculateAnnualIncome);
		
	}
	
	//return type method
	public int mothlyIncomeReturn(){
		int  calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	
	//static method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}

}
