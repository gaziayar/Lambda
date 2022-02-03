package day0_Odev;

import java.util.Scanner;

public class C25_odevSoru2 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen bir kenar uzunlugu girin");
	
	double kenar= scan.nextDouble();
	
	
	System.out.println(" Karenin alani= " +  kenar * kenar);
	
	System.out.println("karenin cevresi=" + kenar*4);
	}

}
