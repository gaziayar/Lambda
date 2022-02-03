package day31_dateAndTime;

import java.time.LocalTime;

public class C04_DateTime {

	public static void main(String[] args) {

		LocalTime saat = LocalTime.now();
		System.out.println("baslangic saati " + saat);

		int sayi = 10;
		for (int i = 0; i < 10000; i++) {
			sayi++;
		}

		LocalTime saatBitis = LocalTime.now();

		System.out.println("bitis saati " + saatBitis);

		System.out.println(saat.getNano());
		double nano1 = saat.getNano();
		double nanoBitis = saatBitis.getNano();
		System.out.println("for loop " + (nanoBitis - nano1) + " nano saniyede tamamlandi");

		System.out.println("baslangic saati " + saat);

		
		LocalTime saatS = LocalTime.now();
		
		String str = "celil";
		for (int i = 0; i < 10000; i++) {
			str += " ";
		}

		LocalTime saatBitisS = LocalTime.now();

		System.out.println("bitis saati " + saatBitisS);

		System.out.println(saatS.getNano());
		double nanoS = saatS.getNano();
		double nanoBitisS = saatBitisS.getNano();
		System.out.println(" String for loop " + (nanoBitisS - nanoS) + " nano saniyede tamamlandi");

		double stringSure = nanoBitisS - nanoS;

		double intSure = nanoBitis - nano1;

		//System.out.println("for loop "+nanoBitis - nano1);

		// TODO Auto-generated method stub

	}

}
