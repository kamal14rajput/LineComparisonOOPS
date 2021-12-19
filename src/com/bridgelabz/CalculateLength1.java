package com.bridgelabz;
import java.util.Scanner;

public class CalculateLength1 {
	 public static int x1, x2, y1, y2;
	 public static void main(String[] args) {
		
	  CalcLength length = new CalcLength();
		getInput();
		length.calLength();
	}
	public static void getInput() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter value of x1 and y1");
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		System.out.println("Enter value of x2 and y2");
		x2 = sc.nextInt();
		y2 = sc.nextInt();
	}
}

class CalcLength {
	public void calLength() {
		double length = Math.sqrt((CalculateLength1.x2 - CalculateLength1.x1) * (CalculateLength1.x2 - CalculateLength1.x1) + (CalculateLength1.y2 - CalculateLength1.y1) * (CalculateLength1.y2 - CalculateLength1.y1));
		System.out.println("Length of line = "+length);
	}
}
