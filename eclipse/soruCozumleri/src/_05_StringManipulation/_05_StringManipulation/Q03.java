package _05_StringManipulation._05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        // Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.

    
    
Scanner scan =new Scanner (System .in);
    	
    	System.out.println(" lutfen adinizi ve soyadinizi  girin : ");
    	
    	String adSoyad=scan.nextLine();
    
  char ilkHarf=adSoyad.toUpperCase().charAt(0);
  char ikinciHarf=adSoyad.toUpperCase().charAt(adSoyad.indexOf(" ")+1);
   
  char ucuncuHarf=adSoyad.toUpperCase().charAt(adSoyad.lastIndexOf(" ")+1); 
  
    System.out.println("isminizin ilk harfleri:" +ilkHarf+"."+ikinciHarf+"."+ucuncuHarf+".");
    
    
    
    
    scan.close();
    
    
    
    
    
    
    }       
}

