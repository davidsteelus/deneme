package com.class14;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Welcome to my home";
		String str1=str.replace(" ","");
		System.out.println(str1);

	System.out.println("******************");
	String str2="     Today is java class!!!!!";
	System.out.println(str2.trim().replaceAll(" ",""));
	System.out.println("******************");
	
	String str3 = "Is it saturday? Is it raining? Do we have a Java Class today?";
    String [] array = str3.split("\\?");
    System.out.println(array.length);
}
}
