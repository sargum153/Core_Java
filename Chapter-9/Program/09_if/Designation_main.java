import java.util.Scanner;

class Designation_main {
	public static void main(String[] args){
		
		System.out.print("Enter yout Designation: ");

		Scanner scn = new Scanner(System.in);
		String desig = scn.nextLine();

		Test33.displayExp(desig);
	}
}