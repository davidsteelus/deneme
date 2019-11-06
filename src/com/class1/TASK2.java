package com.class1;

public class TASK2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						//0	1	2	3	4	5
		//   0	 1	   2    3    4    5
char[] grades= {'A', 'B', 'C', 'D', 'E', 'F'};

int a=2;
System.out.println(grades[4]);
System.out.println(grades[a]);

a+=2;//2+2
System.out.println(grades[a]);
a--;//3
System.out.println(grades[a]);
System.out.println("--------------------");
//System.out.println(grades[0]);
//System.out.println(grades[1]);
//System.out.println(grades[2]);
//System.out.println(grades[3]);

for(int i2=0; i2<grades.length; i2++) {
	System.out.println(grades[i2]);
}
System.out.println("--------------------");

String[] animals= {"Cat", "Dog", "Cow", "Snake", "Elephant"};
int size=animals.length;

for(int i1=0; i1<size; i1++) {
	System.out.print(animals[i1]+" ");
}
//create an array to store 5 double values, print all elements in 1 line
}

}
