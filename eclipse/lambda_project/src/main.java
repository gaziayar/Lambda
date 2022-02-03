import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



    public static List<Ogrenci> ogListesi = new ArrayList<>();


    public static void main(String[] args) {
        ogrenciListesi();
        notaGoreSirala(3, 5);
        yasaGoreSirala();
        yasaVeCinsiyeteGore(30, "kadin");
        ismeGoreSirala();




    private static void ogrenciListesi() {
        ogListesi.add(new Ogrenci("Ahmet", "Can", 30, 95.5, "erkek"));
        ogListesi.add(new Ogrenci("Ahmet", "Yarba", 25, 90.5, "erkek"));
        ogListesi.add(new Ogrenci("Ayse", "Can", 21, 82.5, "kadin"));
        ogListesi.add(new Ogrenci("Merve", "Aslan", 30, 98.8, "kadin"));
        ogListesi.add(new Ogrenci("Veli", "Han", 80, 35.5, "erkek"));
        ogListesi.add(new Ogrenci("Funda", "Funda", 24, 99.2, "kadin"));


    private static void ismeGoreSirala() {
        ogListesi.stream().filter(t -> t.getAd().equalsIgnoreCase(isim)).collect(Collectors.toList()).forEach();
        System.out.println("      ******      ");




    private static void yasaVeCinsiyeteGore(int i, String kadin){
        ogListesi.stream().filter(t->t.getYas()<yas).
        filter(t->t.getCinsiyet().equalsIgnoreCase(cinsiyet)).
        sorted(Comparator.comparing(Ogrenci::getYas)).forEach(System.out::println);


private static void notaGoreSirala(int i,int i1){
        ogListesi.stream().sorted(Comparator.comparing(Ogrenci::getDiplomaNotu).reversed()).
        skip(alt-1).limit(ust-alt+1).forEach(System.out::println);}


private static void yasaGoreSirala(){

        ogListesi.stream().sorted(Comparator.comparing(Ogrenci::getYas).
        reversed()).forEach(System.out::println);
        }


        }









