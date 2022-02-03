package day14_methodCreation;

import java.util.Scanner;

public class C02_methodCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//kul.dan iki sayi ist.
	//sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yaz.
	//kul.us sorun 
		// 2 yazarsa karelerini toplamini yapan method ,3 yazarsa kupler tplamini yapan method calissin
	Scanner scan=new Scanner(System.in);
	
	System.out.println("lutfen iki sayi girin \n ilk sayidan sonra entera basin");
	
	double sayi1=scan.nextDouble();
	
	double sayi2=scan.nextDouble();
	
	
System.out.println("girilen sayilarin kareler toplani istiyorsaniz 2"
     + "\n kupler toplamini istiyorsaniz 3 e basin");

	int secim=scan.nextInt();
	switch(secim) { 
	case 2:kareTopla(sayi1,sayi2);
	break;
	case 3:kupTopla(sayi1,sayi2);
	break;
	default:
		System.out.println("lutfen istenen tercihlerden birini yapin");
	}
	}

	public static void kupTopla(double sayi1, double sayi2) {
		double kuplerToplami=sayi1*sayi1*sayi1+sayi2*sayi2*sayi2;
		System.out.println("girilen sayilarin kupleri toplami="+ kuplerToplami);
	}

	public static void kareTopla(double sayi1, double sayi2) {
		double karelerToplami=sayi1*sayi1+sayi2*sayi2;
		System.out.println("girilen sayilarin kareleri toplami="+ karelerToplami);
	}

}
