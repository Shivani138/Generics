package Practical;
import java.util.HashMap;
import java.util.Map;
public class Hashmap2{
	public static void main(String[] arguments) {
		Map<Integer, String> hash_map = new HashMap<Integer, String>();
 hash_map.put(1, "Shivani");
		hash_map.put(2, "Thakkar");
		hash_map.forEach((key,value) -> System.out.println(key + " = " + value));
	}
}