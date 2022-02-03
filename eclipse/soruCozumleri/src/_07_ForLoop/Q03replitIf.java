package _07_ForLoop;

import java.util.Scanner;

public class Q03replitIf {

	public static void main(String[] args) {
		/*
		 * Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve
		 * yazdıran bir Java programı yazın. Verilen tamsayılar veya toplam 10'dan fazla
		 * basamakli olursa, "OverFlow" yazdırın.
		 * 
		 * Ornek:
		 * 
		 * INPUT :
		 * toplam =  (sayi1 + sayi2);
		 * 25
		 * 
		 * 46(sayi1 >= 1000000000 && sayi2 >= 1000000000  && toplam >= 1000000000) 
		 * 
		 * OUTPUT :
		 * 
		 * Numaralarin Toplami:
		 * 
		 * 71
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi girin: ");

		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double toplam =0;

		if (sayi1 >= 0 && sayi2 >= 0 ) {
			 toplam =  (sayi1 + sayi2);
			System.out.println("numaralarin toplam: " + (toplam));
	}
		if (sayi1>= 1000000000 || sayi2>= 1000000000  || toplam>= 1000000000) {
			System.out.println("OverFlow");
		}

		
		scan.close();
	}

}


