package com.class12;


public class StringMiniPulationDemo {
		public static void main(String[]args) {
			
			//There are two ways to create string objects.
			
			//1
		    //String Literal
		    String name="john";
		    System.out.println(name);
		    System.out.println(name.length());
		    //2
		    //creating String with new key word
		    String name1=new String("john1;");
		    System.out.println(name1);
		    
		    /* this method returns the length of this string
		     * the length is equal to the number
		     * of 16 bit unicode characters in the string
		     */
		    int name1Len=name.length();
		    System.out.println("The length of name1Len is= "+name1Len);
		    String str1="hello world";
		    System.out.println("before ::" +str1);
		    str1=str1.toLowerCase();
		    System.out.println("after ::" +str1);
		}
	
}

