package sorting_Compare;

import java.util.Arrays;
import java.util.Comparator;
public class Dispatcher {
	public static void main(String[] args) {
//		String[] s = {"Serg", "Ann", "Vlad", "Max", "Mary"};
//		System.out.println(Arrays.toString(s));
//		Arrays.sort(s);
//		System.out.println(Arrays.toString(s));
		Car c1 = new Car("BMW", "Green", 7000, 240);
		Car[] c = new Car[3];
		c[0] = new Car ("BMW", "Green", 7000, 240);
		Car[] cars = {new Car ("BMW", "Green", 7000, 240),
					  new Car ("Audi", "White", 8000, 220),
					  new Car ("Ford", "Black", 6000, 230),
					  new Car ("Opel", "Blue", 9000, 250)
		}; 
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars);
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars, new Car().new ComparatorByPrice());
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars, new ComparatorByColor());
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars, new Car.ComparatorBySpeed());
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars, new Comparator(){
				public int compare(Object o1, Object o2) {
					return	((Car)o1).color.compareTo(((Car)o2).color);
				}
		});
	}
}
class Car implements Comparable{
	class ComparatorByPrice implements Comparator{
		public int compare(Object o1, Object o2) {
			return	((Car)o1).price - ((Car)o2).price;
		}
	}
	static class ComparatorBySpeed implements Comparator{
		public int compare(Object o1, Object o2) {
			return	((Car)o2).speed - ((Car)o1).speed;
		}
	}
	Car (){}
	String model;
	String color;
	int price;
	int speed;
	Car(String model, String color,	int price, int speed){
		this.model = model;
		this.color = color;
		this.speed = speed;
		this.price = price;
	}
	@Override
	public String toString () {
		return this.model + " " + this.color + " " + this.price + " " + this.speed;
	}
	public int compareTo(Object o) {	// Object o = Car c
		int result = this.model.compareTo(((Car)o).model);
		if (result != 0)return result;
		result = this.price - ((Car)o).price;
		if (result != 0)return result;
		result = ((Car)o).speed - this.speed;
		if (result != 0)return result;
		result = this.color.compareTo(((Car)o).color);
		return result;
//		return this.price - ((Car)o).price;
//		return ((Car)o).speed - this.speed;
//		return this.model.compareTo(((Car)o).model);
	}
}
//model -> price -> speed -> color

class ComparatorBySpeed implements Comparator{
	public int compare(Object o1, Object o2) {
		return	((Car)o2).speed - ((Car)o1).speed;
	}
}
class ComparatorByColor implements Comparator{
	public int compare(Object o1, Object o2) {
		return	((Car)o1).color.compareTo(((Car)o2).color);
	}
}