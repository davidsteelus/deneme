package com.class6;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 7 weekdays
		 * if day==Monday
		 * if day==2 Tuesday
		 */
		int day=2;
		String weekDay;
		
		if (day==1) {
			weekDay="Monday";
		}else if(day==2) {
			weekDay="Tuesday";
		}else if(day==3) {
			weekDay="Wednesday";
		}else if(day==4) {
			weekDay="thursday";
		}else if(day==5) {
			weekDay="Friday";
		}else if(day==6) {
			weekDay="Saturday";
		}else if(day==7) {
			weekDay="sunday";
		}else  {
			weekDay="invalid";
		}
		System.out.println(weekDay);
		
		day=3;
		switch (day) {
		
		case 1 ://day==1
			weekDay="Monday";
			break;
		case 2:
			weekDay="Tuesday";
			break;
		case 3:
			weekDay="Wednesday";
			break;
		case 4:
			weekDay="thursday";
			break;
		case 5:
			weekDay="Friday";
			break;
		case 6:
			weekDay="Saturday";
			break;
		case 7:
			weekDay="sunday";
			break;
		default:
			weekDay="Invalid";
		}
		System.out.println(weekDay);
		
		}
	}


