package day10;

import java.util.Locale;

public class C13_ToUpperCaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String isim="aLi";  
	
	System.out.println(""+isim.toUpperCase().charAt(0) +
	

	isim.toLowerCase().charAt(1)+ isim.toLowerCase().charAt(2));
	
	
	System.out.println(isim.toLowerCase(Locale.forLanguageTag("tr")));
	
	
	
	}

}
