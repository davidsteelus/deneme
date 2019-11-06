package com.class9;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Write a program that reads a range of integers (start and end point),
		 *  provided by a user and then from that range prints the sum of the even and odd integers.


		* 2.Write a guessing game where the user has to guess a secret number between 1 and 20. 
		* After every guess input, 
		* the program tells the user whether their number was too large or too small. 
		* The program will keep asking the user to enter the number until he finds the correct number. 
		* When the correct answer is found the system should display “Congratulations!!. You got it!”

		 */
		
		int guessNumber, secretNumber;
		scan=new Scanner(System.in);
		secretNumber=12;
		do {
			System.out.println("Pleaase guess my number from 1 to 20");
		
			guessNumber=scan.nextIn();
			
			if(guessNumber<secretNumber) {
				System.out.println("Your number is too small");
				
			}else if (guessNumber > secretNumber);{
			System.out.println("Your Number is too large");
		}
		while(guessNumber != secretNumber);
		
		System.out.println("Congratulations you got it");
			}
			
}
}
}

