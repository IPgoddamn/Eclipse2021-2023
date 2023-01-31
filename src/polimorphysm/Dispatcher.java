package polimorphysm;

public class Dispatcher {

	public static void main(String[] args) {
		int x = 10;
		double y = x;
		Dog d = new Dog();	// direct reference
		Animal a = d;		// polymorphic reference
		a = new Cat();
		a.say();
		System.out.println(a.x);	// shadowing
//		System.out.println(a.y);	// Поліморфне посилання не може звернутись
		Cat c = new Cat();
		System.out.println(c.y);
	}
}
class Animal{
	int x = 10;
	void say() {}
}
class Dog extends Animal{
	int x = 20;
	void say() {
		System.out.println("WOOF");		//overriding
	}
}
class Cat extends Animal{
	int x = 30;
	int y = 40;
	void say() {
		System.out.println("MEOW");		//overriding
	}
}