package day03;

import java.util.Scanner;

public class C02_Scanner {
	public static void main(String[] args) {
		// soru 7) Kullanicidan ismini alip isminin bas harfini yazdirin.

		Scanner scan = new Scanner (System.in);
		System.out.println("lutfen isiminizi girin");
	     
	char ilkHarf=scan.next().charAt(0);
	System.out.println("isminizin ilk harfi:" + ilkHarf);
	

	
	
	
	
	}

}
