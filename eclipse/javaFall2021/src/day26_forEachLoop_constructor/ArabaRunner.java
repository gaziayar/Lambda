package day26_forEachLoop_constructor;

public class ArabaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Araba araba1=new Araba ();
	
	
	 System.out.println(araba1.fiyat+" "+araba1.ilanNo+" "+araba1.marka+" "+araba1.model+" "+araba1.yil);
	int ilanNo=1002;
    String marka="toyota";
    String model=" corolla";
    int yil=2001;
    int fiyat=1000;
    System.out.println(araba1.fiyat+" "+araba1.ilanNo+" "+araba1.marka+" "+araba1.model+" "+araba1.yil);
    
	araba1.hiz(150);
	
	araba1.yakit("benzin");
	
	}

}
