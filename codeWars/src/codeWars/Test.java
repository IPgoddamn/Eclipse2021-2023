package codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Building1 b1 = new Building1(6);
		b1.queues[0] = new int[] {};
		b1.queues[1] = new int[] {0};
		b1.queues[2] = new int[] { 5, 1, 0, 4 }; // 0 1 2 3 4
		b1.queues[3] = new int[] {};
		b1.queues[4] = new int[] {};
		b1.queues[5] = new int[] { 3 };
		for (int[] arr1 : b1.queues) {
			for (int arr2 : arr1) {
				System.out.print(arr2);
			}
			System.out.println();
		}
		int[] arr1 = Controller1.theLift(b1, 5);
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}

class Building1 {
	int numberOfFloors;
//	final List<Integer> building;
	final int[][] queues;

	Building1(int numberOfFloors) {
		int size = numberOfFloors;
		this.queues = new int[size][];
		for (int i = 0; i < size; i++) {
			this.queues[i] = new int[0];
		}
		this.numberOfFloors = numberOfFloors;
	}
}

class Controller1 {
	static int[] theLift(Building1 b, final int capacity) {
		final List<Integer> result = new ArrayList<>();
//		for (int temp1 = 0; temp1 < b.numberOfFloors; temp1++) {
//	    	if (b.queues[temp1].length == 0) continue;
//			for (int temp2 = 0; temp2 < b.queues[temp1].length; temp2++) {
//				if(b.queues [temp1][temp2] > temp1) result.addAll(up(b, capacity));
//				else result.addAll(down(b, capacity));
//			}
//		}
		result.addAll(up(b, capacity));
		System.out.println("next");
		result.addAll(down(b, capacity));
		return convert(result);
	}

	static List<Integer> up(Building1 b, final int capacity) {
		final List<Integer> lift = new ArrayList<>(capacity);
		List<Integer> result = new ArrayList<>();
		if (result.isEmpty())
			result.add(0);
		for (int i = b.numberOfFloors - 1; i > -1; i--) {
			if (b.queues[i].length == 0 && !lift.contains(i))
				continue;
			while (lift.contains(i)) {
				lift.remove(lift.indexOf(i));
			}
			result.add(i);
			for (int j = 0; j < b.queues[i].length; j++) {
				if (b.queues[i][j] > i)
					continue;
				lift.add(b.queues[i][j]);
			}
			System.out.println(lift);
		}

		// System.out.println("||" + lift + "||");
//			if(result.get(result.size() - 1) != 0) result.add(0);

		return result;
	}

	static List<Integer> down(Building1 b, final int capacity) {
		final List<Integer> lift = new ArrayList<>(capacity);
		List<Integer> result = new ArrayList<>();
//		if(result.isEmpty()) result.add(0);
		for (int i = 0; i < b.numberOfFloors; i++) {
			if (b.queues[i].length == 0 && !lift.contains(i))
				continue;
			while (lift.contains(i)) {
				lift.remove(lift.indexOf(i));
			}
			result.add(i);
			for (int j = 0; j < b.queues[i].length; j++) {
				if (b.queues[i][j] < i)
					continue;
				lift.add(b.queues[i][j]);
			}
			System.out.println(lift);
		}

//		System.out.println("||" + lift + "||");
		if (result.get(result.size() - 1) != 0)
			result.add(0);

		return result;
	}

	
	static int[] convert(final List<Integer> result) {
		int[] res = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			res[i] = result.get(i);
		}
		return res;
	}
}