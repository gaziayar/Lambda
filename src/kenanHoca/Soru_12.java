package kenanHoca;

import java.util.Locale;
import java.util.Scanner;

public class Soru_12 {
    public static void main(String[] args) {
     //12----
     //Kullanıcının girdiği String değerlerini büyük harfe çeviren Java kodunu yazınız.

     //Test Data:
     //Java is fun

     //Beklenen Sonuç:
     //JAVA IS FUN


        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String str= scan.nextLine();

        System.out.println(str.toUpperCase(Locale.ROOT));
    }
}
