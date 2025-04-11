// College.java

class College {
	public static void main(String[] args){
		//creating 2 instance for the object HK and BK

		Student S1 = new Student();		//HK
		Student S2 = new Student();		//BK

		//initalizing s1 instance with HK 
		
		S1.sno = 101;
		S1.sname="HK";
		S1.corse="CJ";
		S1.fee=3500;

		S2.sno = 101;
		S2.sname="BK";
		S2.corse="Acting";
		S2.fee=3500;

	
	System.out.println("S1 object Value");
	System.out.println("	S1.sno\t:"		+S1.sno);
	System.out.println("	S1.sname\t:"	+S1.sname);
	System.out.println("	S1.corse\t:"	+S1.corse);
	System.out.println("	S1.fee\t:"		+S1.fee);

	//initalizing s2 instance with HK 

	System.out.println("S2 object Value");
	System.out.println("	S2.sno\t:"		+S2.sno);
	System.out.println("	S2.sname\t:"	+S2.sname);
	System.out.println("	S2.corse\t:"	+S2.corse);
	System.out.println("	S2.fee\t:"		+S2.fee);

	}
}