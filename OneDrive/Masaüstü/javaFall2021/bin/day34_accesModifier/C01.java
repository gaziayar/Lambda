package day34_accesModifier;

public class C01 {
  
	private int sayiPrivate=10;// sadece icinde bulundugu class dan ulasabiliriz
 
  int sayiDefault=20;//sadece icinde oldugumuz package den ulasilabilir diger ismide package acces modifier dir

  protected int sayiProtected=30;//icinde bulundugu package deki tum classlar ve packagelardaki child claslar ulasabilir
 
  public int sayiPublic=40;// tum class lardan ulasilir
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
C01 obj=new C01();

System.out.println(obj.sayiPrivate);
System.out.println(obj.sayiDefault);
System.out.println(obj.sayiProtected);
	
System.out.println(obj.sayiPublic);

	}
	public void staticOlmayanMethod() {

		C01 obj = new C01();
		System.out.println(obj.sayiPrivate);
		 System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiPublic);
		System.out.println(sayiProtected);

	}
}
