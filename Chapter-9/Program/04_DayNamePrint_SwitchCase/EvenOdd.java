/* Develop aprogram to find the passes integer is even or odd.

if number is even then print number is even.
if number is odd then print number is odd.

*/

import java.util.Scanner;
 class EvenOdd{
	public static void main(String[] args){
		System.out.print("Enter a Number to know enen or odd");

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		if (num%2 == 0)
			System.out.println(num + "Is even");
		else
			System.out.println(num + "Is Odd");
	}
 }