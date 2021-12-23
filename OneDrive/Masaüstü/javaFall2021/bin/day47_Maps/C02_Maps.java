package day47_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_Maps {

	public static void main(String[] args) {
		
		Map<String,String> ogr1Map=new HashMap<>();
	
	ogr1Map.put("isim", "Ali");
	ogr1Map.put("soyisim", "can");
	ogr1Map.put("brans"," J.dev");
	
Map<String,String> ogr2Map=new HashMap<>();
	
	ogr2Map.put("isim", "veli");
	ogr2Map.put("soyisim", "yan");
	ogr2Map.put("brans"," Qa");
	
	
Map<String,String> ogr3Map=new HashMap<>();
	
	ogr3Map.put("isim", "ali");
	ogr3Map.put("soyisim", "yan");
	ogr3Map.put("brans"," C#");
	
	
Map<String,String> ogr4Map=new HashMap<>();
	
	ogr4Map.put("isim", "ayse");
	ogr4Map.put("soyisim", "can");
	ogr4Map.put("brans"," JQa");
	
	
	System.out.println("1. ogrenci : " + ogr1Map);
	System.out.println("2. ogrenci : " + ogr2Map);
	System.out.println("3. ogrenci : " + ogr3Map);
	System.out.println("4. ogrenci : " + ogr4Map);
	
	Map<Integer, Map<String,String>> sinifMap=new HashMap<>();
	
	sinifMap.put(101, ogr1Map);
	sinifMap.put(102, ogr2Map);
	sinifMap.put(103, ogr3Map);
	sinifMap.put(104, ogr4Map);
	
	System.out.println(sinifMap);
	
	
	}

}
