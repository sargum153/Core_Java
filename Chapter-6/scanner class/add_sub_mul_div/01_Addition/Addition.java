//Develop a program with two classes 1. Addition.class 2. calc.class  '
// In addition class define add() method to take 2 integers as arguments add those two values are print result. In caculation class define main method call add() method by passing the 2 integers.

// You must read those two integers from keyboard from end user by prompting user understandable messages.


// Addition.java

class Addition {
	static void add(int a,int b){
		
		int c = a+b;


		System.out.printf("The addition of %d and %d is %d%n", a,b,c);
	}
}