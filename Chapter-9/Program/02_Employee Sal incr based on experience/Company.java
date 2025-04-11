/* Develop a program tp read day number from keyboard. Print it's day name 1---> SUNDAY, 2--->MONDAY*/
import java.util.Scanner;

class DayName {
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		System.out.println("enter Day Number (1 to 7):")
		int dayNum = scn.nextInt();

		if(dayNum==1)
			System.out.println("Today is Sunday")
		else if(dayNum==2)
			System.out.println("Today is Monday")
		else if(dayNum==3)
			System.out.println("Today is Tuesday")
		else if(dayNum==4)
			System.out.println("Today is Wednesday")
		else if(dayNum==5)
			System.out.println("Today is Thursday")
		else if(dayNum==6)
			System.out.println("Today is Friday")
		else if(dayNum==7)
			System.out.println("Today is Saturday")
		else
			System.out.println("Invalid day Number must be beweet 1 to 7")
	}

}