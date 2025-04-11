//college.java

class college {
	public static void main(String[] args){
		// create new instance from class student

		student s1 = new student();
		
		// reading value from the command line converting and storing in student.

		s1.sno = Integer.parseInt(args[0]);
		s1.sname = args[1];
		s1.course = args[2];
		s1.fee = Double.parseDouble(args[3]);
		s1.email = args[4];
		s1.mobile = Long.parseLong(args[5]);
		s1.gender = args[6].charAt(0);
		s1.studyingStatus = Boolean.parseBoolean(args[7]);


		//Printing value
		System.out.println("Student object value");
		System.out.println("sno :" + s1.sno);
		System.out.println("sname : "+ s1.sname);
		System.out.println("course : "+ s1.course);
		System.out.println("fee :" + s1.fee);
		System.out.println("email :" + s1.email);
		System.out.println("mobile :" + s1.mobile);
		System.out.println("gender :" + s1.gender);
		System.out.println("studyingStatus :" + s1.studyingStatus);
	}
}