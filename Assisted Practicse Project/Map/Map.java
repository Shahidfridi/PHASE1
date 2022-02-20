package Map;
import java.util.HashMap;
import java.util.*;
public class Map {
public class Entry {
}
	public static void main(String[] args) {
		
				
				   // Hashmap
				System.out.println("Hashmap");
				HashMap<Integer,String> Hm= new HashMap<Integer,String>();
				Hm.put (3,"sharktank");
				Hm.put (56, "india");
				for(java.util.Map.Entry<Integer,String>m:Hm.entrySet()) {
                 System.out.println(m.getKey()+""+m.getValue());
                 
		       //HashTable
				System.out.println("Hashtable");
				Hashtable<Integer,String> HT= new Hashtable<Integer,String>();
				HT.put (33, "hi");
				HT.put (6, "india");
				System.out.println(HT);
				
				
				//TreeMap
				System.out.println("TreeMap");
				TreeMap<Integer,String> map= new TreeMap<Integer,String>();
				map.put (233, "hello");
				map.put(67,"chalo");
				System.out.println(map);
				
				
				}
			}
		


	}


