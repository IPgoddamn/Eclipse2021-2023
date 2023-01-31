package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EpamStream2 {
	// work with string
	public static void main(String[] args) {
		List<String>list = new ArrayList<>();
		list.addAll(Arrays.asList("abcd", "ret", "1234", "123", "abgt", "sa"));
		Map <Integer, List<String>> map = list.stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(map.values());
		map.values().stream()
					.flatMap(List<String>::stream) // Collection::stream это предок
					.collect(Collectors.toList())
					.forEach(System.out::println);
	}
} 
