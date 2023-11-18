package com.upskill.asignment_2;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*5.  Write a program in Java to display the multiplication table of (eight)8.*/
		
		multipicationTable();
	}
	
	public static void multipicationTable(){
		for(int row = 1; row <= 8; row ++){
			for (int col = 1; col <= 10; col ++){
				int MultipicationTable = row * col;
				System.out.print(MultipicationTable + " ");
			}
			System.out.println(" ");

		}
	}

}
