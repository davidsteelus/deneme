package com.class5;

public class LogicalOr {

	public static void main(String[] args) {
		
	
// 7 days a week
		// if days is 2 or 4 --.SDLC class
		// if days 6 or 7 -->Java Class
		//if days 1 or 5 --> No class
		// if day 3 --> review class
		
		int day =7;
		// (false OR  false)--> false
		if (day==2 || day== 4) {
			//if (true OR  false) -->true
			System.out.println("SDLC CLASS");
		}else if (day==6 || day==7) {
			
			System.out.println("Java Class");
			// (false OR  false)--> false
		}else if (day==1 || day==5) {
			System.out.println("No Class");
		}else if (day==3) {
			System.out.println("review class");
		}else {
			System.out.println("Not a valid day");
		}
	}

}
