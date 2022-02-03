package day47_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Maps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	             Map<Integer, String> sinif =new HashMap<>();
	
	sinif.put(101, "Ali,Can,J.dev");
	sinif.put(102, "Veli,Yan,QA");
	sinif.put(103, "Ali,Yan,C#");
	
	int no=104;
	String isim="Ayse";
	String soyisim="Can";
	String brans="QA";
	sinif.put(no, isim+ "," + soyisim+ "," + brans);
	
	System.out.println(sinif);  // {101=Ali,Can,J.dev, 102=Veli,Yan,QA, 103=Ali,Yan,C#, 104=Ayse,Can,QA}
	
	System.out.println(sinif.get(102));//Veli,Yan,QA
	System.out.println(sinif.get(104)); //Ayse,Can,QA
	
	System.out.println(sinif.keySet()); // [101, 102, 103, 104]
	System.out.println(sinif.values());  // [Ali,Can,J.dev, Veli,Yan,QA, Ali,Yan,C#, Ayse,Can,QA]
	
	
	List<String> valueList =new  ArrayList<>((sinif.values()));
	
	System.out.println( valueList);//value list: [Ali,Can,J.dev, Veli,Yan,QA, Ali,Yan,C#, Ayse,Can,QA]
	
	System.out.println(valueList.size()); // 4
	
	List<String> isimListesi=new ArrayList<>();
	
	String bilgiler[]=new String [3];
	for (int i = 0; i < valueList.size(); i++) {
	bilgiler=valueList.get(i).split(",");
	isimListesi.add(bilgiler[0]);	
	}
	
	System.out.println(isimListesi);
	
	
	
	}

}
