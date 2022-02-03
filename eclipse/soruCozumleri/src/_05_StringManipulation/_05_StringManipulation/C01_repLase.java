package _05_StringManipulation._05_StringManipulation;

import java.util.Scanner;

public class C01_repLase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cumle  girin");
	 
	String str=scan.nextLine();
	
	str=str.replaceAll(" ", " ");
	
	str=str.replace("a", "e");
	System.out.println(str);
	
	System.out.println("lutfen cumle daha  girin");
	
	String str2=scan.nextLine();
	
	System.out.println(str2.replace(" ", " ").replace('a','e'));
	 System.out.println(str2.toLowerCase().replace("a", "e" ).replace('e', 'i'));
	
	
	System.out.println(str2.toLowerCase().replace("a", "i").replace("e", "i"));
	
	
	
	
	
	
	}

}
