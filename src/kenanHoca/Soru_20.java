package kenanHoca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru_20 {
    public static void main(String[] args) {
   //    20----
   //    Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
   //            not: Test datadaki değerleri kullanınız.


   //    Test Data:
   //[1232, 1134,2345,1022]
   //[Java, Python, PHP, C#, C Programming, C++]

   //    Beklenen Çıktı:
   //[1022,1134,1232,2345]
   //[C Programming, C#, C++, Java, PHP, Python]

List<Integer> List = new ArrayList(Arrays.asList(1022,1134,1232,2345));

        System.out.println(List.stream().sorted());

int sayi=3;

    }
}
