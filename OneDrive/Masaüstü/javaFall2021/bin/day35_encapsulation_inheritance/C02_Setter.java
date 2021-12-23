package day35_encapsulation_inheritance;

public class C02_Setter {
	public static void main(String[] args) {

		C01 ogr1=new C01();
		
		ogr1.isGecerMi();
		System.out.println(ogr1.isGecerMi());
		
		ogr1.setNot(60);
		
		System.out.println(ogr1.isGecerMi());
		
	}
}
