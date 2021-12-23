package day40;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayi=0;
		int toplam=0;
	    int count=0;
		Scanner scan = new Scanner (System.in);//InputMismatchException
		try {while (count<10000) {
			
			System.out.println("lutfn toplamak icin sayi girin\n Bitirmek icin sayi disinda bir tusa a basin");
			sayi=scan.nextInt();
			toplam+=sayi;
			count++;
			}
			
		} catch(InputMismatchException e) {
			
		}
		
		
	
	System.out.println("sayilarin toplami :"+toplam);
	
	}

}
