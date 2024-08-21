package com.coderscampus.week2;

import java.util.Scanner;

public class ExampleOutput1 {

	public static void main(String[] args) {
		System.out.println("Type in a number bewtween 50 and 300");
		
		try (Scanner scanner = new Scanner(System.in)) {
			String input = scanner.nextLine();
			
			
		try {
			int convertedInput = Integer.parseInt(input);
			
			
			 if (convertedInput <= 50 && convertedInput >= 300) {
				 System.out.println(("Oops,that number wasn't between 50 and 300, try again: "));
						String input2 = scanner.nextLine();
						
			 } else if (convertedInput < 50) {
				 System.out.println(("Oops,that number wasn't between 50 and 300, try again: "));
				 String input3 = scanner.nextLine();
			 } else if (convertedInput <= 50 && convertedInput >= 300) {
				 String input4 = scanner.nextLine();
				System.out.println("Number is above 300");
			}
			 
		 } catch (NumberFormatException e) {
			 System.out.println("Invaild input! Please enter a valid integer.");
		 }
	}
	}
	
	}