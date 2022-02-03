package _07_ForLoop;

import java.util.Scanner;

public class Q06replitIf {

	public static void main(String[] args) {
		/*Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır.
		
		 Ardından, adın aynı karakterlere sahip olup olmadığını kontrol edin.

		Eger aynı karakterlere sahipse

		"isim ayni karakterlere sahiptir." yazdirin.

		Eger ayni kaakterlere sahip degilse

		"Dizenin benzersiz karakterleri var" yazdirin.

		Ternary kullanin.
*/
	
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir isim girin uzunlugu 3 olmali: ");
	
	String isim =scan.nextLine();
	
	char a=isim.charAt(0);
	char b=isim.charAt(1);
	char c=isim.charAt(2);
	String sonuc = isim.length()==3  ? (a==b && b==c) ? ": isim ayni karakterlere sahiptir" : " Dizenin benzersiz karakterleri var"
			:  " girdiginiz isim 3 harfli degil";
	 
	



System.out.println(sonuc);
	
	scan.close();
	
	}

}
