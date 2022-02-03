package day17Loops_for;

import java.util.Scanner;

public class C05_ForLoop {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner (System .in);
		System.out.println(" lutfen iki sayi girin:");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
	int kucuk;
	int buyuk;
	if (sayi1>sayi2) {
		buyuk=sayi1;
		kucuk=sayi2;	
	} else {
       buyuk=sayi2;
       kucuk=sayi1;
	}
	int toplam =0;
	
	for (int i = kucuk; i <= buyuk; i++) {
		
		toplam+=i;
		
		System.out.println("GIRILEN SAYILAR VE ARALARINDAKI SAYILARIN TOPLAMI:" + toplam);
		
		
		
	}
	
	
	
	
	}

}
