package com.class6;

import java.util.Scanner;

public class classtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * ask user to enter the month they were born\based on thre month define the season
		 * if user is born in jan, feb,dec-->winter
		 * if mar,apr,may,-->spring
		 * if jun,jul,aug-->summer
		 * if sep,oct,noe-->fall
		 * otherwise--> unknown
		 * at the end of the program
		 * "you were born in____"
		 */
		
		String month;
		Scanner scan=new Scanner(System.in);
		System.out.println("Month of born");
		month=scan.nextLine();
	
		String season;
		if (month.equals("jan")||month.equals("feb")|| month.equals("dec")) {
				season="winter";
				
			}else if (month.equals("mar")||month.equals("apr")|| month.equals("may")) {
				season="spring";
				
				}else if (month.equals("jun")||month.equals("jul")|| month.equals("aug")) {
					season="summer";
						
					}else if (month.equals("sep")||month.equals("oct")|| month.equals("now")) {
						season="fall";
						
						}else {
							season="Unknown";
						}
							System.out.println("you were born in "+ season);
							System.out.println(month);
				

	}
	}
