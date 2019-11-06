package com.class11;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of cars and store 6 elements into it.
		//Using 2 different loops print all values from the array.
		//Create an array on integers and calculate the sum of all elements in an array.
		//Create an array of countries. While retrieving all values from an array print capital for each country. (use 2 different loops).
	
		
	        
	        String[] cars= {"anadol", "murat", "kartal", "sahin", "bmc", "toros",};
	        
	        for (String car : cars) {
	            System.out.println(car);
	        }
	            System.out.println("===========================");
	
	
	        int [] nums= {10,20,30,40,50};
	        
	        int sum=0;
	        
	        for(int i=0; i<nums.length; i++) {
	            
	        sum=sum+nums[i];
	        
	        }
	        System.out.println(sum);
	    }
	
}

