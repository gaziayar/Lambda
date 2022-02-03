package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan girdi olarak bir Dize almak için bir Java programı yazın
		 * 
		 * ve bu dizede oluşan maksimum karakteri bulun. (Büyük/küçük harf duyarlılığını
		 * yoksay)
		 * 
		 * giriş:
		 * 
		 * Java öğrenmek kolaydır
		 * 
		 * çıktı:
		 * 
		 * oluşan maksimum karakter: a
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle  girin: ");
		String isim = scan.nextLine().toLowerCase();
		String str[] = isim.split("");
		int sayac = 0;
		String bos = "";
		int max = 0;
		for (int i = 0; i < isim.length() - 1; i++) {
			for (int j = 0; j < isim.length() - 1; j++) {

				if (str[i].equals(str[j])) {
					sayac++;
				}

			}

			if (sayac > max) {
				max = sayac;
				bos = str[i];

			}

			sayac = 0;

		}

		System.out.println("maximum occurring character is : " + bos);

	}

}
