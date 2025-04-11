/* Develop a program to print designation of an employee based on his experience 
exp <= 1  -> Associate
exp >= 1  and <=2   -> jr. Associate
exp >=2 and <=3  -> Team lead
More then 3 years -> Manager

use if else  if ladder

*/

import java.util.Scanner;
class DesignationPrint {
	public static void main(String[] args){
	System.out.print("Enter Experience level:");

	Scanner scn = new Scanner(System.in);
	double exp = scn.nextDouble();

	if(exp <= 1)
		System.out.println("Associate");
	else if(exp > 1 && exp <=2)
		System.out.println("Sr. Associate");
	else if(exp > 2 && exp <= 3)
		System.out.println("Team Lead");
	else
		System.out.println("Manager");
	}
}

