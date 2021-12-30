package kenanHoca;

import java.util.Scanner;

public class Sorular_01 {
    public static void main(String[] args) {

       /*
    1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

    Test Data
    34
    Beklenen Çıktı
    7

  */
    Scanner scan=new Scanner (System.in);
        System.out.println("lutfen toplamak icin iki sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();
        int toplam=0;
    toplam=sayi1+sayi2;
        System.out.println("toplam "+ (sayi1+sayi2));
    }

}