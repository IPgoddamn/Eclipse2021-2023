package parameters;

public class Dispatcher {

	public static void main(String[] args) {
		Car c = new Car();
		c.price = 4000;
		c.enginePrice = 1500;
//		c.price = twice(c.price);    // Dispather.twice
//		c.enginePrice = twice(c.enginePrice);
		twiceCar(c);
		System.out.println(c.price);   // 8000 ?
		System.out.println(c.enginePrice);
	}
	static void twiceCar (Car car) {
		car.price *= 2;
		car.enginePrice *=2;
	}
	static int twice (int x) {          // ПРИ вызове метода с параметрами под параметры ведляеться память
		return x *= 2;
	}
}
class Car{
	int price;
	int enginePrice;
}