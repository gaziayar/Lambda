package day0_Odev;

import java.util.Scanner;

public class C25_Odevvv {

	public static void main(String[] args) {

		// Kullanicidan bir sayi alin.
		// Bu sayinin tek mi cift mi oldugunu,
		// sifirdan buyuk mu kucuk mu oldugunu, ayrica ve 100’den buyukse birler,
		// onlar ve yuzler basamagindaki rakamlarin toplamini,
		// 100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi  girin");

		int s = scan.nextInt();
		tC(s);
		sBK(s);
		boy(s);

	}

	public static void boy(int s) {
		int b = s % 10;
		int o = s / 10 % 10;
		int y = s / 100 % 100;

		if (s >= 100) {
			System.out.println("birler,onlar ve yuzler basamagindaki rakamlarin toplamini," + (b + o + y));
		} else {
			System.out.println("birler basamagi" + b);
		}

	}

	public static void sBK(int s) {
		if (s > 0) {
			System.out.println("sayi sifirdan buyuktur");
		} else if (s < 0) {
			System.out.println("sayi sifirdan kucuktur");
		} else {
			System.out.println("sayi sifira esittir");
		}

	}

	public static void tC(int s) {
		if (s%2==0) {
			System.out.println("bu sayi cift sayi");
		} else {
			System.out.println("bu sayi tek sayi");
		}

	}
}
