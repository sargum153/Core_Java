//Develop a program with two classes 1. Addition.class 2. calc.class  '
// In addition class define add() method to take 2 integers as arguments add those two values are print result. In caculation class define main method call add() method by passing the 2 integers.

// You must read those two integers from keyboard from end user by prompting user understandable messages.


// Calc.java

import java.util.Scanner;


class Calc {
	public static void main(String[] args){
		System.out.println("Main Start");

		Scanner scn = new Scanner(System.in);

		//Reading runtime value from keyboard from end user.

		System.out.print("Enter FNO:");
		int a = scn.nextInt();

		System.out.print("Enter SNO:");
		int b = scn.nextInt();

		Addition.add(a,b);
		System.out.println("Main End");
	}
}
