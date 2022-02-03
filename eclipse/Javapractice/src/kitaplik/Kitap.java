package kitaplik;

public class Kitap {

	private int kitapNo;
	private String kitapAdi;
	private String yazarAdi;
	private int yayinYili;
	private double fiyat;
	
	public Kitap(){
		
	}

	public Kitap(int kitapNo, String kitapAdi, String kitapYazar, int yayinYili, double fiyat) {
this.kitapNo=kitapNo;
this.kitapAdi=kitapAdi;
this.yazarAdi=kitapYazar;
this.yayinYili=yayinYili;
this.fiyat=fiyat;
	}

	public int getNo() {
		return kitapNo;
	}

	public void setNo(int no) {
		this.kitapNo = kitapNo;
	}

	public String getKitapAdi() {
		return kitapAdi;
	}

	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}

	public String getYazarAdi() {
		return yazarAdi;
	}

	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}

	public int getYayinYili() {
		return yayinYili;
	}

	public void setYayinYili(int yayinYili) {
		this.yayinYili = yayinYili;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;

	}

	
	@Override
	public String toString() {
		return kitapNo + "\t  " +kitapAdi + "\t  " + yazarAdi +  "\t  "  +  yayinYili + "\t           "  + fiyat ;
	}
	// kitapNo, String kitapAdi, String kitapYazar, int yayinYili, double fiyat
}
