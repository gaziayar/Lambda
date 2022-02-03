package day30_immutableClasses;

public class C04_Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = " ";

		a += 2;

		a += 'C';
		a += false;

		if (a == "2cfalse") {
			System.out.println("==");
		}
		if (a.equals("2cfalse")) {
			System.out.println("equals");
		}
	}

}
