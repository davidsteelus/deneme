package com.class5;

public class LogicalNot {
	
 public static void main(String[]args) {
	 
	 boolean b1=!true;
	 boolean b2=!false;
	 
	 System.out.println(b1);
	 System.out.println(b2);
	 
	 boolean traffic=true;
	 
	 // if traffic late ' else on time
	 if (!traffic) {//using!we are reverting condition
		 System.out.println("On time");
	 }else {
		 System.out.println("late");
		 
		 boolean isRain=false;
		 if (!isRain) {
			 System.out.println("Take an umbrella");
		 }else {
			 System.out.println("do not take an umbrella");
		 }
		 
		 // let's compare 2 numbers using NOT operator
		 
		 int num1=10;
		 int num2=10;
		 if(num1==num2) {
			 System.out.println("Numbers are equal");
		 }else {
			 System.out.println("Numbers are NOT equal");
		 }
		 if(!(num1==num2)) {
			 System.out.println("Numbers are NOT equal");
		 }else {
			 System.out.println("Numbers are  equal");
			 
		 }
		 
		 // if name is not Marry or Anna then you are not my sister
		 
		 String name1="Marry";
		 String name2="Anna";
		 
		 if ((!name1.equals("Marry") || name2.equals("Anna"))) {
			 
			 System.out.println("You are not my sister");
		 }else {
			 System.out.println("You are my sister");
		 
		 
		 }
		 
		 
		 String name3="Helen";
		 String name4="July";
		 
		 // true OR false-->true add NOT -->false
		 if ((!name3.equals("Marry") || name4.equals("Anna"))) {
			 
			 System.out.println("You are not my sister");
		 }else {
			 System.out.println("You are my sister");
		 
	 }
	 
 }
}
}
