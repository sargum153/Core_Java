class Test02_ExpEval_Procedure {

	public static void main(String[] args){
		
		int a = 10;
		double d = 20;

		double res = a+50L+(a-d)*a+3+m1()/2;
		System.out.println("Result :"+ res);

	}

	static char m1() {
		return 100;
	}


}