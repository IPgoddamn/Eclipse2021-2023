package lamda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class LambdaEpam09 {
	// work with Maps
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.forEach(new BiConsumer<Integer, String>(){
			public void accept(Integer k, String v) {
				System.out.printf("%s ==> %s%n", k, v);
			}
		});
		System.out.println("~~~~~~~~~");
		map.forEach((k,v) -> System.out.printf("%s ==> %s%n", k, v));
	}
}
