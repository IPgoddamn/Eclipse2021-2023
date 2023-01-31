package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class LambdaEpam08 {
	// work with Lists
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1, 5, 7, 3));
		list.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		System.out.println("~~~~~~~~~~~~~~~");
		list.forEach(x -> System.out.println(x));
		System.out.println("~~~~~~~~~~~~~~~");
		list.sort(null);
		list.forEach(System.out::println);
		System.out.println("~~~~~~~~~~~~~~~");
		list.sort(Comparator.reverseOrder());
		list.forEach(System.out::println);
		System.out.println("~~~~~~~~~~~~~~~");
		list.sort((x1, x2)-> {
			return x1 - x2;		// be carefull
		});
		list.forEach(System.out::println);
		System.out.println("~~~~~~~~~~~~~~~");
		list.sort((x1, x2)-> x2 - x1);
		list.forEach(System.out::println);
		System.out.println("~~~~~~~~~~~~~~~");
		list.sort(Integer::compare);
		list.forEach(System.out::println);

	}
}
