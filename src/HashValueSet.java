import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class HashValueSet {
	public static void main(String[] args) {
		Map<Integer, String> ex = new HashMap<Integer, String>();
		ex.put(10, "Java");
		ex.put(20, "Java");
		ex.put(30, "sql");
		ex.put(40, ".net");
		ex.put(50, "sales");
		ex.put(50, "fire");
		Collection<String> s = ex.values();
		System.out.println(s);
		}

}
