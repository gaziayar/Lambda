package _07_ForLoop;

import java.util.Scanner;

public class Q10replit {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına
		 * dönüştürmek için bir Java programı yazın.
		 * 
		 * INPUT:
		 * 
		 * Dakika sayısı: 3456789
		 * 
		 * OUTPUT :
		 * 
		 * 3456789 dakika yaklaşık 6 yıl 210 gündür
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir dakika  girin");

		int dakika = scan.nextInt();

		int gun = dakika / 60 / 24;
		int yil = gun / 365;
		int kalanGun = gun % 365;

		System.out.println(yil + " " + kalanGun);
	scan.close();
	}

}
