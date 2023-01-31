package parameters04;
import static parameters04.View.display;
public class Test {
	public static void main(String[] args) {
			Car c1 = new Car(10, 50, 100);
			display(Controller.calculate("speed", c1, 10));
//			display(Controller.calculate("pow", 6, 2));
			display(Controller.calculate("price", c1, 3.553));
		}
	}
	class Car {
		int price;
		int weight;
		int speed;
		Car(int price, int weight, int speed){
			this.price = price; this.speed = speed; this.weight = weight;
		}
	}
	class Controller{
		static double calculate (String k ,double x, double y) {
			switch (k) {
			case "div":
			double div = x/y;
			return x = div;
			case "log10":
			double log10 = Math.log10(x+y);
			return x = log10;
			case "log" :
			double log = Math.log(x+y);
			return x = log;
			case "pow":
			double pow = Math.pow(x, y);
			return x = pow;
			default: System.out.println("Wrong function");return 0;
			}
		}
		static double calculate (String k, Car car, double m) {
			switch (k) {
			case "price" :
				return m = car.price*m;
			case "weight" :
				return m = (double)car.weight*m;
			case "speed" :
				return m = (double)car.speed *m;
			default: System.out.println("Wrong function");return 0;
			}
		}
	}
class View{
	static void display(double result) {
		System.out.println(result);
	}
}

	


