package _07_ForLoop;

import java.util.Scanner;

public class Q02replitIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata
		 * ceviren java kodunu yaziniz.
		 * 
		 * Input :
		 * 
		 * John White
		 * 
		 * 1234234534561478
		 * 
		 * Output : Name :
		 * 
		 * J* W**
		 * 
		 * CCN : ** ** **** 1478
		 * 
		 * Ilk Harfler Buyuk harf ile baslamalidir.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen adinizi girin: ");

		String isim = scan.nextLine();

		System.out.println("lutfen soyadinizi girin");

		String soyIsim = scan.nextLine();

		System.out.println("lutfen kart numaranizi girin");
		String kartNo = scan.nextLine();
	
		
		
	
		
		System.out.println(isim.replaceAll("[a-z]", "*" ));
		System.out.println(soyIsim.replaceAll("[a-z]", "*" ));
		
		System.out.println("**** **** **** " + kartNo.substring(12));
		

	scan.close();
	}
	
	
	

}
