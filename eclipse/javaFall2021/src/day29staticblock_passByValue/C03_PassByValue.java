package day29staticblock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
//		main method dan diger method lara veya diger mehodlardan main method a bir varible gonderirseniz java orginal variablari degil 
		// onlarin degerlerini (value) goturur ,orginal variable in degeri degismez
		
		
		// 100 tl lik bir urun icin 2 farkli indirim uygulayan iki method olusturunuz

		int fiyat=100;	
		
		
		System.out.println(indirimYap25(fiyat));
		System.out.println("method dan sonra main method daki fiyat : " + fiyat);//100
		// indirimi kalici yapmak istiyorsaniz main method a atama yapmaniz gerekir
		fiyat=indirimYap10(fiyat);
		System.out.println("method dan sonra main method daki fiyat : " + fiyat);//100
		
		}

		private static int indirimYap25(int fiyat) {
			fiyat*=0.75;
			
			return fiyat;
		
		}

		private static int indirimYap10(int fiyat) {
			
			fiyat*=0.90;
			return fiyat;
	
	
	
	
	
	
	
	
	}

}
