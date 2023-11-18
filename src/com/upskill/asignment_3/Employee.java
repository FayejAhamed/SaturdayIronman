package com.upskill.asignment_3;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Employee " + i + ":");
            
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Address: ");
            String address = scanner.nextLine(); // Consume the newline character

            // Display employee information
            System.out.println("Employee " + i + " details:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Address: " + address);
            System.out.println();
        }

        scanner.close();
    }
}