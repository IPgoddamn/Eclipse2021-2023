package garbageCollector;

public class Handler {

	public static void main(String[] args) {
//		Car c1 = new Car();
//		c1 = new Car(); 
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		c1.c = c2;
		c2.c = c3;
		c3.c = c1;
		c1 = null;
	}

}
class Car{
	Car c;
	static Car protect;			// ащита об'єкта от удаления
	public void finilize() {
		protect = this;
	}
}	