package projava;

import java.util.HashMap;
import java.util.Map;

public class MapSample {
	
	public static void main(String[] args)
	{	
		
		Map<Integer,String> map = new HashMap<>();
		Map<String,String> map2 = new HashMap<>();
		
		map.put(1, "aaa");
		map.put(2, "bbb");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		System.out.println(map.size());
		
		map2.put("a", "ccc");
		map2.put("b", "bbb");
		
		System.out.println(map2.get("a"));
		System.out.println(map2.get("b"));
		
		map.merge(3, map2.get("a"), (old,n) -> n.toUpperCase());
		System.out.println(map.size());
		System.out.println(map.get(3));
		
	}
}
