package day20_scope;

public class InstanceVar2 {

	
	
	String adres="Ankara";
	String dogumYeri;
	double notOrtalamasi;
	double yasOrt=12.3;
	char cinsiyet='E';
	char karakter;
	boolean ogrenciMi=true;
	boolean izinlimi;
	
	
	
	public static void main(String[] args) {
	
		InstanceVar2 ali=new InstanceVar2();
		
		System.out.println(ali.adres);
		System.out.println(ali.dogumYeri);
		System.out.println(ali.notOrtalamasi);
		System.out.println(ali.yasOrt);
		System.out.println(ali.cinsiyet);
		System.out.println(ali.karakter);
		System.out.println(ali.ogrenciMi);
		System.out.println(ali.izinlimi);
		
	}

	public static void staticMethod() {
		
	}
	
	
	public void ststicOlmayanMethod() {
		
	}
	
	
	
	
	
	
	
	
	
	
}
