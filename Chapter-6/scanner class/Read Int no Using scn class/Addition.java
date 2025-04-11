// Develop addition class to read integer number by using scanner class, add them and display result.

import java.util.Scanner;

class Addition {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter First no: ");

		int a = scn.nextInt();

		System.out.println("Enter Second no: ");

		int b = scn.nextInt();

		int c = a+b;


		System.out.println("Result:" + c);

	}
}
