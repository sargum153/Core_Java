/* PrintPrintfDemo */

class PrintPrintfDemo {
	public static void main(String[] args){
		System.out.println(10);
		System.out.println(20);
		System.out.println(30);
		System.out.println(10 +""+20+ ""+30);
		System.out.printf("%d %d %d \n",10,20,30);

		System.out.println(10 + " " +20.5+" "+'a'+" "+true);
		//using printf
		System.out.printf("%d %.1f %c %b %s", 10, 20.5, 'a', true, "Hari");
		
	}
}