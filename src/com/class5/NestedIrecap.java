package com.class5;

import java.util.Scanner;

public class NestedIrecap {
	
public static void main(String[] args) {
		
		// *Verify if button is displayed on the page
		//*if button is displayed thenwe need to verify text on
		//*if text equal to sign in --> test case pass
		// otherwise--> wrong text is displayed*/
	

	boolean isDisplayed=true;
	
	String buttonText="Sign In)";
	if (isDisplayed) {
		
	System.out.println("Button is displayed");
	
		if(buttonText.contentEquals("Sign In")) {
		
		
		
		System.out.println("Test case pass");
		} else {
		System.out.println("wrong text is displayed");
		}
		} else {
			
		System.out.println("Button is not displayed");
		}
}
}