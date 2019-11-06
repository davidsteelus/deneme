package com.class6;

import java.util.Scanner;

public class HomeworkTeacher1 {

	public static void main(String[] args) {
		
Scanner scan;
int quiz;
int midTerm; 
int FinalScore;

scan=new Scanner(System.in);
System.out.println("Please enter quiz score");
quiz=scan.nextInt();

System.out.println("Please enter midTerm score");
midTerm=scan.nextInt();

System.out.println("Please enter FinalScore score");
FinalScore=scan.nextInt();

int average= (quiz+midTerm+FinalScore)/3;

	if (average>=90) { 
	System.out.println("A");

	}else if(average>=70 || average<90){
	System.out.println("B");
	
	}else if(average>=50 && average<70) {
        System.out.println("C");
			}else if (average<50) {
				System.out.println("F");
				}else { 
					System.out.println("Fail");
    }
    System.out.println("Your avarage score is " + average);
    System.out.println("__________________________");
	
	
	
	}
}
