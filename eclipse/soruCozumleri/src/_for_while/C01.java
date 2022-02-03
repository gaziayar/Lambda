package _for_while;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// Kullanıcıdan bir isim ve bir karakter girmesini isteyin, ardından döngüleri
		// kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.

		// char ch1= 'a' ;

		// String name =“John came late"

		// Expected Output:

		// Number of a = 2

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir  isim veya \n karakter girin");
		String isim = scan.nextLine();
		char krk = scan.nextLine().charAt(0);
		int sayac = 0;

		for (int i = 0; i < isim.length(); i++) {
			if (krk == isim.charAt(i)) {
				sayac++;

			}  

		}

		System.out.println(" Number of a = 2" + sayac);

	}

}
