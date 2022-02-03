package kitapci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitaplik {

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
			kitapEkle(kitapliste);
			break;
		case 2:
			noIlesil(kitapliste);
			break;
		case 3:
			listele(kitapliste);
			break;
		case 4:
			bitir();
			break;
		default:
			System.out.println("yanlis giris yaptiniz lutfen tekrar deneyin");

			break;
		}

	}

	private static void listele(List<Kitap> kitapliste2) {
		for (Kitap a : kitapliste2) {
			
			System.out.println(a.toString());
			
		}
		menu(kitapliste);
	}

	private static void noIlesil(List<Kitap> kitapliste2) {
		System.out.println("lutfen Silinecek Kitabin numarasini girin: ");
		int silinecekNo = scan.nextInt();

		for (Kitap a : kitapliste2) {
			if (a.getKitapNo() == silinecekNo) {
				kitapliste.remove(a);
			}

		}
       System.out.println(silinecekNo + "kitap bulunamadi");
       menu(kitapliste);
	}

	private static void kitapEkle(List<Kitap> kitapliste2) {
		System.out.println("Lutfen kitap adi girin");
		String kitapAdi = scan.next();
		System.out.println("Lutfen yazar adi girin");
		String yazarAdi = scan.next();
		System.out.println("Lutfen Yayin yilini girin");
		int yayinYili = scan.nextInt();
		System.out.println("lutfen fiyat girin");
		double fiyat = scan.nextDouble();
		Kitap kitap = new Kitap(++kitapNo, kitapAdi, yazarAdi, yayinYili, fiyat);
		kitapliste.add(kitap);
		System.out.println(kitap.toString() + "Kitabiniz basariyla eklendi");
		menu(kitapliste);
	}

	private static void bitir() {
		System.out.println("cikis yaptiniz");

	}

}
