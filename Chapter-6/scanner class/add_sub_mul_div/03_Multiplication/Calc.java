// Cals.java

import java.util.Scanner;

class Calc {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter Fno:");
		int a = scn.nextInt();

		System.out.print("Enter Sno:");
		int b = scn.nextInt();

		Multiplication.mul(a,b);

	}
}