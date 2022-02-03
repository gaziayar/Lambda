package day16_forLoops;

import java.util.Scanner;

public class C05_forLoop {

	public static void main(String[] args) {
		

		 Scanner scan =new Scanner (System .in);
			
			System.out.println(" lutfen yuzden kucuk bir sayi girin");
		double num=scan.nextDouble();
		int sayi=(int)num;
	// say nr ise	
		
		if (num<0) {
			System.out.println("negatif giremezsin");
		} else if (sayi!=num) {
			System.out.println("tam sayi giriniz");
		} else if (sayi>100){System.out.println("yuzden kucuk sayi gir");
for (int i = 1; i <= num; i++) {
			
if (i%3==0) {
	System.out.print(i+ " ");
} 
}	
		
		
}	
}
}
