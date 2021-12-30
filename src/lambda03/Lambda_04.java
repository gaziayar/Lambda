package lambda03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lambda_04 {
    public static void main(String[] args) {
        List<String> List=new ArrayList<>(Arrays.asList("cincik","emre","nilgun","kokorec","kader","emine","islam","islam","mehmet"));
        // list elemanlarini alfabetik buyuk harf sirasi ile ve tekrarsiz yazdirin
        bykHrfTekrarsizSira( List);
        System.out.println();
        System.out.println("     *********  ");
        tersSiraliKarakterTekrarsiz( List);
        System.out.println();
        System.out.println("     *********  ");
        KarakterSayKcktenByk( List);
        System.out.println();
        System.out.println("     *********  ");
        sonHarfTersSiraliEl(List);
        System.out.println();
        System.out.println("     *********  ");
        ciftkaretekrasizTersSira(List);

        System.out.println();
        System.out.println("     *********  ");
        harfSayisi7Kontrol(List);
        System.out.println();
        System.out.println("     *********  ");
        wBaslamaKontrol(List);

        System.out.println();
        System.out.println("     *********  ");

        xbitmeKontrol(List);


        System.out.println();
        System.out.println("     *********  ");
        karakteriEnBuyukEl(List);

        System.out.println();
        System.out.println("     *********  ");

        karakteriEnBuyukEl2(List);

        System.out.println();
        System.out.println("     *********  ");
        sonHarfeGoreSirala(List);

    }
    public static void bykHrfTekrarsizSira( List<String> list){
        list.
                stream().//akisa girdi
                // map(t->t.toUpperCase()).//elelmanlar byk harf update edildi
                        map(String::toUpperCase).//elelmanlar byk harf update edildi
                sorted().//alfabetik sira
                distinct().//tekrarsiz  yapildi COOK ONEMLI TRICK
                forEach(t->System.out.print(t + " "));//yazdirilidi
        //EMRE EMİNE KADER MEHMET NİLGUN YILDIZ İSLAM

    }

//list elemanlari karakter sayisini ters sirali rekrarsiz yazdirin

public static void tersSiraliKarakterTekrarsiz( List<String> list){
       list.stream().
               map(t->t.length()).
               sorted(Comparator.reverseOrder()).
               distinct().forEach(Lambda_01::printEl);
}

// list elemanlarini character sayisina gore kucukten buyuge gore yazdirin

    public static void KarakterSayKcktenByk( List<String> list){

       list.stream().sorted(Comparator.comparing(t->t.length())).forEach(t->System.out.print(t + " "));

    }
// list elemanlarini son harfine gore ters sirali yazdirin
public static void sonHarfTersSiraliEl(List<String> list){

    list.
            stream()//dikey yap
            .sorted(Comparator.comparing(t->t.toString().//*ONEMLII**KArsilastirma Methoduu*/*//*/*/*/*/
                    charAt(t.toString().length()-1)).//son indexe karsilik gelen karakteri alir
                    reversed()).//elemanin length()-1)  indexsini kaakterini ters siralar z->a
            forEach(t->System.out.print(t + " "));
}
    //listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  yaziniz.

    public static void ciftkaretekrasizTersSira(List<String> list){

        list.stream().map(t->t.length()*t.
                length()).filter(Lambda_01::ciftBul).distinct().
                sorted(Comparator.reverseOrder()).
                forEach(Lambda_01::printEl);
    }

    //List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz
    public static void harfSayisi7Kontrol(List<String> list) {
        // boolean  kontrol=  list.stream().
        //     allMatch(t->t.length()<=7);//her bir elemanı harf syisini <=7 ye eslesmesine bakti
        //    if (kontrol ) {
        //        System.out.println("list elemanlari 7 harfden buyuk degil");
//
        //    }else{
        //        System.out.println("AGAM list elemanlari 7 harfden BUYUK ");
        //    }
        //System.out.println(kontrol);
        System.out.println(list.stream().allMatch(t -> t.length() <= 7)?"list elemanlari 7 harfden buyuk degil":"AGAM list elemanlari 7 harfden BUYUK ");
    }

    //List elelmanlarinin "W" ile baslamasını kontrol ediniz
    public static void wBaslamaKontrol(List<String> list){
        System.out.println(list.
                stream().
                noneMatch(t -> t.startsWith("w"))?"w ile baslayan isim kimse ayaga kalksin":"AGAM w ile baslayan isim oluuuurrr ");


    }
    //List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz
    public static void xbitmeKontrol(List<String> list){
        System.out.println(list.
                stream().
                anyMatch(t -> t.endsWith("x"))?"x ile biten isim kimse ayaga kalksin":"AGAM x ile biten isim oluuuurrr ");
//anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
//allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
//noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.


    }

    //Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karakteriEnBuyukEl(List<String> list){
        System.out.println(list.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).//lenght karakter uzunluguna gore siraladi k->b
                        reversed()).//ters sirlad b->k
                   //  findFirst());//ilk elelmani aldi
                       limit(1));
}
//
public static void karakteriEnBuyukEl2(List<String> list) {

          Stream<String> sonIsim=list.stream().

            sorted(Comparator.comparing(t -> t.toString().length()).//lenght karakter uzunluguna gore siraladi k->b
                    reversed()).//ters sirlad b->k
            //  findFirst());//ilk elelmani aldi
                    limit(5);
    System.out.println(Arrays.toString(sonIsim.toArray()));
    }
// list elemanlarini son harfine gore siralayip ilk eleman haric kalan elemanlari yazdirin


    public static void sonHarfeGoreSirala(List<String> list) {

                    list.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).skip(1).forEach( System.out::println);
    }
}
