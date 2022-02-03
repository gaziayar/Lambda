package day07_ifelsestetament;

import java.util.Scanner;

public class C7_IfElseIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   Scanner scan= new Scanner (System .in );
		
		System.out.println(" lutfen iki giriniz");
	
		double sayi1= scan.nextDouble();
		double sayi2= scan.nextDouble();
		
		if (sayi1==0  || sayi2==0) { System.out.println("sifir carpmaya gore yutan elemandir");
		
	} else if (sayi1>0 && sayi2>0) {System.out.println("sayilarin toplami:"+(sayi1+sayi2));
		
	} else if (sayi1<0&& sayi2<0) {System.out.println("sayilarin carpimi:" + (sayi1*sayi2));
		
	} else {System.out.println("farli isaretlerde sayilarla islem yapamazsin");

	} {

	}{

	}
	scan.close();
	
	
	}

}
