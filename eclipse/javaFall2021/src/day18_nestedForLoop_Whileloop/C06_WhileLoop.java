package day18_nestedForLoop_Whileloop;

import java.util.Scanner;

public class C06_WhileLoop {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayilar isteyin
		//sayi adedi 10'u gecerse veya toplam 500'u gecerse
		//"Bu kadar sayi yeter"
		//..adet sayi girdin, toplami..."yazdirin
		Scanner scan = new Scanner(System.in);
		int sayi=0;
		int adet=0;
		int toplam=0;
	
	while (!(adet >10 || toplam >500)) {
	
		System.out.println("lutfen bir sayi girin");
		sayi=scan.nextInt();
	    toplam+=sayi;
        adet++;
	}
	System.out.println("Bu kadar sayi yeter");
		
		System.out.println(adet+" adet sayi girdin  toplami  " +toplam);
		
		
	}

}
