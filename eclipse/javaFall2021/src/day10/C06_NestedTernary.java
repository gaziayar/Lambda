package day10;

import java.util.Scanner;

public class C06_NestedTernary {

	public static void main(String[] args) {
		// Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , 
		
		//buyuk harfse
		//consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.
	
     char krk= '&';
	
	//String sonuc = (krk>='a'&& krk<='z') ? "kucuk harf":();
	
     String sonuc = (krk>='a'&& krk<='z') ? "kucuk harf":(
    		        (krk>='A')&& krk<='Z'? "Buyuk harf":"girilen karakter harf degil");
	
	
	System.out.println(sonuc);
	
	
	
	}

}
