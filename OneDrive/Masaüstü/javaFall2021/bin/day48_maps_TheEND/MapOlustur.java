package day48_maps_TheEND;

import java.util.HashMap;
import java.util.Map;

public class MapOlustur {
    
    	 
    	 public static Map<Integer,String> myMap(){
    			Map<Integer,String> ornekMap=new HashMap<>();
    			//{ 101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
    			
    			ornekMap.put(101, "Ali, Can, java");
    			ornekMap.put(102, "Veli, Yan, java");
    			ornekMap.put(103, "Ali, Yan, C#");
    			ornekMap.put(101, "Ali, Kan, java");
    			ornekMap.put(104, "Mustafa, Yan, C#");
    			ornekMap.put(105, "bekir, Can, java");
    			ornekMap.put(106, "Ali, Can, java");
    			
    			
    			return ornekMap;
    	 
     }
}
