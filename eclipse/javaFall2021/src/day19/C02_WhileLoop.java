package day19;

import java.util.Iterator;
import java.util.Scanner;

public class C02_WhileLoop {

	public static void main(String[] args) {
		// kul bir sayi alin ,ve bu sayinin rakamlari toplamini yazdirin
         Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen toplamini bulmak icin pozitif bir tam sayi giriniz:");
		
		int sayi=scan.nextInt();
		int rakamlarToplami=0;
		int rakam=0;
		
		while (sayi>0) {
			rakam=sayi%10;
			rakamlarToplami+=rakam;
		sayi/=10;
	
		
		}
		System.out.println("girdiginiz sayinin rakamlar toplami :"+rakamlarToplami );
		
		// for loop ile cozum
		
		
		
		
	}

}
