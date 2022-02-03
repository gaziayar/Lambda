package day15_MethodCreation;

import java.util.Scanner;

public class CO2_MethodCreation {

	public static void main(String[] args) {
		/*  Kullaniciya kac sayi toplamak istedigini sorun.
		Kullanici 2,3 veya 4 degerini girerse, 
		kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. 
		Kullanici toplamak istedigi sayi adedini 
		4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.

	*/
	

		Scanner scan = new Scanner(System.in);

		System.out.println(" lutfen toplamak istediginiz sayi adedini 2,3 veya  4 den biri olarak secin");

	int tercih =scan.nextInt();
	if(tercih>4)
	{tercih= 5; }
	switch (tercih) {
	
	case 2:
	        ikiSayiTopla();
	    break;
	    
	    case 3:
		   ucSayiTopla();
	    break;
	    
		case 4:
			dortSayiTopla();
		case 5:
			System.out.println("cok girdiniz ben toplayamam");
			
	break;
	default:
	System.out.println("gecersiz tercih");
	}
	
}

	private static void dortSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("dort sayi girin \n her sayidan sonra enter'a basin");
		double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        double sayi3=scan.nextDouble();
        double sayi4=scan.nextDouble();;
       
       System.out.println("girdiginiz dort sayinin toplami");
	
	}

	private static void ucSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("uc sayi girin \n her sayidan sonra enter'a basin");
		double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
        double sayi3=scan.nextDouble();
       System.out.println("girdiginiz uc sayinin toplami");
	}

	private static void ikiSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("iki sayi girin \n her sayidan sonra enter'a basin");
		double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();
   	
	System.out.println("girdiginiz iki sayinin toplami");
	
	
	}
}
