  package day0_Odev;
  import java.util.Scanner;
  public class C25_methodCreation2 {
	public static void main(String[] args) {
		// Email kontrolu yapan bir program yazin.
		// Kullanicinin girdigi sifre
		// - @ isareti icermiyorsa gecersiz email yazdirin
		// - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
		// - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir email adresi giriniz");
		String email = scan.next();
		mail(email);   
	}
	public static void mail(String email) {
		String aranan = "@gmail.com";
		if (!email.contains("@")) {
			System.out.println("Gecersiz email");
		} else if (!email.contains(aranan)) {// email.indexOf(aranan)==(-1);
			System.out.println("lutfen gmail adresi giriniz");
		} else if (email.endsWith(aranan)) {// email.lastIndexOf(aranan) == email.length() - 10
			System.out.println("Email adresiniz kaydedildi");
		} else {
			System.out.println("lutfen yazimi kontol edin");
		}
	}
  }
  
	
  
