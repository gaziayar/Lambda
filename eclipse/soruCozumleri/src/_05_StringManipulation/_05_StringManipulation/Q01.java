package _05_StringManipulation._05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        

        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
Scanner scan =new Scanner (System .in);
    	
    	System.out.println(" lutfen bir string girin : ");
    	
    	String str=scan.nextLine();
    
   boolean varMi=str.contains(" ");
    
    System.out.println("girilen stringde bosluk var mi? : " + varMi);
    
    str.isEmpty();
    System.out.println("girilen string bos mu?:" + str.isEmpty());
    }
}

