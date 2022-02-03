package day12;

import java.util.Scanner;

public class C01_IndexOf {

	public static void main(String[] args) {
//kul bir cum gir isteyin
	//harfin cumlede olup olmagini yazdirin
  Scanner scan =new Scanner (System .in);
		
		System.out.println(" lutfen bir cumle girin");
	
	String cumle=scan.nextLine();

			System.out.println(" lutfen varligini kontrol etmek icin bir harf giriniz");
	
	char krk=scan.next().charAt(0);
	
	int index=cumle.indexOf(krk);
	
	if (index<0) {
		System.out.println("girilen harf verilen cumlede yok");
	}
	
	else {
		System.out.println("girilen harf verilen cumlede var");
	} 
	
	
	}

}
