package com.class11;

public class TwoDarraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] names= {
		{"Kahn","Yousuf","Alex","Zynab","JJJ"},
		{"Mohammad","Ann","NAslyhan","Wegas"},
		{"Diago","asif","Zubair","Shogofa"},
};

int lengthOfRows=names.length;
System.out.println(lengthOfRows);

int lengthOfCols=names[1].length;
System.out.println(lengthOfCols);

for(String getArrays[]:names){
for(String getName:getArrays) {
	
	System.out.print(getName+" ");
}
	System.out.println();
}
	}

}
