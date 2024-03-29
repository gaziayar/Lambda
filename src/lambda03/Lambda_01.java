package lambda03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda_01 {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>(Arrays.asList(12, 13, 65, 3, 7, 34, 22, 60, 42, 55));
        prinElStructured(List);
        System.out.println();

        System.out.println("     *********  ");

        printElfunctional(List);
        System.out.println();

        System.out.println("     *********  ");
        prinElStructured(List);
        System.out.println();

        System.out.println("     *********  ");
        printElfunctional1(List);
        System.out.println();

        System.out.println("     *********  ");
        printCiftElStuructured(List);
        System.out.println();

        System.out.println("     *********  ");
        printCiftElStuructured1(List);
        System.out.println();

        System.out.println("     *********  ");
        printCiftElStuructured2(List);
        System.out.println();

        System.out.println("     *********  ");

        printCiftAltmisKucuk(List);
        System.out.println();

        System.out.println("     *********  ");

        printTekYirmidenBuyuk(List);
        System.out.println();

        System.out.println("     *********  ");
        printciftKare(List);
        System.out.println();

        System.out.println("     *********  ");
        printtekKupBirFazla(List);
        System.out.println();

        System.out.println("     *********  ");
        printciftKareKok(List);
        System.out.println();

        System.out.println("     *********  ");
        maxElfunction(List);
    }

    // structured Programming ile list elemanlerinin tamamini yazdiriniz
    public static void prinElStructured(List<Integer> List) {

        for (Integer v : List) {
            System.out.print(v + " "); // 12 13 65 3 7 34 22 60 42 55
        }

    }
    // Functional Programming ile list elemanlerinin tamamini aralarina bosluk
    // birakarak yazdiriniz

    public static void printElfunctional(List<Integer> List) {

        List.stream().forEach(t -> System.out.print(t + " "));
    }
    // Method Reference --> kendi create ettigimiz veya java'dan aldigimiz method
    // ile
    // ClassName::MethodName EZBERLEEEE

    public static void printEl(int t) {
        System.out.print(t + " ");

    }

    public static void printElfunctional1(List<Integer> List) {
        List.stream().forEach(Lambda_01::printEl);

    }
    // structured Programming ile list elemanlerinin cift olanalrini ayni satirda
    // aralarina bosluk birakarak yazdiriniz

    public static void printCiftElStuructured(List<Integer> List) {
        for (Integer w : List) {
            if (w % 2 == 0) {
                System.out.print(w + " ");

            }
        }

    }

    public static void printCiftElStuructured1(List<Integer> List) {
        List.stream().filter(t -> t % 2 == 0).forEach(Lambda_01::printEl);

    }

    public static boolean ciftBul(int i) {

        return i % 2 == 0;

    }

    public static void printCiftElStuructured2(List<Integer> List) {
        List.stream().filter(Lambda_01::ciftBul).forEach(Lambda_01::printEl);

    }

    // Functional Programming ile list elemanlarinin cift olanalrinin
    // 60 dan kucuk olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz.

    public static void printCiftAltmisKucuk(List<Integer> List) {

        List.stream().filter(t -> t % 2 == 0 & t < 60).forEach(Lambda_01::printEl);

    }

    //Functional Programming ile list elemanlarinin  tek olanalrini veya 20 dan buyuk
    // olanlarını ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void printTekYirmidenBuyuk(List<Integer> List) {
        List.stream().filter(t -> t % 2 == 1 || t > 20).forEach(Lambda_01::printEl);
    }

    //Functional Programming ile list elemanlarinin  cift olanlarinin
    // karelerini ayni satirda aralarina bosluk birakarak yazdiriniz
    public static void printciftKare(List<Integer> List) {

        List.stream().filter(Lambda_01::ciftBul).map(t->t*t).forEach(Lambda_01::printEl);
    }

    //Functional Programming ile list elemanlarinin  tek olanlarinin
    // kuplerinin bir fazlasini ayni satirda aralarina bosluk birakarak yazdiriniz


    public static void printtekKupBirFazla(List<Integer> List) {
        List.stream().filter(t -> t % 2 == 1 ).map(t->(t*t*t)+1).forEach(Lambda_01::printEl);
    }

    //Functional Programming ile list elemanlarinin  cift olanlarinin
    // karekoklerinin bir fazlasini ayni satirda aralarina bosluk birakarak yazdiriniz

    public static void printciftKareKok(List<Integer> List) {

        List.stream().
                filter(Lambda_01::ciftBul).
                map(Math::sqrt).
                forEach(t->System.out.println(t+" "));
    }

// list'in en buyuk elemanini yazdirin

    public static void maxElfunction(List<Integer> List) {

        Optional<Integer> maxEl=List.stream().reduce(Math::max);
        System.out.println(maxEl);


    }



  //


}

