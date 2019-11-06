package com.class10;

public class task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] count= {"Ethiopia","Turkey","USA"};
        for (int i=0; i<count.length; i++) {
        if (i==0) {
            System.out.println("The capital of "+count[0]+" is Addis ABBA");
        }else if (i==1) {
                System.out.println("The capital of "+count[1]+" is Ankara");
        }else {
            System.out.println("The capital of "+count[2]+" is Washington ");
        }
        /*Create an array of countries. 
         * While retrieving all values from an array 
         * print capital for each country.*/
        	
        		String[] countries= {"Afghanistan", "Colombia","USA", "Russia", "Turkey"};
        		for(int i2=0; i2< countries.length; i2++) {
        			
        			if(countries[i].equals("USA")) {
        				System.out.println("Washington DC");
        			}else if(countries[i].equals("Russia")) {
        				System.out.println("Moscow");
        			}else if(countries[i].equals("Turkey")) {
        				System.out.println("Ankara");
        			}else if(countries[i].equals("Afghanistan")) {
        				System.out.println("Kabul");
        			}else if(countries[i].equals("Colombia")) {
        				System.out.println("Bogota");
        			}
        		}
        	}

        }
	}

	



	