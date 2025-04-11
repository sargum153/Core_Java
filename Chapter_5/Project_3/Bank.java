// bank.java
import java.util.Arrays;
class bank{
	public static void main(String[] args){
		//creating 1 instance for the object Sargum

		BankAccount acc1 = new BankAccount ();
		BankAccount acc2 = new BankAccount ();

		//initalizing acc1 instance with HK
		
	acc1.accHolderName = "Hari";
	acc1.accNo = 1234567890L;
	acc1.bankName = "SBI";
	acc1.branchName = "BBSR";
	acc1.ifscCode = "0SBI356";
	acc1.balance = 10000977;
	acc1.mobile = new long[]{9000064578L, 8653472987L};

	
	System.out.println("acc1 object Value");
	System.out.println("	acc1.accHolderName\t:"	+acc1.accHolderName);
	System.out.println("	acc1.accNo\t:"			+acc1.accNo);
	System.out.println("	acc1.bankName\t:"	+acc1.bankName);
	System.out.println("	acc1.ifscCode\t:"	+acc1.ifscCode);
	System.out.println("  	acc1.balance\t:"	+acc1.balance);
	System.out.println("	acc1.mobile\t:"	+(Arrays.toString(acc1.mobile)));



	}
}