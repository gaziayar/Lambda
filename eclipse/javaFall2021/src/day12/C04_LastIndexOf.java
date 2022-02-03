package day12;

import java.util.Scanner;

public class C04_LastIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan =new Scanner (System .in);
			
			System.out.println(" lutfen bir cumle girin");
		
		String cumle=scan.nextLine();
	System.out.println("lutfen varligini kontrol etmek icin bir kelime girin");
	
	String kelime=scan.next();
	int ilkindex=cumle.indexOf(kelime);
	int sonIndex=cumle.lastIndexOf(kelime);
	
	if(ilkindex==(-1)) {
		System.out.println("girilen kelime cumlede kullanilmamis");
	}
	else if (ilkindex==sonIndex){
	System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
	}
	else {
		System.out.println("Girilen kelime cumlede 1 den fazla kullanilmis.");
	}
	
	scan.close();
	
	}
	
	}


