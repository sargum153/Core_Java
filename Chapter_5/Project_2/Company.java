// Company.java

class Company {
	public static void main(String[] args){
		//creating 2 instance for the object HK and BK

		Employee e1 = new Employee ();		//HK
		Employee e2 = new Employee ();		//BK

		//initalizing s1 instance with HK 
		
		e1.eno = 101;
		e1.ename="HK";
		e1.dept="SE";
		e1.sal=3500;

		e2.eno = 101;
		e2.ename="BK";
		e2.dept="SE";
		e2.sal=4500;

	
	System.out.println("e1 object Value");
	System.out.println("	e1.eno\t:"	+e1.eno);
	System.out.println("	e1.ename\t:"	+e1.ename);
	System.out.println("	e1.dept\t:"	+e1.dept);
	System.out.println("	e1.sal\t:"	+e1.sal);


	//initalizing 22 instance with HK 

	System.out.println("e2 object Value");
	System.out.println("	e2.eno\t:"	+e2.eno);
	System.out.println("	e2.ename\t:"	+e2.ename);
	System.out.println("	e2.dept\t:"	+e2.dept);
	System.out.println("	e2.sal\t:"	+e2.sal);


	}
}