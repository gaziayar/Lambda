package day07_ifelsestetament;

import java.util.Scanner;

public class C1_IfStatement {

public static void main(String[] args) {
	

Scanner scan = new Scanner (System.in);

System.out.println(" lutfen bier tam sayi giriniz");

  int sayi=scan.nextInt();

if ( sayi>0) {
	System.out.println(" sayi pozitif");
}
 


if (sayi <100) {
	System.out.println( "kucuk sayi ");
}
 if (sayi>1000) {System.out.println(" buyuk sayi");
	
}



}

}
