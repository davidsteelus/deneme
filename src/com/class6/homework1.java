package com.class6;

import java.util.Scanner;

public class homework1 {
	public static void main (String[]args) {
	    Scanner scan=new Scanner(System.in);
	    int quiz, midterm, finall,averageScore;
	    char grade;
	           System.out.println("enter your quiz,midterm,finall scores,respectively");
	           quiz=scan.nextInt();
	           midterm=scan.nextInt();
	           finall=scan.nextInt();
	        averageScore=(quiz+midterm+finall)/3;
	        
	        if(averageScore>=90 && averageScore<=100) {
	           grade='A';
	        }else if (averageScore>=70 && averageScore<90){
	            grade='B';
	        }else if(averageScore>=50 && averageScore<70){
	            grade='C';
	        }else if(averageScore<50){
	            grade='F';
	        }else{  
	            grade='I';
	             }
	        System.out.println(grade);
}
}
