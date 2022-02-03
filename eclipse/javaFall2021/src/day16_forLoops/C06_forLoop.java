package day16_forLoops;

import java.util.Scanner;

public class C06_forLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan =new Scanner (System .in);
		System.out.println(" lutfen 100'den  kucuk bir sayi girin:  ");
		int sayi=scan.nextInt();
	for (int i = 1; i <=sayi; i++) {
		if (i%3==0 || (i%5==0)) {
			System.out.print(i+" ");
			}
		}
	
	scan.close();
	
	}

}
