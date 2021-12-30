package kenanHoca;

public class Soru_22 {
    public static void main(String[] args) {
        int arr[]={20, 30, 25, 35, -16, 60,-100};
        int sayac = 0;
        int ortalama = 0;
        for (int i = 0; i < arr.length; i++) {
            sayac += arr[i];
        }
        System.out.println(sayac);
        ortalama = sayac / arr.length;
       System.out.println( ortalama );



    }
}
