package day40;

public class C01_Exception {

	public static void main(String[] args) {//System.out.println(" sayilarin bolumu:"+a/b);} 
		// TODO Auto-generated method stub
            int a=20;
            int b=0;
            
            try {            
                System.out.println(" sayilarin bolumu:"+a/b);} 
            catch(ArithmeticException e)
	{System.out.println("bolme isleminde payda sifir olamaz");
	
	e.printStackTrace();
	
	}
     
            System.out.println("gorev temamlandi");
	}

}
