/* Develop aprogram to find the passes integer is even or odd.

if number is even then print number is even.
if number is odd then print number is odd.

*/

// method class
import java.util.Scanner;

class Even_Odd {
	static void is_Even(int num){
		if (num%2 == 0)
			System.out.println(num + "is a Even NUmber.");
		else
			System.out.println(num + "is a Odd Number.");
	}
}

// main method class

class Even_Odd_mainMethod {
	public static void main(String[] args){
		Even_Odd.is_Even(13);
	}
}