package com.class10;

public class task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1 Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).


		//2 Create an array of names and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).


		//3 Create an array of words: Java, Saturday, day, coding, is. 
		//Print the following sentence using element of array: “Saturday is Java coding Day”. 
		char[] store=new char[6];
		store[0]='A';
		store[1]='B';
		store[2]='C';
		store[3]='D';
		store[4]='E';
		store[5]='F';
		System.out.println(store[1]);
		
		 System.out.println("*********************************************");
	        
	        String[] names= {"Elina", "Juliana", "Anna","Olga"};
	        System.out.println(names[0]);
	        
	        System.out.println("-------------------------------------------");
	        
	        String[] firstName;
	        firstName=new String[4];
	        firstName[0]="Elina";
	        firstName[1]="Juliana";
	        firstName[2]="Anna";
	        firstName[3]="Olga";
	        System.out.println(firstName[0]);
	        
	        System.out.println("*********************************************");
	        
	        String[] words= {"Java", "Saturday", "Day","coding"};
	        System.out.println(words[1]+" is "+words[0]+" "+words[3]+" "+words[2]);
	        
	}

}
