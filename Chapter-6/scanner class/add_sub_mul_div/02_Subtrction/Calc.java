// Calc.java


import java.util.Scanner;
class Calc {

	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter Fno:");
		int a = scn.nextInt();

		System.out.print("Enter Lno:");
		int b = scn.nextInt();

		Subtraction.sub(a, b);
	}

}
