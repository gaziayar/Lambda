package _07_ForLoop;

import java.util.Scanner;

public class Q08replit {

	public static void main(String[] args) {
		// Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

         //Örnek Çıktı:

         //Verilen tamsayının rakamları toplamı 10'dur.

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen uc basamakli bir sayi girin");
	
	int sayi=scan.nextInt();
	
	int sayi1=(sayi/100);
	System.out.println(sayi1);
	int sayi2=(sayi/10)%10;
	System.out.println(sayi2);
	int sayi3=sayi%10;
	System.out.println(sayi3);
	
	
	
	System.out.println(sayi1 + sayi2 + sayi3);
	}

}
