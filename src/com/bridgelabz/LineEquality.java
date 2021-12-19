package com.bridgelabz;
import java.util.Scanner;

public class LineEquality {
	public static int x1, x2, y1, y2, x3, x4, y3, y4;
	public static void main(String[] args) {
			CalcuLength length = new CalcuLength();
			getInput();
			length.calLength();
			CheckEquality line = new CheckEquality();
			line.checkEquality();
	}
	public static void getInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of x1 and y1");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("Enter value of x2 and y2");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		
		System.out.println("Enter value of x3 and y3");
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		System.out.println("Enter value of x4 and y4");
		x4 = sc.nextInt();
		y4 = sc.nextInt();
	}
}

class CalcuLength{
	static Double length1,length2;
	public void calLength() {
	    length1 = Math.sqrt((LineEquality.x2 - LineEquality.x1) * (LineEquality.x2 - LineEquality.x1) + (LineEquality.y2 - LineEquality.y1) * (LineEquality.y2 - LineEquality.y1));
		System.out.println("Length of first line = " + length1 + " units");
	    length2 = Math.sqrt((LineEquality.x4 - LineEquality.x3) * (LineEquality.x4 - LineEquality.x3) + (LineEquality.y4 - LineEquality.y3) * (LineEquality.y4 - LineEquality.y3));
		System.out.println("Length of second line = " + length2 + " units");
	}
}

class CheckEquality{
	public  void checkEquality() {
		if(CalcuLength.length1.equals(CalcuLength.length2)) {
			System.out.println("Both lines are EQUAL in length");
		}
		else {
			System.out.println("Both lines are NOT EQUAL in length");
		}
	}
}

