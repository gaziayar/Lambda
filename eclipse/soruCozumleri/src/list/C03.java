package list;

public class C03 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir cümle alın. Kullanıcıdan alınan cümleyi parametre olarak kabul edin, Array kullanarak cümleyi ters çevirin ve sonucu ana metoda String olarak döndüren bir Method yazın.

		Not: Büyük ve küçük harfler, boşluklar ve özel karakterler değiştirilmeyecektir.

		Giriş :

		Kod yazmak çok güzel.

		Çıktı :

		.edoc etirw ot ecin yrev si tI
*/
	String str="It is very nice to write code.";
	
	String str1[]=str.split("");
	
	tersCevir(str1);
	System.out.println(tersCevir(str1));
	}

	private static String tersCevir(String[] str1) {
		
		String ters="";
		
		for (int i = str1.length-1; i >=0; i--) {
			
			
		ters+=str1[i];	
			
			
			
		}
		
		
		return ters;
		
		
	
	
	
	}

}
