package com.class5;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[]args) {
		/*ask user to enter age
		 * if age is from 1 to3 --> you are a  baby
		 * if age from 3-5-->you are toddler
		 * if age from 5-12 -->you are a kid
		 * of age from 12-19--> teenager
		 * if age >20 --> you are an adult
		 */
	
		Scanner input=age Scanner(System.in);
		
		System.out.println("Please enter your age?");
		int age=3;
		 //true AND false--> false
		 if (age>=1&&age<=3) {
			 System.out.println("you are a baby");
			//true AND false--> false
		 }else if (age>3&&age<=5) {
			 System.out.println("You are a toddler");
			//true AND true--> true
		 }else if (age>5&& age<=12) {
			 System.out.println("You are a kid");
		 }else if (age>12&& age<=19) {
			 System.out.println("You are teenager");
		 }else if (age>=20) {
			 System.out.println("You are a adult");
			 
		 }else {
			 System.out.println("invalid age");
		 }
	 }

	private static void Scanner(InputStream in) {
		// TODO Auto-generated method stub
		
	}
	}


	
