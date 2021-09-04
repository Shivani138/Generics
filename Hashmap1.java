package Practical;
import java.util.HashMap;
import java.util.Map;
public class Hashmap1 {
	public static void main(String[] arguments) {
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
		hash_map.put(1, "Shivani");
		hash_map.put(2, "Thakkar");
		for (Map.Entry<Integer, String> set : hash_map.entrySet()) {
		    System.out.println(set.getKey() + " = " + set.getValue());
		}
	}
}
