package kenanHoca;

import java.util.Scanner;

public class Sorular {
    public static void main(String[] args) {

/*
             6----     KullanÄ±cÄ±dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduÄŸunu,
             deÄŸilse sessiz harf olduÄŸunu ekrana yazdÄ±rsÄ±n. GirdiÄŸi deÄŸer harf deÄŸilse yada
              1 karakterden fazla ise hata mesajÄ± gÃ¶stersin. (Test girilen harfi bÃ¼yÃ¼k yada kÃ¼Ã§Ã¼klÃ¼ÄŸÃ¼ne duyarlÄ±dÄ±r.)

                  Sesli harfler: a,e,i,o,u

                  Test Data:
                      a

                  Beklenen Ã‡Ä±ktÄ±:
                  a harfi sesli harfdir.

                  Test Data:
                  d

                  Beklenen Ã‡Ä±ktÄ±:
                  d harfi sesiz harftir.

                  Test Data:
                  we  yada %

                  Beklenen Ã‡Ä±ktÄ±:
                  Yanlis karakter girdiniz!
        */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen harf giriniz");
        String harf=scan.next().toLowerCase();
        String sesliHarf="aeiou";
        String sessizHarf="zrtpqsdfghjklmwxcvbn";
        if (harf.length()>1) {
            System.out.println("birden fazla karakter girdiniz");
        }else if (sesliHarf.contains(harf)){
            System.out.println("girilen harf seslidir");
        }else if (sessizHarf.contains(harf)) System.out.println("girile4n harf sessizdir");
        else {
            System.out.println("yanlis karakter girdiniz");
        }


    }


    public static class Soru_20 {
    }
}

