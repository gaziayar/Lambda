package _07_ForLoop;

import java.util.Scanner;

public class Q_replit4 {

	public static void main(String[] args) {
		// Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

					//1 şeker = 1.7 gr

					//Örnek Çıktı:

					//Yılda 12.41 kg şeker kullanıyor.

		Scanner scan = new Scanner(System.in);
		System.out.println("gunde kac bardak cay iciyorsunuz?");
		double cay = scan.nextDouble();
		System.out.println("gunde ne kadar seker kullandiginizi  girin");
	    double seker=scan.nextDouble();
	
	double yil=seker*(1.7/1000)*365*cay;
	
	System.out.println(" yilda " + yil + " kg seker kullaniyor");
	
	scan.close();
	
	}

}
