package day18_nestedForLoop_Whileloop;

import java.util.Scanner;

public class C02_NestedForLoop {

	private static Object scan;

	public static void main(String[] args) {
		// kul dan 10 dan kucuk pozitif bir tam sayi is

		// gir sayiya gore as sekli yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("10 dan kucuk tam sayi gir : ");
		int sayi = scan.nextInt();
		for (int satir = 1; satir <= sayi; satir++) {

			for (int i = 1; i <= satir; i++) {
				System.out.print(i + " ");

			}
			System.out.println("");
		}

		scan.close();

	}

}
