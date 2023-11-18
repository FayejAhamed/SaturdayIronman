package com.upskill.asignment_2;

public class Assignment6 {

	public static void main(String[] args) {
/*		6.  Write a java program to find the prime number from 1 to 100 and print them.
*/

        System.out.println("Prime numbers between 1 and 100:");
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

		
	}
	
	
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }


}
