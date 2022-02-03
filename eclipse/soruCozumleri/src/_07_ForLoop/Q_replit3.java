package _07_ForLoop;

import java.util.Scanner;

public class Q_replit3 {

	public static void main(String[] args) {
		// Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

		//Örnek Çıktı:

		//Alan: 32

		//Çevre: 24

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir dikdortgenin  kenar uzunlugu girin");
		int sayi = scan.nextInt();
		System.out.println("lutfen ikinci kenar uzunlugu girin");
	int sayi1=scan.nextInt();
	
	System.out.println("alan: " + sayi*sayi1 + "\n" + "cevre : " + (sayi+sayi1)*2) ;
	
	
	
	scan.close();
	
	
	}

}
