package kenanHoca;

import java.util.Scanner;

public class Soru_19 {
    public static void main(String[] args) {
     //19----
     //Kullanıcı tarafından girilen bir yılın  artık yıl olup olmadığını kontrol etmek için bir Java Methodu yazınız.

     //Test Data:
     //2017

     //Beklenen Çıktı:
     //false

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir yil giriniz");
       int yil= scan.nextInt();
       {
          if(yil%100==0){
             if(yil%400==0) {
                 System.out.println("artik yil");

             }else {
                 System.out.println("artik yil degil");
             }

          } else {
              if(yil%4==0){
                  System.out.println("artik yil");

              } else {
                  System.out.println("artik yil degil");
              }
          }
       }


    }
}
