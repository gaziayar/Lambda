package _07_ForLoop;

import java.util.Scanner;

public class Q_replit6 {

	public static void main(String[] args) {
		// Kullanıcıdan bir Float değer girmesini isteyin,
		// bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi girin");
	
	float sayi= scan.nextFloat();
	
	short sayi1= (short) sayi;
	 System.out.println(sayi1);

	scan.close();
	}

}
