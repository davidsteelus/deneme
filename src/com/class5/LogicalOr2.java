package com.class5;

public class LogicalOr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 7 days a week
				// if days is tuesday or thursday --.SDLC class
				// if days saturday or sunday -->Java Class
				//if days monday or friday --> No class
				// if day wednesday --> review class
				
				String  WeekDay ="sunday";
				
			if (WeekDay.equals("tuesday")||WeekDay.equals("thursday")) {
					System.out.println("SDLC CLASS");
					
				}else if (WeekDay.equals("saturday")||WeekDay.equals("sunday")) {
						System.out.println("Java Class");
					
					}else if (WeekDay.equals("monday")||WeekDay.equals("friday")) {
							System.out.println("No class");
							
						}else if (WeekDay.equals("wednesday")) {
								System.out.println("review class");
							}else {
								System.out.println("Not a valid day");
					

		}

	}

}
