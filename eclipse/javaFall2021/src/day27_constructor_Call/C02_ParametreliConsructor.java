package day27_constructor_Call;

public class C02_ParametreliConsructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Car1 car1=new Car1( 50000,"Vectra","Beyaz",2015,true);
	
	
	Car1 car2= new Car1(35000);
	
	
	
	System.out.println(car2.km);
	
	
	Car1 car3=new Car1();
	
	
	System.out.println(car3.km);
	
	Car1 car4=new Car1(1000);
	System.out.println(car4.km);
	
	Car1 car5=new Car1(2020, 5000);
	
	System.out.println(car5.yil + " " + car5.km+" " +car5.model);
	
	
	}

}
