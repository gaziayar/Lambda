package kutuhane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kitaplik.Kitap;

public class Kitaplik {

	/*
	 * 1. Kullanıcının Kitap ekleme, silme ve listeleme gibi işlemleri yapmasına
	 * imkan tanıyan bir uygulama yazınız. 2. Program, kitaplara 1001’den başlayarak
	 * sıralı ve otomatik numara vermeli. Bunun yanında, her bir kitap için Kitap
	 * Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir. 3.
	 * Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
	 * Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir. =========
	 * KİTAP PROGRAMI ============= 1: Kitap ekle 2: Numara ile kitap sil 3: Tüm
	 * kitapları listele 4: Bitir
	 */
	static List<Kitap> kitapliste = new ArrayList<>();

	static Scanner scan = new Scanner(System.in);
	static int kitapNo = 1000;

	public static void main(String[] args) {

		
		menu(kitapliste);
	}

	public static void menu(List<Kitap> kitapliste) {

		System.out.println(
				"============= KITAPLIK PROJEMIZE HOSGELDINIZ ============== \n1: Kitap  Ekle\n2: Numara ile kitap Sil\n3: Tum kitaplari Listele \n4: Bitir");

		System.out.println("isleminizi seciniz  :");

		int tercih = scan.nextInt();
		switch (tercih) {
		case 1:
			kitapekle(kitapliste);
			break;
		case 2:
			noIleSil(kitapliste);
			break;
		case 3:
			listele(kitapliste);

			break;
		case 4:

			cikis();

			break;
		default:
			System.out.println("Yanlis giris yaptiniz tekrar deneyin");
		}
	}

	private static void listele(List<Kitap> kitapliste2) {
		System.out.println("kitapNo\t kitapAdi\t  yazarAdi\t         yayinYili\t  fiyat");
		for (Kitap a : kitapliste2) {
System.out.println(a.toString());
		}
menu(kitapliste);
	}

	private static void noIleSil(List<Kitap> kitapliste2) {
		System.out.println("sililenek kitabin numarasini girin: ");
		int silinecekNo = scan.nextInt();
		for (Kitap a : kitapliste2) {
			if (a.getNo() == silinecekNo) {
				kitapliste.remove(a);
				menu(kitapliste);
			}
		}
		System.out.println("Silinecek kitap bulunamadi");
		menu(kitapliste);
	}

	private static void kitapekle(List<Kitap> kitapliste2) {
		System.out.println("Lutfen Kitap Adi giriniz");
		scan.nextLine();
		String kitapAdi = scan.nextLine();
		scan.nextLine();
		System.out.println("Lutfen Yazar Adi giriniz");
		String yazarAdi = scan.nextLine();
		System.out.println("yayin yilini girin");
		int yayinYili = scan.nextInt();
		System.out.println("fiyatini girin");
		double fiyat = scan.nextDouble();
		Kitap kitap = new Kitap(++kitapNo, kitapAdi, yazarAdi, yayinYili, fiyat);
		kitapliste.add(kitap);
		System.out.println(kitap.toString() + "  eklendi");
		menu(kitapliste);
	}

	private static void cikis() {
		System.out.println("yine bekleriz");

	}

}
