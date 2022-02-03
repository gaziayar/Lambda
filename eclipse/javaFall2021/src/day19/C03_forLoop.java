package day19;

import java.util.Scanner;

public class C03_forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("lutfen toplamini bulmak icin pozitif bir tam sayi giriniz:");

		int sayi = scan.nextInt();
		int rakamlarToplami = 0;
		int rakam = 0;

		String sayiStr = "" + sayi;

		for (int i = 0; i < sayiStr.length(); i++) {
      rakam=sayi%10;
      rakamlarToplami+=rakam;
      sayi/=10;
		}
		System.out.println("girdiginiz sayinin rakamlar toplami :" + rakamlarToplami);

	}

}
