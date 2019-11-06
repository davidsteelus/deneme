package com.class8;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print numbers from 1-50 except those are divisible by 3
		 for (int i = 1; i < 50; i++) {
	            if (i % 3 == 0) {
	                continue;
	            }
	            System.out.println(i);
	            
	        }
		 System.out.println("*****************");
		 String card;
		 Scanner scan=new Scanner(System.in);
		    
		    for(int q=1; q<=10; q++) {
		        System.out.println("are you Apply to a for credit card?");
		        card=scan.nextLine();
		       
		        if(card.equalsIgnoreCase("yes")) {
		            break;
		        }
		    }
	    }
	}