package kenanHoca;

public class Soru_5 {
//   5-----Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
//     Test Data:
//    Yarım elmas uzunluğu : 7
//    Beklenen Çıktı:
//            *
//            ***
//            *****
//            *******
//            *********
//            ***********
//            *************
//            ***********
//            *********
//            *******
//            *****
//            ***
//            *
//
//
public static void main(String[] args) {
    for (int i = 0; i <=7 ; i++) {
        for (int j = 0; j <=i ; j++) {
            System.out.print("" +"*");
        }
        System.out.println(" ");
    }


}
}
