package day17Loops_for;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner (System .in);
		System.out.println(" lutfen 100'den  kucuk bir sayi girin:  ");
		int num=scan.nextInt();
	
	
	for (int i = 1; i <= num; i++) {
		if (num%3==0 && num%5==0) {
			System.out.println("java guzeldir");
		} else if (num%3==0) {
			System.out.println("java");
		} else if (num%5==0){
System.out.println("Guzeldir");
		}else System.out.println(i);{

		}
	}
	
	
	}

}
