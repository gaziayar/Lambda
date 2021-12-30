package kenanHoca;

import java.util.Scanner;

public class Soru_18 {
    public static void main(String[] args) {
     // 18----
     // Girilen Stringdeki  tüm sesli harfleri saymak için bir Java Methodu yazınız.

     // Test Data:
     // java is fun

     // Beklenen Çıktı:

     // Stringdeki sesli harf sayısı: 4
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen harf giriniz");
        String str=scan.next().toLowerCase();
        String sesliHarf="aeiou";
       int sayac =0;

        for (int i = 0; i <str.length() ; i++) {
            if(sesliHarf.contains(str.substring(i,i+1))){
                sayac+=i;

            }


        }
        System.out.println(sayac);

    }
    }

