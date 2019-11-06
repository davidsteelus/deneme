package com.class7;

public class student1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean WorkDay=true;
        int day=1;
        
        while (WorkDay) {
        	
      
        	if(day==6) {
        		WorkDay=false;
        	
        	System.out.println("I do not need a day off anymore");
            
        } else {
            	System.out.println("I need a day off");
            }
            day++;
        }
	}
    
}




