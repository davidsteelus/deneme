package com.class8;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*
  * write a code to find the sum of even §odd numbers
  * from range 1 to 20
  * expecting 2 outputs
  * sum for odd nums=...
  * sum for even numbers=...
  */
	int  	sumEven=0;
	int 	sumOdd=0;
		for (int i=1;i<=20;i++) 
	            if (i%2==0) {
	            	sumEven=sumEven+i;
	            System.out.println(i);
	            }else {
	            	sumOdd=sumOdd+i;
	            }
	            
		System.out.println("The ToTAL ALL OF EVEN#="+sumEven);
		System.out.println("The ToTAL ALL OF odd#="+sumOdd);
	}
}	