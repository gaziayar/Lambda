package day02;

public class C01_variables {
    private static String soyIsminiz;

	public static void main(String[] args) {
	

    	/*
		 * 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
		 * 2- isim ve soyisim icin iki variable olusturun ve bunlari 	
		 * 		isminiz : Mehmet
		 * 		soyisminiz : Bulutluoz seklinde yazdirin
		 * 3- Iki farkli tamsayi data turunde 2 variable
		 * olusturun bunlarin toplamini yazdirin
		 * 4- Bir tamsayi ve bir ondalikli
		 * variable olusturun ve bunlarin toplamini yazdirin
		 * 5 – char data turunde bir variable olusturun ve yazdirin
		 * 6- Bir tamsayi, bir de char degisken olusturun
		 * ve bunlarin toplamini yazdirin.
		 *
		 */
     String isminiz= "Mehmet Bulutluoz";
     System.out.println(isminiz);

    char ilkHarf = 'S';
    boolean anlasildiMi= true;
     String ismim =" GAZI";
    String soyIsminiz = "AYAR";
    
   System.out.println("isminiz  :  "  +  isminiz);
    
    System.out.println("soyisminiz :"  + soyIsminiz);
    
    
    int a=10;
    short b=20;
    
    System.out.println(a+b);
    
    int sayi=25;
    
    char karakter='a';

	System.out.println(sayi+karakter);
	
	
	
	
	
	
	}
}
