package day32_varargs_stringBuilder;

public class C04_Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KafanagoreIslem(5,10,13,0);
	}	
		
	

		private static void KafanagoreIslem(int sayi1, int sayi2, int sayi3 , int sayi4, int ...sayilar) {
			// TODO Auto-generated method stub
			
		int toplam=0;
		for (int each : sayilar) {
			toplam+=each;
		}
	}
}

