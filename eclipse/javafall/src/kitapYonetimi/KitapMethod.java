package kitapYonetimi;

import java.util.List;
import java.util.Scanner;

public class KitapMethod {
	
	static Scanner scan = new Scanner(System.in);
	static int kitapNo = 1000;
	static int tercih = 0;
	
	
	
		
	
	
	
	/*
	 * 1. Kullanıcının Kitap ekleme, silme ve listeleme gibi işlemleri yapmasına
	 * imkan tanıyan bir uygulama yazınız. 2. Program, kitaplara 1001’den başlayarak
	 * sıralı ve otomatik numara vermeli. Bunun yanında, her bir kitap için Kitap
	 * Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi bilgiler girilebilmelidir. 3.
	 * Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır.
	 * Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir. =========
	 * KİTAP PROGRAMI ============= 1: Kitap ekle 2: Numara ile kitap sil 3: Tüm
	 * kitapları listele 4: Bitir
	 * 
	 */

	

	public static void menu(List<Kitap> liste) {//
		System.out.println("========= KİTAP PROGRAMI =============\n1: Kitap ekle\n2: Numara ile kitap sil\n3: "
				+ "Tum kitaplari listele\n4: Bitir");

		System.out.print("isleminizi seciniz : ");
		int tercih = scan.nextInt();

		switch (tercih) {

		case 1:
			kitapEkle(liste);
			break;
		case 2:
			noSil(liste);
			break;
		case 3:
			listele(liste);
			break;
		case 4:
			bitir();
			break;
		}
	}

	private static void bitir() {

	}

	private static void listele(List<Kitap> liste) {
		System.out.println("Kitap ismi giriniz : ");

	}

	private static void noSil(List<Kitap> liste) {

	}

	private static void kitapEkle(List<Kitap> liste) {
		System.out.println("Kitap ismi giriniz : ");
		scan.nextLine();// dummy --> kukla Bos scan obj
		String kitapAdi = scan.nextLine();
		// scan.nextLine();//dummy --> kukla Bos scan obj
		System.out.println("Kitabin yazar  ismi giriniz : ");

		String yazarAdi = scan.nextLine();
		System.out.println("yayin yilini giriniz : ");
		int yayinyili = scan.nextInt();
		System.out.println("fiyatini giriniz : ");
		double fiyat = scan.nextDouble();
		Kitap kitap = new Kitap(++kitapNo, kitapAdi, yazarAdi, yayinyili, fiyat);// kitap obj create edildi
		liste.add(kitap);
		System.out.println(kitap.toString() + " eklendi  :) ");
		menu(liste);
	}
	}
	

