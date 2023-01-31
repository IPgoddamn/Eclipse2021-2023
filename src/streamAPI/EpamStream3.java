package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EpamStream3 {
	// work with string
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("abcd", "ret", "1234", "123", "abgt", "sa", "123", "abgt", "sa"));
		Object o = list.parallelStream()
//			.map(String::length)
			.map(s -> s.length())
				.collect(
						StringBuilder::new, 
						StringBuilder::append,
						(a, s) -> {
					System.out.println(Thread.currentThread());
					a.append(s);
				});
		System.out.println(o);
	}
}
