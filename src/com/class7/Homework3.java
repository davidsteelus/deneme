package com.class7;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 /*
		  * You need to ask user to pay for coffee
		  * you need to keep asking user to pay for until entered price is equal =5;
		  * after u8ser paid then say"Enjoy your coffee!"
		  */
		
		Scanner scan=new Scanner(System.in);
		int price;
		
		do {
		System.out.println("Please pay for your coffee");
		price=scan.nextInt();
		
		}while(price!=5); 
		System.out.println("Enjoy your coffee");
		
		int price1;
		System.out.println("Please pay for your coffee");
		price1=scan.nextInt();//4
		
		
		while(price1!=5) {
			
			System.out.println("Please pay for your coffee");
			price1=scan.nextInt();
		}
			System.out.println("Enjoy your coffee");
	}

}