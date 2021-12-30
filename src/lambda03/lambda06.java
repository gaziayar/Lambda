package lambda03;

import java.util.stream.IntStream;

public class lambda06 {
    public static void main(String[] args) {
        System.out.println(topla(10));
        System.out.println("   ***   ");
        System.out.println(topla1(10));
        System.out.println("   ***   ");
        System.out.println(topla2(10));
        System.out.println("   ***   ");
        System.out.println(toplaCift(10));
        System.out.println("   ***   ");
        System.out.println(toplaCift1(10));
        System.out.println(" *** ");
        System.out.println(pztftekTamsayi(10));
        System.out.println(" *** ");
        ikiilkkuvvet(5);
     // ilkxkuvvet(5, 10);
     // ilkxkuvvet(3, 4);
     // ilkxkuvvet(2, 3);
     // System.out.println(ikincixkuvvet(2, 4));
    }


    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program yaziniz.

    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program yaziniz.
//Structured Programming
    public static int topla(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam += i;
        }
        return toplam;
    }

    //Functional Programming
    public static int topla1(int x) {

        return IntStream.range(1, x + 1).//1 2 3 ... x elemanarinin akısı --> 1 dahil x+1 hariç
                sum();

    }

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program yaziniz
    public static int topla2(int x) {

        return IntStream.rangeClosed(1, x).//1 2 3 ... x --> 1 ve x dahil
                sum();
    }

    //TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program yaziniz
    public static int toplaCift(int x) {

        return IntStream.rangeClosed(1, x).//1 2 3 ... x elemanarinin akısı
                //filter(Lambda01::ciftBul).//2 4 6 ... elaman akısı
                        filter(t -> t % 2 == 0).//2 4 6 ... elaman akısı
                        sum();

    }

    //TASK 03 --> Ilk x pozitif cift sayiyi toplayan program yaziniz
    public static int toplaCift1(int x) {
        return IntStream.iterate(2, t -> t + 2).limit(x).sum();


    }

    //TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi yaziniz
    public static int pztftekTamsayi(int x) {
        return IntStream.iterate(1, t -> t + 2).limit(x).sum();
    }

    //TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi yaziniz
    public static void ikiilkkuvvet(int x) {
        IntStream.iterate(2, t -> t * 2).limit(x).forEach(Lambda_01::printEl);
    }
//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi yaziniz

//TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi yaziniz
public static int istenensayifaktryl(int x){
        return IntStream.rangeClosed(1,x).reduce(1,(t,u)->t*u);
}
    //TASK 08 --> Istenilen bir sayinin  x. kuvvetini ekrana yazdiran programi yaziniz
    public static int istenenSayiniXincikuvvet(int a, int x) {

        return IntStream.iterate(a, t -> t * a).//a a^2 a^3 a^4... x elemanarinin akısı
                limit(x).//akısdaki ilk x elamanı verir
                reduce(0, (t, u) -> u);
        //skip(x-1);//skip den sonra cıkan elemanları toList ile yazdirilmali
    }
}


