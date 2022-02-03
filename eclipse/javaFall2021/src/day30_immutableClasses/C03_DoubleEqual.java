package day30_immutableClasses;

public class C03_DoubleEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Mustafa";
		String str2 = "Mustafa";

		String str3 = new String("Mustafa");
		String str4 = new String("Mustafa");

		System.out.println(str1 == str3);// false
		System.out.println(str1.equals(str3));// true

	
		System.out.println(str4 == str3);// false
		System.out.println(str4.equals(str3));// true
	
	
	System.out.println(str1==str2);   // true
	
	
	
	
	
	
	
	}

}
