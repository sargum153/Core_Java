// Redevelop above Student and college project to read and store student value by using scanner object.

import java.util.Scanner;

class College {

	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);
		Student s1 = new Student();

		System.out.println("Enter Student Details: ");
		System.out.print("Enter sNo: ");
		s1.sNo = scn.nextInt(); scn.nextLine();
		

	
		System.out.print("Enter sName: ");
		s1.sName = scn.nextLine();

		System.out.print("Enter course: ");
		s1.course = scn.next();

		System.out.print("Enter fee: ");
		s1.fee = scn.nextDouble();

		System.out.print("Enter gender: ");
		s1.gender = scn.next().charAt(0);

		System.out.print("Enter email: ");
		s1.email = scn.next();


		System.out.println("Enter Student details:");

			System.out.println("En sNo:" + s1.sNo);
			System.out.println(" sName:" + s1.sName);
			System.out.println(" course:" + s1.course);
			System.out.println(" fee:" + s1.fee);
			System.out.println(" gender:" + s1.gender);
			System.out.println(" email:" + s1.email);

	}

}