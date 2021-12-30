package lambda03;

import java.util.*;

public class Lambda_03 {
    public static void main(String[] args) {

        List<Integer> List = new ArrayList<>(Arrays.asList(12, 13, 65, -3, 7, 34, 22, -60, 42, 15));
        System.out.println();
        System.out.println("     *********  ");
        ciftKare(List);
        System.out.println();
        System.out.println("     *********  ");
        elToplam1(List);
        System.out.println();
        System.out.println("     *********  ");
        carpRef(List);
        System.out.println();
        System.out.println("     *********  ");
        carpRef1(List);
        System.out.println();
        System.out.println("     *********  ");
        min1(List);
        System.out.println();
        System.out.println("     *********  ");
        min2(List);
        System.out.println();
        System.out.println("     *********  ");
        min3(List);
        System.out.println();
        System.out.println("     *********  ");
        min4(List);
        System.out.println();
        System.out.println("     *********  ");
        onbestenBykKckTekSayi(List);
        System.out.println();
        System.out.println("     *********  ");
        tekKareKckByk(List);

    }
    // listeki cift olan elemanlarin karelerini aliniz ve en buyugunu yazdiriniz

    public static void ciftKare(List<Integer> List) {
        Optional<Integer> maxEl = List.stream().filter(Lambda_01::ciftBul).map(t -> t * t).reduce(Integer::max);
        System.out.println(maxEl);

    }

    // listeki tum elemanlarin toplamini yaziniz

    public static void elToplam(List<Integer> List) {

        // Optional<Integer>toplam = List.stream().reduce(identity:0,(x,y)->x+y);

    }

    public static void elToplam1(List<Integer> List) {

        Optional<Integer> toplam = List.stream().reduce(Math::addExact);

    }

    // listeeki cift elemanlari yaziniz
    public static void carpRef(List<Integer> list) {
        Optional<Integer> carpim = list.stream().filter(Lambda_01::ciftBul).reduce(Math::multiplyExact);
        System.out.println(carpim);
    }

    // List'teki cift elemanlarin yazdiriniz.
    // Lambda expression...

    public static void carpRef1(List<Integer> list) {
        int carpim = list.stream().filter(Lambda_01::ciftBul).reduce(1, (x, y) -> (x * y));
        System.out.println(carpim);

        int carpim1 = list.stream().filter(Lambda_01::ciftBul).reduce(-1, (x, y) -> (x * y));
        System.out.println(carpim1);

    }
    //List'teki elemanlardan en kucugunu 4 farklı yontem ile yazdiriniz
    //1. yontem Method Reference --> Integer class
    public static void min1(List<Integer> list) {
        Optional<Integer> min = list.stream().reduce(Integer::min);
        System.out.println(min);
    }

    //2. yontem Method Reference --> Math class
    public static void min2(List<Integer> list) {
        Optional<Integer> min = list.stream().reduce(Math::min);
        System.out.println(min);
    }

    //3. yontem Method Reference --> Haluk class

    public static int minBul(int x, int y) {
        return x<y ?x:y;//ternary

    }
    public static void min3(List<Integer> list) {
        Optional<Integer> min = list.stream().reduce(Lambda_02::minBul);
        System.out.println(min);
    }
    //4. yontem Lambda Expression
    public static void min4(List<Integer> list) {
        Integer  min = list.stream().reduce(Integer.MAX_VALUE,(x,y)->x<y?x:y);
        System.out.println(min);



    }

public static void onbestenBykKckTekSayi(List<Integer> list){
    System.out.println(list.stream().filter(t->t %2==1 &  t > 15).reduce(Integer::min));

}

    //list'in cift  elemanlarinin kareleri ni  kucuge buykten yazdiriniz
    public static void ciftKareKckByg(List<Integer> list){
        list.
                stream().
                filter(Lambda_01::ciftBul).
                map(t->t*t).
                sorted().//akısa giren elelmanlar naturel order'e gore siralanir
                forEach(Lambda_01::printEl);//144 484 1156 1764 3600
    }

    //list'in cift  elemanlarinin kareleri ni  kucuge buykten yazdiriniz
    public static void tekKareKckByk(List<Integer> list) {
        list.
                stream().filter(t -> t % 2 != 0).
                map(t -> t * t).
                sorted(Comparator.reverseOrder()).//akısa giren elelmanlar naturel order'e gore siralanir
                forEach(Lambda_01::printEl);//144 484 1156 1764 3600

    }
}
