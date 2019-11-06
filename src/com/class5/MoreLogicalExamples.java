package com.class5;

import java.util.Scanner;

//for mac cmd+shift+0
public class MoreLogicalExamples {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* ask uiser to enter daily sales
 * based on the sales range we ewant to give comission to the person
 * if sales is <100 -->comission is %10
 * if sales if between 100-200 --> comission of 20%\etc...
 */
		
		Scanner scan;
		double commission;
		double salesAmount;
	
		scan=new Scanner(System.in);
		
		System.out.println("Please enter your sales amount");
		
		salesAmount=scan.nextDouble();
		
		
		if(salesAmount<100) {
			//lets give user 10% commission of a sale
			commission=salesAmount*0.1;
			
		}else if(salesAmount >=100 && salesAmount<200) {
			//lets give user 20% commission of a sale
			commission=salesAmount*0.2;
			
		}else if(salesAmount >=200 && salesAmount<500) {
			//lets give user 30% commission of a sale
			commission=salesAmount*0.3;

		}else if(salesAmount >=500 ) {
			//lets give user 50% commission of a sale
		commission=salesAmount*0.5;
		}else {
		commission=0;
		}
		System.out.println("Based on the sales your comission is"+commission);
			
		}
		
		
	}

