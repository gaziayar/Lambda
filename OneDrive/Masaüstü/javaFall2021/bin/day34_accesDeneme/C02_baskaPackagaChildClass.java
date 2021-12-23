package day34_accesDeneme;

import day34_accesModifier.C01;

public class C02_baskaPackagaChildClass extends C01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		C01 obj = new C01();

		// System.out.println(obj.sayiPrivate);
		// System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiPublic);

	}

	public void staticOlmayanMethod() {

		C01 obj = new C01();

		// System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiPublic);
		System.out.println(sayiProtected);

	}

}
