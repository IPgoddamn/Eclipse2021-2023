package overriding;				// Переопределение 

public class Dispatcher {

	public static void main(String[] args) {
		String s = new String("Serg"); // String s = "Serg"; literal (литеральный)
		System.out.println(s);
		Car c1 = new Car("BMW", 7000);
		System.out.println(c1);		//c.toString();
		
	}
}
class Car{
	String model;
	int price;
	Car(String model, int price){
		this.model = model;
		this.price = price;
	}
	public String toString(){
		return this.model + " " + this.price;
	}
}
//overriding.Car@76ccd017
// повна назва  @ (якийсь) код від адресси комірки памяти де розміщаеться наш об'єкт
// Підклас має право наслідуючи метод суперкласу його перевизначити крім назви return type і параметри, а body може міняти
// Переопределенный метод не может иметь доступа более узкий чем метод суперклассу