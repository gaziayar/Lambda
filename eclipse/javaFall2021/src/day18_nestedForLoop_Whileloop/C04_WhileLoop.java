package day18_nestedForLoop_Whileloop;

import java.util.Scanner;

public class C04_WhileLoop {

	public static void main(String[] args) {

		// kullanicdan top uzere sayi isteyin
		// kullanici sifira basincaya kaadar sayilari alip toplamaya devam etdin
		// kul sifira bastiginda
		// o ana kadar sifir haric kac sayi girdigini ve sayilarin toplamini yazdirin

		Scanner scan = new Scanner(System.in);
		int sayi = 100;
		int sayac = 0;
		int toplam = 0;

		while (sayi != 0) {
			System.out.println("lutfen durmadan sayi girin:\nBitirmek icin 0'a basin");

			 sayi = scan.nextInt();

			toplam = toplam + sayi;
			sayac = sayac + 1;

		}

		System.out.println(sayac -1 + " adet sayi girdiniz sayilarin toplami: " + toplam);

		/*
		 * int sayi = 100; int toplam = 0; int sayac = 0;
		 * 
		 * while (sayi != 0) { System.out.
		 * println("lutfen toplamak icin bir tam sayi yazn\n bitirmek icin 0 a basin");
		 * sayi = scan.nextInt(); toplam += sayi; sayac++;
		 * 
		 * } System.out.println("girilen sayi adedi: " + (sayac-1));
		 * System.out.println("girilen sayilarin toplami : " +toplam);
		 */
	}

}
