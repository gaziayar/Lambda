package _07_ForLoop;

import java.util.Scanner;

public class switch8 {

	public static void main(String[] args) {
		// Kullanıcıdan bir isim girmesini isteyin ve son 2 harfinin 3 kopyasından
		// oluşan yeni bir String yazdırın

		// Kullanicidan alinan isim uzunluğu en az 2 olacaktır.

		// INPUT : Mustafa

		// OUTPUT : fafafa

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir  isim  girin");
	    String isim=scan.nextLine();
		
		
		System.out.println(isim.substring(isim.length()-2) +
				isim.substring(isim.length()-2) + isim.substring(isim.length()-2));
		
		
		
		
		
	}

}
