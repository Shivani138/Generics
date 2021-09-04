package Practical;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
public class Hashmap3 {
	public static void main(String[] arguments) {
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Shivani");
		hash_map.put(2, "Thakkar");
		Iterator<Entry<Integer, String>> it = hash_map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer, String> set = (Map.Entry<Integer, String>) it.next();
			System.out.println(set.getKey() + " = " + set.getValue());
		}
	}
}
