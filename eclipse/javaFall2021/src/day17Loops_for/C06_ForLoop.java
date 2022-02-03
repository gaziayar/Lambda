package day17Loops_for;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner (System .in);
		System.out.println(" lutfen faktoryel hesaplamak icin 10'dan kucuk bir sayi girin:");
		int sayi=scan.nextInt();
System.out.print(sayi+"!=");
	int faktoryel=1;
	
	for (int i = sayi; i >1; i--) {
		faktoryel*=i;
	
	System.out.print(i+"*");
	}
	System.out.print("1=" +faktoryel);
	
	
	
	scan.close();
	
	
	}

}
