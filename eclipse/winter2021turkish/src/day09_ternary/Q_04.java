package day09_ternary;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan= new Scanner(System.in);
	System.out.println("lutfen bir tam sayi giriniz");
	int sayi1= scan.nextInt();
	System.out.println("ikinci bir tam sayi girin");
	int sayi2= scan.nextInt();
	
	System.out.println("Girilen sayilarin toplami:" +(sayi1+sayi2));
	
	System.out.println("Girilen sayilarin carpimi:" +(sayi1*sayi2));
	
	System.out.println("Girilen sayilarin bolumu:" +(sayi1/sayi2));
	
	System.out.println("Girilen sayilarin farki:" +(sayi1-sayi2));
	
	System.out.println("Girilen sayilarin toplami:" +(sayi1+sayi2) 
			
		+"\n\"Girilen sayilarin carpimi:" +(sayi1*sayi2) 
		+"\n\"Girilen sayilarin bolumu:" +(sayi1/sayi2)
		+"\n\"Girilen sayilarin farki:\n" +(sayi1-sayi2));
	
	
	
	
	
	}

}
