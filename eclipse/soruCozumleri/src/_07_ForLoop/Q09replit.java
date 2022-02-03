package _07_ForLoop;

import java.util.Scanner;

public class Q09replit {

	public static void main(String[] args) {
		// Girilen zamanı saniyeye çeviren bir program yazınız.

		//Örnek Çıktı:

		//1 saat 10 dakika 50 saniye ==>

		//4250 saniye

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir saat  girin");
	
	int saat=scan.nextInt();
	System.out.println("lutfen bir dakika  girin");
	int dakika=scan.nextInt();
	System.out.println("lutfen bir saniye  girin");
	int saniye=scan.nextInt();
	
	int toplamSaniye=(saat*60*60) + (dakika*60) + saniye;
	
	System.out.println(toplamSaniye);
	
	scan.close();
	
	
	
	
	}

}
