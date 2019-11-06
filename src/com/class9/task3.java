package com.class9;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Write a program that reads a range of integers (start and end point),
 *  provided by a user and then from that range prints the sum of the even and odd integers.


* 2.Write a guessing game where the user has to guess a secret number between 1 and 20. 
* After every guess input, 
* the program tells the user whether their number was too large or too small. 
* The program will keep asking the user to enter the number until he finds the correct number. 
* When the correct answer is found the system should display “Congratulations!!. You got it!”

 */
		
		/*
		 * 
		 * Print the following pattern:
55555
4444
333
22
1  

Print the following pattern:
*
**








**
*
		 */
		
		
		for (int i=5; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
        
        System.out.println();

	for (int i=1; i<=5; i++) {
        for(int j=1; j<=i; j++) {
            System.out.print("*");
        }
            System.out.println();
    }
	for (int i=1; i>=4; i++) {
        for(int j=4; i<=j; j--) {
            System.out.print("*");
        }
        System.out.println();
    
   
}
}
}






