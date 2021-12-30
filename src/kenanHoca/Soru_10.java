package kenanHoca;

import java.util.Scanner;

public class Soru_10 {
    public static void main(String[] args) {
     // 10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.

     // Test Data:
     // Java is easy

     // Aranan String: is

     // Bektenen Çıktı:
     // True

     // Aranan String: and

     // Beklenen Çıktı:False

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String str= scan.nextLine();
        System.out.println("lutfen aradiginiz kelimeyi girin");
        String str1= scan.nextLine();

        if (str.contains(str1) ){
            System.out.println(str1 +" true");
        }else {
            System.out.println(str1+ " false ");
        }

    }
}
