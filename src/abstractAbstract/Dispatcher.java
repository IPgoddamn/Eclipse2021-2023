package abstractAbstract;

public class Dispatcher {

	public static void main(String[] args) {
		Animal a = new Cat();
		a.say();
	}
}
abstract class Animal{
	int x = 10;
	abstract void say();
	void m(){}
}
class Dog extends Animal{
	void say() {System.out.println("WOOF");}
}
class Cat extends Animal{
	void say() {System.out.println("MEOW");}
}
abstract class Pig extends Animal{			// або зробити abstract, або реалізувати(implements) всі abstract метод супер классу Animal 
	void say() {System.out.println("!");}
}
