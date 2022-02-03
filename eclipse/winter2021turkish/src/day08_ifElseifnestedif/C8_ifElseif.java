package day08_ifElseifnestedif;

import java.util.Scanner;

public class C8_ifElseif {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);

	//kullanicidan dort basamakli bir sayi girmesini isteyin
	// sayi 5e bolunebiliyorsa son rakami kontrol edin
	//  son rakam 0 ise 5 e bolunen cift sayi yzdirin
	// son rakam 0 degilse 5 e bolunen tek yazdirin
    //girdigi password 5 e bolunemiyorsa tekrar deneyin yazdirin
System.out.println(" lutfen dort basamakli bir sayi giriniz");
	 	
double sayi= scan.nextDouble();;
         
    if (sayi%5==0) {System.out.println( " son rakami kontrol edin");
		if (sayi%2==0) { System.out.println("5 e bolunen cift sayi");}
	
  
    
    } else if( sayi%2!=0)  
    {System.out.println( " 5 e bolunen tek sayi");}
    
    if (sayi%5!=0) {System.out.println("tekrar deneyin");
		
	} else {

	}}}
	

   

	
     
	  

	
		
	 

	

	
	
	
	
	
	
	
	
	
	
	

