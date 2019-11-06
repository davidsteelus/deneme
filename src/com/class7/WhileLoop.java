package com.class7;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time=8;
		if(time<12){//condition is true 
			System.out.println("Good Moprning");//code executes1
			}
		System.out.println("----------------------");
			while(time<12){//if condition is true 
			System.out.println("Good Moprning");//code executes  infinitly--> infinitely loop
				time++;
				
				// i want toGM 5 times
				
				int i=1;
				while(i<5) {
					System.out.println("Good Moprning");
				}
}
}
}
