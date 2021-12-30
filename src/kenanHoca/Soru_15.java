package kenanHoca;

import java.util.Scanner;

public class Soru_15 {
    public static void main(String[] args) {
     // 15----
     // Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

     // Test Data:
     // Java is fun


     // Beklenen Çıktı
     // 0. pozisyondaki karakter : J

     // 5. pozisyondaki karakter : i

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String str= scan.nextLine();
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));

    }
}
