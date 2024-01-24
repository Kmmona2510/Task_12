package task12_day15;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class Q3Treemap {

	public static void main(String[] args) {
		Map<String,String> treemap =new TreeMap<>();
		treemap.put("100", "Anu");
		treemap.put("200", "Banu");
		treemap.put("300", "Candy");
		treemap.put("400", "David");
		
		System.out.println("The map value is:");
		
		System.out.println(treemap);
		
		System.out.println("The Entryset Value is");
		
		System.out.println(treemap.entrySet());
		
		Set<Entry<String,String>> entryset=treemap.entrySet();
		for (Entry<String, String> entry : entryset) {
			String key =entry.getKey();
			System.out.println(key);
			String value =entry.getValue();
			System.out.println(value);
		}
		
		
		
		
		
	}

}
