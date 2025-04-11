// DEvelop addition class to read interger number by using scanner class add them and display result.

import java.util.*;

class addition {
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter 1st number:");
		int a = scn.nextInt();
		System.out.println("Enter 2nd number:");
		int b = scn.nextInt();
		int c = a+b;
		System.out.println("Result:"+ c);
	}
}
