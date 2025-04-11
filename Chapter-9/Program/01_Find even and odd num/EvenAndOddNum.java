/*

Develop a Program to take an integer number a argument if it is even print number is even numner.
In main method call this method passing integer, and read that integer from keyboard from end user;

*/

class EvenAndOddNum{
	public static void findEvenOdd(int num){

		if(num % 2 == 0){
			System.out.println(num+ " is a even number.");
		} else {
			System.out.println(num+ " is a Odd numbver.");
		}
	}
	public static void main(String[] args){
		findEvenOdd(34);
		findEvenOdd(33);
	}

}