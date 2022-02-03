package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

	/*
	 * Problem Tanımı Girilen bir sayı kadar satır ve sütünu olan ve sağ
	 * kenara dayalı üçgeni basan kodu yazınız.
	 * 
	 * Ekran Çıktısı Bir sayi giriniz: 5
	 *
	 **
	 ***
	 ****
	 *****
	 * 
	 */

	public static void main(String[] args) {
		for (int i = 5; i > 0; i--) {
			//for (int j = 0; j < i; j++) {// bu loop'u yoruma alinca diger sekil olusuyor
			//	System.out.print(" ");
		//	}
			for (int k = 5; k > i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		
		
		
		
		
		
		
		
		/*
		 *
		 * * * * * * * * * * * şeklini yazdırınız
		 */

	}
}
