package kitapci;

public class Kitap {
  private int kitapNo;
  private String kitapAdi;
  private String yazarAdi;
  private int yayinYili;
  private double fiyat;

  
  
  public int getKitapNo() {
	return kitapNo;
}
public Kitap(int kitapNo, String kitapAdi, String yazarAdi, int yayinYili, double fiyat) {
	super();
	this.kitapNo = kitapNo;
	this.kitapAdi = kitapAdi;
	this.yazarAdi = yazarAdi;
	this.yayinYili = yayinYili;
	this.fiyat = fiyat;
}

public Kitap() {
	}

public void setKitapNo(int kitapNo) {
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
	return "Kitap [kitapNo=" + kitapNo + ", kitapAdi=" + kitapAdi + ", yazarAdi=" + yazarAdi + ", yayinYili="
			+ yayinYili + ", fiyat=" + fiyat + "]";
}


}  
  
  

