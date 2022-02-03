package day12;

import java.util.Scanner;

public class C03_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 Scanner scan =new Scanner (System .in);
			
			System.out.println(" lutfen bir cumle girin");
		
		String cumle=scan.nextLine();

				System.out.println(" lutfen varligini kontrol etmek icin bir harf giriniz");
		
		char krk=scan.next().charAt(0);
		
		int index=cumle.lastIndexOf(krk);
	
	if (index==(-1)) {
		System.out.println("harf cumlede kullanilmamis");
	} else {
     System.out.println("harf cumlede kullanilmis");
	}
	
	
	
	
	
	
	
	}

}
