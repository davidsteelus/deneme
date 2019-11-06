package com.class8;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// continue - it will skip current iteration
		
				for (int i=1; i<=5; i++) {
				
					if (i==3 || i==4) {
					continue;
					}
					System.out.println(i);
				}
				System.out.println("I am outside  of the loop");
				

		// i want to print nums from 1 to 20 except 5,6,7

			for (int a=1; a<=20; a++) {//5
				if(a==5 || a==6 || a==7) {
 				break;
 			}
 			System.out.println(a);
}
	}
}
