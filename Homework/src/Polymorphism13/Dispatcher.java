package Polymorphism13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class Dispatcher {

	public static void main(String[] args) {
		Car c1 = new Car(7000 , 2005, "Serg");
		Car c2 = new Car(9000 , 2010, "Mary");
		Car c3 = new Car(5000 , 2003, "Jimmy");
		Car c4 = new Car(7000 , 2005, "Serg");
		ArrayList<Car> list = new ArrayList<Car>(Arrays.asList(c1, c2, c3, c4));
		System.out.println(list.contains(new Car(0 , 0, "Serg")));
		System.out.println(Car.searchOwner(list, "Serg"));
//		System.out.println(list);
//		list.sort(c1);
//		System.out.println(c1.equals(c4));
		
	}

}
class Car {
	private int price;
	private int produceYear;
	private String owner;
	Car(int price, int produceYear, String owner) {
		this.owner = owner;
		this.price = price;
		this.produceYear = produceYear;
	}
	@Override
	public String toString() {
		return "price = " + price + ", produceYear = " + produceYear + ", owner = " + owner;
	}
	@Override
	public boolean equals(Object o) {
		return	this.owner.equals(((Car)o).owner);
	}
	static boolean searchOwner(ArrayList<Car> list, String owner) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).owner == owner) return true;
		}
		return false;
	}
}