package com.bridgelabz;
import java.util.Scanner;

public class CompareLines {

		public static int x1, x2, y1, y2, x3, x4, y3, y4;
		public static void main(String[] args) {
				CalculLength length = new CalculLength();
				getInput();
				length.calLength();
				CompareLine line = new CompareLine();
				line.comparelines();
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

class CalculLength{
	static Double length1,length2;
	public void calLength() {
	    length1 = Math.sqrt((CompareLines.x2 - CompareLines.x1) * (CompareLines.x2 - CompareLines.x1) + (CompareLines.y2 - CompareLines.y1) * (CompareLines.y2 - CompareLines.y1));
		System.out.println("Length of first line = " + length1 + " units");
	    length2 = Math.sqrt((CompareLines.x4 - CompareLines.x3) * (CompareLines.x4 - CompareLines.x3) + (CompareLines.y4 - CompareLines.y3) * (CompareLines.y4 - CompareLines.y3));
		System.out.println("Length of second line = " + length2 + " units");
	}
}

class CompareLine{
	public  void comparelines() {
		if(CalculLength.length1.compareTo(CalculLength.length2) == 1) {
			System.out.println("Line1 is greater than line2 in length");
		}
		else if (CalculLength.length1.compareTo(CalculLength.length2) == -1) {
			System.out.println("Line1 is less than line2 in length");
		}
		else {
			System.out.println("Both lines are EQUAL in length");
		}
	}
}

