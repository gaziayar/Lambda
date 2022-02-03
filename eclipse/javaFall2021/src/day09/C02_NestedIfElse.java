package day09;

import java.util.Scanner;

public class C02_NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
Scanner scan= new Scanner (System .in );
		
		System.out.println(" lutfen dort basamakli  bir sayi giriniz");
	
	int sayi=scan.nextInt();
	
	if (sayi<1000 || sayi>9999) {
		System.out.println("4 basamakli pozitif sayi girmelisiniz");
		
	} else {// 4 e

		if (sayi%5==0) {// 5 e
			
		if (sayi%10==0) {// son rak 0
			
		System.out.println(" bese tam bolunen cift sayi");
		} else {// son rak 5

		System.out.println("bese tam bolunen tek sayi");
			
		}	
			
			
			
			
			
		} else { // 5 e  bolunemeyen
System.out.println("lutfen tekrar deneyin");
		}
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	}

}
