package day0_Odev;

import java.util.Scanner;

public class C25_MethodCreation {

	public static void main(String[] args) {
        // Soru 2
        // Kullaniciya kac sayi toplamak istedigini sorun.
        // Kullanici 2,3 veya 4 degerini girerse,
        // kullanicidan bu sayilari girmesini isteyin
        // ve sayilarin toplamini yazdirin.
        // Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse
        // “Cok sayi girdiniz, ben toplayamam” yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kac sayi toplamak istediginizi girin");
        int s = scan.nextInt();
        sT(s);
    }
    public static void sT(int s) {
        Scanner scan = new Scanner(System.in);
        if (s == 2) {
            System.out.println("Lutfen birinci sayiyi girin");
            int sa1 = scan.nextInt();
            System.out.println("Lutfen ikinci sayiyi girin");
            int sa2 = scan.nextInt();
            System.out.println("iki sayinin toplami "+(sa1+sa2));
        } else if (s == 3) {
            System.out.println("Lutfen birinci sayiyi girin");
            int sb1 = scan.nextInt();
            System.out.println("Lutfen ikinci sayiyi girin");
            int sb2 = scan.nextInt();
            System.out.println("Lutfen ucuncu sayiyi girin");
            int sb3 = scan.nextInt();
            System.out.println("uc sayinin toplami "+(sb1+sb2+sb3));
        } else if (s == 4) {
            System.out.println("Lutfen birinci sayiyi girin");
            int sc1 = scan.nextInt();
            System.out.println("Lutfen ikinci sayiyi girin");
            int sc2 = scan.nextInt();
            System.out.println("Lutfen ucuncu sayiyi girin");
            int sc3 = scan.nextInt();
            System.out.println("Lutfen dorduncu sayiyi girin");
            int sc4 = scan.nextInt();
            System.out.println("dort sayinin toplami "+(sc1+sc2+sc3+sc4));
        }else {
            System.out.println("Cok sayi girdiniz, ben toplayamam");
        }
    }
}
