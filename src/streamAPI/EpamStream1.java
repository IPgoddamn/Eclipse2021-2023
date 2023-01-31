package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EpamStream1 {
	// work with int
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1, 5, 4, 7, 3, 2, 3, 2, 5, 1, 7));
		list.addAll(Arrays.asList(1,2,1,2));
		List<Integer> list2 = list.stream()
			.filter(x -> x <=4)
			.collect(Collectors.toList());
		System.out.println(list2);
		boolean b = list.stream().allMatch(x-> x < 10);
		System.out.println(b);
//		Map<Integer, Integer> map = list.stream()
//			.collect(Collectors.toMap(x -> x, x -> x*x));
//		map.forEach((k, v) -> System.out.printf("%s ==> %s%n", k, v)); duplicate exception
		Map<Integer, Integer> map2 = list.stream().collect(
					Collectors.toMap(
						x -> x,
						x -> x * x,
						Integer::sum
							));
			map2.forEach((k, v) -> System.out.printf("%s ==> %s%n", k, v));

	}
}
