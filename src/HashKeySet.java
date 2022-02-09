import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashKeySet {
	public static void main(String[] args) {
		Map<Integer, String> ex = new HashMap<Integer, String>();
		ex.put(10, "Java");
		ex.put(20, "Java");
		ex.put(30, "sql");
		ex.put(40, ".net");
		ex.put(50, "sales");
		ex.put(50, "fire");
		Set<Integer> s = ex.keySet();
		System.out.println(s);
		}
		}
