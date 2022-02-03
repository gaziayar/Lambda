package day30_immutableClasses;

public class C02_Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Ali";

		for (int i = 0; i < 100; i++) {
			str += " ";

			// bu kod calistiginda kac obje olusturur?
			// bir obje basta olusturuldu
			// loop da ise 100 obje daha olusturuldu

		}

		System.out.println(str);

	}

}
