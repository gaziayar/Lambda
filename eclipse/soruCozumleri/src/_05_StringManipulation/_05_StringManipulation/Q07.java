package _05_StringManipulation._05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

    	Scanner scan =new Scanner (System .in);
    	
    	System.out.println(" lutfen isminizi girin : ");
    	
    	String isim=scan.nextLine();
    	
      // System.out.println("if ile cozum");
       char ih1=isim.charAt(0);
       char ih2=isim.charAt(1);
       char ih3=isim.charAt(2);
    	
    if (isim.length()==3) {
		if (ih1!=ih2 && ih2!=ih3&& ih1!=ih3) {
			System.out.println("girilen isin uc harfli ve uniqe");
		} else {
			System.out.println("girilen isin uc harfli ama unuqe degil");
		}	
    		
    		
    		
		} else {
			
			
		}
    	
    	System.out.println("ternary ile cozum");
    	
    	String sonuc=isim.length()==3 ? (ih1!=ih2 && ih2!=ih3&& ih1!=ih3) 
    			?"girilen isin uc harfli ve uniqe": "girilen isim uc harfli ama unuqe degil"
:"girilen isin uc harfli degil";
    	
    	System.out.println(sonuc);
    	
    	scan.close();	
    	
    }
}