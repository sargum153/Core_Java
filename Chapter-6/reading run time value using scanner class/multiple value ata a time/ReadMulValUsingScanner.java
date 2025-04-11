// Below program shows multiple value at a time from console using scanner.

import java.util.Scanner;

class ReadMulValUsingScanner {

	public static void main(String[] args) {

	Scanner scn = new Scanner(System.in);

	System.out.println("Enter numbers");

	int a = scn.nextInt();
	int b = scn.nextInt();
	int c = scn.nextInt();

	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(a + b + c);

	}
}
