package _for_while;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
		 * 
		 * Input :
		 * 
		 * 30
		 * 
		 * 40
		 * 
		 * Beklenen Cikti: copied! Beklenen Cikti: 30 ve 40 icin GCD = 10
		 * 
		 * 30 ve 40 icin LCM = 120
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki tam sayi girin");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int carpi = num1 * num2;
		//int bolu = 0;
		int ebob = 1;
		int ekok = 1;
		for (int i = 1; i <=num1 && i <=num2; i++) {
			if (num1%i==0  &&  num2%i==0) {

				ebob = i;
				ekok = carpi / ebob;

			}
		}
		System.out.println(num1 + "ve " + num2 + " icin GDC= " + ebob);
		System.out.println(num1 + "ve " + num2 + " icin LCM= " + ekok);

	}

}
