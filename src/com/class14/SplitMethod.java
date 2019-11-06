package com.class14;

public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Video provides a powerful way to help you prove your point.";
		String[] array=str.split(" ");
		for(int i=0;i<array.length;i++){
		System.out.println(array[i]);
		System.out.println("************************");
		
		String str1="today is Sunday. Its sunny day.and we are haveing java class";
		String[] array2=str1.split("\\.");
		
		for (String string : array2) {
			System.out.println(string);
			
		}
	}
	}
}


		
