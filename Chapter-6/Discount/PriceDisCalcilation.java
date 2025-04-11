//PriceDisCalcilation.java

import java.util.Scanner;

class PriceDisCalcilation {
	
	public static void main(String[] args) {
		
		// Creating Scanner object connecting to keyboard.

		Scanner scn = new Scanner(System.in);

		System.out.print("Enter Product Price: ");
		double price = scn.nextDouble();

		System.out.print("Enter Product Discount: ");
		double discount = scn.nextDouble();

		double finalPrice = price-(price * discount/100);

		System.out.println("\nOriginal price: "+ price);
		System.out.println("\nDiscount Price: "+ discount);
		System.out.println("Final Price\t :"+ finalPrice);
	}

}