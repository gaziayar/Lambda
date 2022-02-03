package day14_MethodCreation;

import java.util.Scanner;

public class C02MethodCreation {

	public static void main(String[] args) {
		// kul 2 sayi isteyin
		// sayilarin karelerini ne kuplerini toplayip yazdiran iki ayri metod yazin
		// kullaniciya us sorun
		// 2 yazarsa kareleri tolamini 3 yazarsa kupler toplamini yapan metod calissin

		Scanner scan = new Scanner(System.in);

		System.out.println(" lutfen iki sayi girin\n ilk sayidan sonra enter a basin");

		double sayi1 = scan.nextDouble();
	    double sayi2 = scan.nextDouble();
	    
	    System.out.println("girilen sayilarin kareler toplami icin 2'ye " +
	    "\n kupler toplami icin 3 basin");
	    
	    int secim=scan.nextInt();
	    
	    switch (secim) {
	    case 2:
	    
	    kareTopla(sayi1,sayi2);
	    break;
	    case 3:
	    kupTopla(sayi1,sayi2);
	    break;
	    default:
	    
	    	System.out.println("lutfen istenen tercihlerden birini yapin");}
	    		
	    	}
	    	
	      	
	public static void kareTopla(double sayi1, double sayi2) {
		double karelerToplami= sayi1 * sayi1 + sayi2 * sayi2;
		System.out.println("girilrn sayilarin kareleri toplami=" + karelerToplami);
	
	}

	public static void kupTopla(double sayi1, double sayi2) {

		double kuplerToplami= sayi1*sayi1*sayi1+sayi2*sayi2*sayi2;
				
			System.out.println("girilen sayilarin kuplerinin toplami:" + kuplerToplami);	
	}
	    }

