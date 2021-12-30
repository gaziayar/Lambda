package kenanHoca;

import java.util.Scanner;

public class Soru_07 {
    public static void main(String[] args) {
      //7-----
      //        Ugly Number:
      //Girilen bir sayının  ugly number olup olmadığını kontrol etmek için bir Java programı yazın.
      //Sayı sisteminde,  ugly number  sadece asal faktörleri 2, 3 veya 5 olan pozitif sayılardır.
        // İlk 10  ugly number 1, 2, 3, 4, 5, 6, 8, 9, 10, 12'dir. Kural olarak, 1 dahil.

      //Test Data:
      //13
      //Beklenen çıktı:
      //ugly number  degildir
      //Test Data:
      //25
      //Beklenen Çıktı:
      //ugly number




    }

    public static class Soru_08 {
        public static void main(String[] args) {
          //8----
          //Girilen String değerde tersten yazan Java kodunu yazınız.

          //Test Data:
          //java
          //        avaj

            Scanner scan =new Scanner (System .in);
            System.out.println(" lutfen tersine cevirmek icin bir yazi girin:  ");
            String str=scan.nextLine();

            for (int i = str.length()-1; i >=0; i--) {
                System.out.print(str.substring(i,i+1));
            }




        }
    }
}
