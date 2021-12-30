package kenanHoca;

import java.util.Arrays;
import java.util.Scanner;

public class Soru_24 {
    public static void main(String[] args) {
        //24----
        //yazılan değerin array içerisinde arayan Java Kodu yazınız.

        //Array: [1551,1223,1443,1267,1789,1023,2020]


        //Aranan Değer:2020
        //Beklenen Çıktı:True

        //Aranan Değer:2010
        //Beklenen Çıktı :False
        Scanner scan = new Scanner(System.in);
        int arr[] = {1551, 1223, 1443, 1267, 1789, 1023, 2020};
        System.out.println(Arrays.toString(arr));
        System.out.println("Lutfen aradiginiz sayiyi giriniz");
        int sayi = scan.nextInt();
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == sayi) {
                System.out.println("true");
                flag = false;
                break;
            }

        }
        if (flag) {

        System.out.println("false");
    }
    }

    }

