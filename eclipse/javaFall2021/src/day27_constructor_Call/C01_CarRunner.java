package day27_constructor_Call;

import day26_forEachLoop_constructor.Car;


public class C01_CarRunner {

	

	
		// dunku car clasindan obje olusturalim
	
	    public static void main(String[] args) {
	        // Dunku Car clss'indan bir obje olusturmak istedigimizde
	        // java Car class'ini icinde bulundugumuz class'a import etmek ister
	        
	        Car car=new Car();
	        System.out.println(car.yil); 
	        // ancak baska package'da oldugu icin icinde oldugumuz class'dan 
	        // Car class'indaki variable'lara ulasabilmem icin variable'in axcess modifier'i
	        // public olmalidir
	        
	        
	        Car1 car1 =new Car1();
	        System.out.println(car1.km +" " + car1.model + " " + car1.renk + " " + car1.yil+" " + car1.satilikMi);
	        // 0 null null 2000 false
	        
	        car1.km=75000;
	        car1.model="Corolla";
	        car1.renk="Kirmizi";
	        System.out.println(car1.km +" " + car1.model + " " + car1.renk + " " + car1.yil+" " + car1.satilikMi);
	        // 75000 Corolla Kirmizi 2000 false
	        
	        

	
	
	
	
	
	}

}
