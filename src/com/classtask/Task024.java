package com.classtask;

public class Task024 {

	import java.util.Scanner;
	class Main {
	 public static void main(String[]args) {
		 
		Scanner input=new Scanner(System.in);
	   System.out.println("Enter your name");
	   String name=input.nextLine();
	   Scanner input2=new Scanner(System.in);
	   System.out.println("Enter your mobile number");
	   String mobile=input2.nextLine();
	   Scanner input3=new Scanner(System.in);
	   System.out.println("Enter your age");
	   int age=input3.nextInt();
	   System.out.println("Your name is "+name+ ", "+"your age is "+age+" and "+"your mobile number is " +mobile);
	}
	    
	}

