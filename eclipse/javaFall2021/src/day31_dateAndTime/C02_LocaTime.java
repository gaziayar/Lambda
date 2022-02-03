package day31_dateAndTime;

import java.time.LocalTime;

public class C02_LocaTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime saat=LocalTime.now();
		
		System.out.println("baslangic saati "+saat);
		
		int sayi=10;
		for (int i = 0; i <10000; i++) {
			sayi++;
		}
		
		LocalTime saatBitis=LocalTime .now();
		
		
		System.out.println("bitis saati "+saatBitis);
		
		System.out.println(saat.getNano());
		double nano1=saat.getNano();
		double nanoBitis=saatBitis.getNano();
		System.out.println("for loop "+(nanoBitis-nano1)+" nano saniyede tamamlandi");
		System.out.println();
		
		
	//	LocalTime yerel=LocalTime.
	}

}
