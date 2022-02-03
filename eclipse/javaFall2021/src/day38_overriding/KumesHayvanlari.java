package day38_overriding;

public class KumesHayvanlari extends Kuslar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 KumesHayvanlari kms1=new  KumesHayvanlari();
 kms1.beslenme();
 kms1.hareket();
 kms1.solunum();
 Kuslar kms2=new KumesHayvanlari();
 kms2.beslenme();
 kms2.hareket();
 kms2.solunum();
 Kuslar kms3=new Kuslar();
 kms3.beslenme();
 kms3.hareket();
 kms3.solunum();
	
	Animal kms4=new KumesHayvanlari();
	kms4.beslenme();
	 kms4.hareket();
	 kms4.solunum();
	}
public void hareket() {
	System.out.println("kumes hayvanlari yruyerek hareket eder");
}
}
