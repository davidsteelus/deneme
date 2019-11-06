package com.class2;

public class DcExam {

	public static void main(String[]args) {
		/*
		 * declare 2 variables and initialize them
		 * display result of addition, substraction, multiplication and division
		 */

		
		int num111, num2;
		
		num111=40;
		num2=20;
	
		System.out.println(num111+num2); //60
		System.out.println(num111-num2); //20
		System.out.println(num111*num2); //800
		System.out.println(num111/num2); //2
		
		
		
			
			//How can we print value of num1 and num2 together
			
			System.out.println(num111+","+num2);
			System.out.println(num111+""+num2);
			
			int sum=num111+num2;
			int sub=num111-num2;
			int mult=num111*num2;
			int div=num111/num2;
			
			// the addition of 2 numbers is__
			System.out.println(sum);
			System.out.println(sub);
			System.out.println(mult);
			System.out.println(div);
			
		
		
	}
}
