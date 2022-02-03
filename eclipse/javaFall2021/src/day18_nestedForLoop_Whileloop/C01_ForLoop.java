package day18_nestedForLoop_Whileloop;

import java.util.Scanner;

public class C01_ForLoop {

	public static void main(String[] args) {
		// iki tam sayi isteyin
      //ilk say baslayarak 2. sayiya kfadar 3 er3 er yazdirin 
	
	 // ikinci sayi dahil degil
	
	
		Scanner scan =new Scanner (System .in);
		System.out.println(" lutfen 2 tam sayi girin sayi girin:  ");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
	
		if (sayi1>sayi2) {
		for (int i = sayi1; i >=sayi2; i-=3) {
			System.out.print(i +" ");
		}
			
			
		} else  if (sayi1<sayi2) {
		for (int i = sayi1; i <= sayi2; i+=3) {
			System.out.print(i +" ");
		}	
				
		} else {
System.out.print("girilen sayilar esit");
		}{

		}
			
	scan.close();	
			
		
	}

}
