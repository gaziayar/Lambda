package day08_ifElseifnestedif;

import java.util.Scanner;

public class C3_ArtikYil {
public static void main(String[] args) {
	
	Scanner scan= new Scanner (System .in );
    System.out.println("lutfen yil yaziniz");
     int yil=scan.nextInt();

if (yil%4==0 && yil%100!=0) {
	System.out.println("artik yil");
} else if(yil%4==0 && yil %100==0 && yil%400==0){
System.out.println("artik yil");
}else {System.out.println("artik yil degil");}



}
}
