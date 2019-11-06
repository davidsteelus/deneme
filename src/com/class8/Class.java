package com.class8;

import java.util.Scanner;

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*
		 * Let's ask user to enter if it is raining or not (true or false)
		 * as long as there is rain let's tell user to take an umbrella
		 * as soon as there is no rain--> you can go to park
		 */
		Scanner scan;
		boolean isRain;
		scan=new Scanner(System.in);
				
		do {
			System.out.println("Is it raining?");
		isRain=scan.nextBoolean();
		
		}while(isRain);
		
		System.out.println("Go to the park");
		
		}

}

