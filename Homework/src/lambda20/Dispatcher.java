package lambda20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.Comparator;
public class Dispatcher {

	public static void main(String[] args) {
		List<Integer> pos = new ArrayList<>();
		List<Integer> neg = new ArrayList<>(); 
		Integer [] arrays1 = {1, 2, 7, 10 ,16, 20 , -5, -6, -20, 150};
		Integer [] arrays2 = {3, 6, 11 ,15,-6, -20};
		List<Integer> result1 = Controller.biPos.apply(arrays1);
		List<Integer> result2 = Controller.biNeg.apply(arrays1);
		System.out.print("Pos = ");
		for (Integer temp : result1)System.out.print(temp + " ");
		System.out.print("\nNeg = ");
		for (Integer temp : result2)System.out.print(temp + " ");
		double result3 = Controller.findAverage.apply(arrays2);
		System.out.print("\n" + result3 + " || ");
		double result4 = Controller.findAverage.apply(arrays1);
		System.out.println("\n" + result4 + " || ");
		List<Integer> result6 = Controller.average.apply(arrays1, arrays2);
		for (Integer temp : result6)System.out.print(temp + " ");
	}
}
class Controller {
	private static List<Integer> pos = new ArrayList<>();
	private static List<Integer> neg = new ArrayList<>(); 
	static Function <Integer[], List<Integer>> biPos = tVal -> {
		for(Integer temp : tVal) {
			if (temp > 1) pos.add(temp);
		}
		return pos;
	};
	static Function <Integer[], List<Integer>> biNeg = tVal -> {
		for(Integer temp : tVal) {
			if (temp < 0) neg.add(temp);
		}
		return neg;
	};
	static Function <Integer[], Double> findAverage = array1 -> {
		double sum = 0;
		for(double temp : array1) {
			sum += temp;
		}
		return sum/array1.length;
	};
	static BiFunction <Integer[], Integer[], List<Integer>> beetweenAverage = (array1, array2) ->{
		double avg1 = findAverage.apply(array1);
		double avg2 = findAverage.apply(array2);
		List<Integer> list = new ArrayList<>();
		for (Integer temp : array1) {
			if (avg1 < avg2) {
				if (temp > avg1 && temp < avg2) list.add(temp);
			}else {
				if (temp < avg1 && temp > avg2) list.add(temp);
			}
		}
		return list;
	};
	static BiFunction <Integer[], Integer[], List<Integer>> average = (array1, array2) ->{
		List<Integer> list = new ArrayList<>();
		list.addAll(beetweenAverage.apply(array1, array2));
		list.addAll(beetweenAverage.apply(array2, array1));
		list.sort(new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		return list;
	};
}

