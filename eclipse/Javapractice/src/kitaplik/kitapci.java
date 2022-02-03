package kitaplik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kitapci {

	static List<Kitap> liste = new ArrayList<>();

	static Scanner scan = new Scanner(System.in);

	static int kitapNo = 1000;

	public static void main(String[] args) {

		menu(liste);

	}

	public static void menu(List<Kitap> liste) {

		System.out.println(
				"============= KITAPLIK PROJEMIZE HOSGELDINIZ ============== \n1: Kitap  Ekle\n2: Numara ile kitap Sil\n3: Tum kitaplari Listele \n4: Bitir");

		System.out.println("isleminizi seciniz  :");
		int tercih = scan.nextInt();

		switch (tercih) {
		case 1:
			kitapEkle(liste);
			break;
		case 2:
			noIleSil(liste);

			break;
		case 3:
			listele(liste);

			break;
		case 4:
			System.out.println("yine bekleriz efendim");

			break;

		default:

			System.out.println("yanlis giris yaptiniz tekrar deneyiniz");
			break;
		}

	}

	private static void listele(List<Kitap> liste) {
		System.out.println("kitapNo\t kitapAdi\t  yazarAdi\t         yayinYili\t  fiyat");
		for (Kitap a : liste) {
			System.out.println(a.toString());

		}
		menu(liste);
	}

	private static void noIleSil(List<Kitap> liste) {
		System.out.println("lutfen silinecek kitabin numarasini giriniz:");
		int silinecek = scan.nextInt();
		for (Kitap a : liste) {
			if (a.getNo() == silinecek) {
				liste.remove(a);
				listele(liste);
				menu(liste);

			}
		}

		System.out.println(silinecek + "Silinecek kitap bulunamadi");
		menu(liste);
	}

	private static void kitapEkle(List<Kitap> liste) {
		System.out.println("lutfen kitap adini giriniz");
		scan.nextLine();

		String kitapAdi = scan.nextLine();

		System.out.println("lutfen yazarin adini giriniz");
		String kitapYazar = scan.nextLine();
		System.out.println("lutfen yayin yilini giriniz");
		int yayinYili = scan.nextInt();
		System.out.println("lutfen fiyatini giriniz");
		double fiyat = scan.nextDouble();

		Kitap kitap = new Kitap(++kitapNo, kitapAdi, kitapYazar, yayinYili, fiyat);// kitap obj create edildi
		liste.add(kitap);
		System.out.println(kitap.toString() + " eklendi  ");
		menu(liste);
	}

}
