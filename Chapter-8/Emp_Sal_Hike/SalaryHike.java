class SalaryHike {
	
	static void increaseSal(Emp e){
		if(e.exp >= 1) {
			e.sal = e.sal*2;
		} else {
			e.sal = e.sal + (e.sal * 20/100);	
		}
	}
}