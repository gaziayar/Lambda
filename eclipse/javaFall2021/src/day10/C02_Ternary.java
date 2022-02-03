package day10;

import java.util.Scanner;

public class C02_Ternary {

	public static void main(String[] args) {
		// bir tam sayi alin tek veya cift oldugunu yazdirin

           Scanner scan= new Scanner (System .in );
		
		System.out.println(" lutfen tam sayi    giriniz");
	
	    int sayi=scan.nextInt();
	
	
	
	System.out.println((sayi%2==0) ? " cift sayi": "tek sayi");
	}

}
