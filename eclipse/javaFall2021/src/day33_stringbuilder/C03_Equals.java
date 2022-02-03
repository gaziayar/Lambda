package day33_stringbuilder;

public class C03_Equals {

	public static void main(String[] args) {
		StringBuilder sb1= new StringBuilder("java");
		StringBuilder sb2= new StringBuilder("java");
	
	System.out.println(sb1==sb2);    // false
	System.out.println(sb1.equals(sb2));   //false
	//System.out.println(sb1.compareTo(sb2));
	
	
	
	String str="java";
	
	//System.out.println(sb1==str);   // sb ile string karsilastiramaz
	
	
	System.out.println(sb1.equals(str));
	// System.out.println(sb1.compareTo(str)); compare string icin kullanilamaz
	
	}

}
