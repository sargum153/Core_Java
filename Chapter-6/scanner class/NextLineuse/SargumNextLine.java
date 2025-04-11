// Develop a program to read a number and name from the console by using Scanner class


import java.util.Scanner;

class SargumNextLine {

	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Name:");
		String sName = scn.nextLine();

		System.out.println("Enter Number:");
		int sNo = scn.nextInt();

		System.out.println("Name:" + sName);
		System.out.println("Number:" + sNo);
	}
}