package codeWars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Lift {
	public static void main(String[] args) {
		Building b1 = new Building(6);
		b1.queues[2] = new int[] {5, 1, 0};				//	 0  1  2  3  4 
		b1.queues[3] = new int[] {};
		b1.queues[5] = new int[] {3};
		for (int[] arr1 : b1.queues) {
			for (int arr2 : arr1) {
				System.out.print(arr2);
			}
			System.out.println();
		}
		int [] arr1 = Controller.down(b1, 5);
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}
class Building{
	int numberOfFloors;
//	final List<Integer> building;
	final int[][] queues;
	Building(int numberOfFloors){
		int size = numberOfFloors;
		this.queues = new int [size] [];	
		for(int i = 0; i < size; i++) {
			this.queues[i] = new int [0];
		}
		this.numberOfFloors = numberOfFloors;
	}
}
class Controller{
	static int[] theLift(Building b, final int capacity) {
		for (int temp1 = 0; temp1 < b.numberOfFloors; temp1++) {
	    	if (b.queues[temp1].length == 0) continue;
			for (int temp2 = 0; temp2 < b.queues[temp1].length; temp2++) {
				if(b.queues [temp1][temp2] > temp1) up(b, capacity);
				else down(b, capacity);
			}
		}
	    return new int[0];	
	  }
	static int[] up (Building b, final int capacity) {
			final List<Integer> lift = new ArrayList<>(capacity);
			List<Integer> result = new ArrayList<>();
			result.add(0);
			for (int i = b.numberOfFloors - 1; i > -1; i--) {
				if(b.queues[i].length == 0 && !lift.contains(i)) continue;
					while(lift.contains(i)) {
						lift.remove(lift.indexOf(i));
					}
				result.add(i);
				for (int j = 0; j < b.queues[i].length; j++){
					lift.add(b.queues[i][j]);		
				}
				System.out.println(lift);
			}
			
	//		System.out.println("||" + lift + "||");
			if(result.get(result.size() - 1) != 0) result.add(0);
			
			return convert(result);
		}
	static int[] down (Building b, final int capacity) {
		final List<Integer> lift = new ArrayList<>(capacity);
		List<Integer> result = new ArrayList<>();
		result.add(0);
		for (int i = 0; i < b.numberOfFloors; i++) {
			if(b.queues[i].length == 0 && !lift.contains(i)) continue;
				while(lift.contains(i)) {
					lift.remove(lift.indexOf(i));
				}
			result.add(i);
			for (int j = 0; j < b.queues[i].length; j++){
				lift.add(b.queues[i][j]);		
			}
			System.out.println(lift);
		}
		
//		System.out.println("||" + lift + "||");
		if(result.get(result.size() - 1) != 0) result.add(0);
		
		return convert(result);
	}
	
		static int[] convert(final List<Integer> result) {
			int[] res = new int[result.size()];
			for (int i = 0; i < result.size(); i++) {
			    res[i] = result.get(i);
			}
			return res;
		}
}