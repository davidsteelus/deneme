package com.class2;

public class Task {

	public static void main(String[] args) {
		
		
		
		String studentsName="Michael";
		String lastName="johns";
		char studentGrade='B';
		String studentCity="Chantilly";
		String studentState="VA";
		String studentPhoneNumber="(123)456-7890";
		
		//String StudentCity="Washington DC";// we do not need to declare
		//variable again
		
		studentCity="Washington DC";
		studentState="DC";
		studentPhoneNumber="(987)654-3210";
		studentGrade='A';
				
		System.out.print(studentCity);
		
		System.out.print(lastName);
		
		System.out.print(studentGrade);
		
		System.out.print(studentState);
		
		System.out.print(studentPhoneNumber);
		
	
		
		
		System.out.print("My name is "  + studentsName);
		
		System.out.print("I live in city of " + studentCity);
		
		System.out.print("My phone Number is" + studentPhoneNumber);
		
		//My name is 
		//I live in city of
		//My phone number is
	}
}
