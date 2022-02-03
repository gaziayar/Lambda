package _07_ForLoop;

import java.util.Scanner;

public class Q_replit2 {

	public static void main(String[] args) {
		// Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini
		// konsola yazdıran bir program yazın.

//Ornek Cikti :

//Alan: 9

//Cevre: 12

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kenar uzunlugu girin");
		int sayi = scan.nextInt();
	
	System.out.println("alan :" + sayi*sayi+ "\n" +"cevre :" + sayi*4 );
	
	scan.close();
	
	}

}
