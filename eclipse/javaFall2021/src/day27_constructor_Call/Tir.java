package day27_constructor_Call;

public class Tir {

	int yil = 2000;
	String renk = "mavi";
	String model = "Toyota";
	int km;
	boolean satilikMi;

	public Tir(int i, String string, String string2, int j, boolean b) {

		km = i;
		model = string;
		renk = string2;
		yil = j;
		satilikMi = b;
	}

	public Tir(int km, String model, String renk) {
		
		this.km=km;
		this.model=model;
		this.renk=renk;
		
	}

}
