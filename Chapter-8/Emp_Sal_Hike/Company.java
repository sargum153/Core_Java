class Company {
	
	public static void main(String[] args){
		Emp e1 = new Emp();
		Emp e2 = new Emp();

		e1.sal = 10000;
		e1.exp = 1;

		SalaryHike.increaseSal(e1);
		System.out.println(e1.sal);

		e2.sal = 20000;
		e2.exp = .8;

		SalaryHike.increaseSal(e2);
		System.out.println(e2.sal);
	}
}