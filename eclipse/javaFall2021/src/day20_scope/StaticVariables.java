package day20_scope;

public class StaticVariables {

	static int no=20;
	static int sayi;
	static String adres="ankara";
	static String cadde;
	static boolean aktifMi=true;
	static boolean tatildeMi;
	
	public static void main(String[] args) {
	System.out.println(no);
	no++;
    System.out.println(no);
    staticMethod();
	}

	public static void staticMethod ( ) {
		no++;
		System.out.println("static method da sayi: " + no);
	}
	
	public void staticOlmayanMethod() {
	no++;
	System.out.println("static methodolmayan sayi: " + no);
	}
	


}
	
	
	
	

