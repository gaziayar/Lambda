package lambda03;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda_05 {
    public static void main(String[] args) {

        TechPro trGunduz = new TechPro("yaz", "TR gunduz", 97, 124);
        TechPro engGunduz = new TechPro("kis", "ENG gunduz", 95, 131);
        TechPro trGece = new TechPro("bahar", "TR gece", 98, 143);
        TechPro engGece = new TechPro("sonbahar", "ENG gece", 93, 151);

        List<TechPro> list = new ArrayList<>(Arrays.asList(trGunduz, engGunduz, trGece, engGece));
        System.out.println(batchOrt92Byk(list));
        System.out.println();
        System.out.println("     *********  ");
        System.out.println(ogrSayisi110danAz(list));
        System.out.println();
        System.out.println("     *********  ");
        System.out.println(ogrSayisiTersSirali(list));
        System.out.println();
        System.out.println("     *********  ");
        System.out.println(ortGoreSirala(list));
        System.out.println();
        System.out.println("     *********  ");

        System.out.println(ikinciBatch(list));

        System.out.println(ogrcOrt95BykOgrcSayisi(list));
        System.out.println(ogrcOrt95BykOgrcSayisi1(list));
        System.out.println(ogrcSayisi130(list));
        System.out.println(gunduzbatchsay(list));
    }

    public static boolean batchOrt92Byk(List<TechPro> list) {
        return

                list.stream().allMatch(t -> t.getBatchOrt() > 92);
    }
//task 02-->ogrc sayilarinin hic birinin  110 den az olmadigini  kontrol eden pr create ediniz.

    public static boolean ogrSayisi110danAz(List<TechPro> List) {
        return

                // List.stream().noneMatch(t -> t.getOgrcSayisi() < 110);
                List.stream().allMatch(t -> t.getOgrcSayisi() >= 110);


    }

    public static boolean baharVarmi(List<TechPro> list) {
        return
//task 03-->batch'lerde herhangi birinde "bahar" olup olmadigini  kontrol eden pr create ediniz.

                list.stream().anyMatch(t -> t.getBatch().equals("bahar"));
    }


    public static List<TechPro> ogrSayisiTersSirali(List<TechPro> list) {
//task 04-->batch'leri ogr sayilarina gore b->k siralayiniz.

        return
                list.
                        stream().
                        sorted(Comparator.comparing(TechPro::getOgrcSayisi).
                                reversed()).collect(Collectors.toList());


    }


//task 05-->batch'leri batch ort gore  b->k siralayip ilk3 'unu yazdiriniz.

    public static List<TechPro> ortGoreSirala(List<TechPro> list) {

        return list.
                stream().
                sorted(Comparator.comparing(TechPro::getBatchOrt).
                        reversed()).limit(3).collect(Collectors.toList());

        // akısdaki elamanları istenen sarta gore toplar
        //Collectors.toList()->collect'e toplanan elemanlarilist'e cevirir


    }

    //task 05--> ogrc sayisi en az olan 2. batch'i  yazdiriniz.
    public static List<TechPro> ikinciBatch(List<TechPro> list) {
        return list.
                stream().
                sorted(Comparator.comparing(TechPro::getOgrcSayisi))
                .limit(2).skip(1).collect(Collectors.toList());


    }


    public static int ogrcOrt95BykOgrcSayisi(List<TechPro> list) {
        return list.
                stream().
                filter(t -> t.getBatchOrt() > 95).//95 den byk sarti saglandi
                        map(t -> t.getOgrcSayisi()).//batch oert olan data ogrc sayisi olarak update edildi
                //reduce(0,Integer::sum);//ogrc sayisi toplandi
                        reduce(0, (t, u) -> t + u);//ogrc sayisi toplandi


    }

    public static int ogrcOrt95BykOgrcSayisi1(List<TechPro> list) {
        return list.
                stream().
                filter(t -> t.getBatchOrt() > 95).//95 den byk sarti saglandi
                        mapToInt(t -> t.getOgrcSayisi()).
                sum();
        //batch oert olan data ogrc sayisi olarak update edildi


    }
//task 08--> ogrc sayilari 130 dan buyuk olan batch'lerin batch ort bulunuz
   public static OptionalDouble ogrcSayisi130(List<TechPro> list){
  return       list.
                stream().
                filter(t -> t.getOgrcSayisi() > 130).mapToDouble(t->t.getBatchOrt()).average();


    }
 public static  int gunduzbatchsay(List<TechPro> list){
        return (int) list.
                stream().
                filter(t -> t.getBatchName().contains("gunduz")).count();
 }
    public static OptionalInt ogrcSayisi130fazlaenbyk(List<TechPro> list) {
        return list.
                stream().
                filter(t -> t.getOgrcSayisi() > 130).mapToInt(TechPro::getBatchOrt).max();
    }
    //task 11-->Ogrenci sayilari 150'dan az olan batch'lerin en kucuk batch ort'unu bulunuz.
    public static int ogrcSayisi150AzEnKckBatch(List<TechPro> list) {
        return list.
                stream()
                .filter(t -> t.getOgrcSayisi() < 150).
                mapToInt(TechPro::getBatchOrt).
                min().
                getAsInt();//getAsInt()-->cıktıyı int type olarak return eder


    }
}