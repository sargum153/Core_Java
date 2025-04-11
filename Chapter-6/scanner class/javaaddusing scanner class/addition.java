/** 

cmd > Java Addition

Enter Fno: 10
Enter Sno: 20
Result :30

*/

import java.util.Scanner;

class addition {
	
	public static void main(String[] args){
		
		//connecting to keyboard for reading value
		Scanner scn = new Scanner(System.in);

		//reading integer from keyboard by prompting messages

		System.out.print("Enter Fno:");
		int a = scn.nextInt();

		System.out.print("Enter Sno");
		int b = scn.nextInt();

		int c = a + b;

		System.out.println("Result: " + c);
	}
}
