package com.class9;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//*
        //**        5 rows and 5 column
        //***
        //****
        //*****
        
        for(int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         /*
          * 1
          * 22
          * 333
          * 4444
          * 55555
          * 666666
          * 7777777
          * 88888888
          * 999999999
          */
	
        for (int i=9; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
        for (int a=1; a<10; a++) {
            for (int b=0; b<a; b++) {
            
            System.out.print(a);
        }
        System.out.println();
        }
        }
       
	
}



