package stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Handler {
	static int rand = (int)(Math.random() * 100);
	public static void main(String[] args) {
		Collection <String> als = new ArrayList<>();
		als.addAll(Arrays.asList("Serg", "Ann", "Max", "Vlad"));
		Stream<String> ss1 = als.stream();
		Stream<String> ss2 = als.parallelStream();
		Stream<String> ss3 = Stream.empty();
		System.out.println(ss3.count());
		Stream <String> ss4 = Stream.of("Kyiv", "Odessa", "Dnipro", "Lviv");
		String[] array = {"Mary", "Lucy"};
		Stream<String> ss5 = Arrays.stream(array);
		Stream<String> ss6 = Stream.generate(() -> new Double(Math.random()).toString());
//		Stream<String> ss7 = ss6.limit(10);
//		ss7.forEach(s -> System.out.println(s));
		ss6.limit(10).forEach(s -> System.out.print(s + " "));	//ss6 - dead
		System.out.println();
		ss6 = Stream.generate(() -> new Double(Math.random()).toString());
		ss6.limit(10).sorted().forEach(s -> System.out.print(s + " "));
		Stream <String> ssAddition = Stream.of("Lviv");
		System.out.println();
		Stream <String> ss8 = Stream.concat(ss4, ssAddition).distinct();
//		ss8.skip(1).forEach(s -> System.out.print(s + " "));
		ss8.filter(s -> s.length() < 6).forEach(s -> System.out.print(s + " "));
		System.out.println();
		Stream<String> ss9 = Stream.iterate("Serg", s -> {
			rand = (int)(Math.random()*100);
			if (rand % 2 == 0) {
				return(s.toUpperCase());
			}else {
				return(s.toLowerCase());
			}
		});
		ss9.limit(8).forEach(s -> System.out.print(s + " "));
//		ss4.map(s -> s.toUpperCase()).forEach(s -> System.out.print(s + " "));
		Car[] cars = {new Car(7000), new Car(5000), new Car(8000)};
		Stream<Car> sc = Stream.of(new Car(7000), new Car(5000), new Car(8000));
		List<Car> alc = sc.peek(c -> c.price += 500).collect(Collectors.toList());
		System.out.println(Arrays.toString(cars));
	}
}
class Car{
	int price;

	public Car(int price) {
		super();
		this.price = price;
	}
	public String toString() {
		return "" + price;
	}
}