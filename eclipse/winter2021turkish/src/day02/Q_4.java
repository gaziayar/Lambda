package day02;

import java.util.Scanner;

public class Q_4 {

	public static void main(String[] args) {
		// //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

		Scanner scan= new Scanner (System .in );
		
	    System.out.print("LUTFEN BIR SAYI GIRINIZ  :");
	
	int sayi=scan.nextInt();
	    
	    
	System.out.println("***** ternary cozum *****");
	
	    
	String sonuc=(sayi>=0)?((sayi<10)?("rakam"):("pozif sayi")):("negatif sayi");
	
	System.out.println(sonuc);
	System.out.println("if cozum");
	
	if (sayi>=0) {
	       if (sayi<10) {	System.out.println("rakam");
	}
	else {
		System.out.println("pozitif sayi");
	}
	}else {
		System.out.println("negatif sayi");}

}
}