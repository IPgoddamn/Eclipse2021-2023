package anonymus;
public class Dispatcher {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.display();
//		System.out.println(p1.g);
		Child c = new Child();
		System.out.println(c.g);
		Parent p2 = new Parent() {		// один іннер клас
			int f = 80;					// legal, but have no sence
			void display() {
				System.out.println("Anonymus");
			}
			void display(int c) {}
		};
//		System.out.println(p2.f);
		p2.display();
		Parent p3 = new Parent() {		// другий іннер клас
			void display() {
				System.out.println("Anonymus");
			}
		};
		I2 i = new I2(){};				// Інтерфейси не мають конструкторів, але тут всередині є анонімний іннер класс 
	}
}
class Parent{
	void display() {
		System.out.println("Parent");
	}
}
class Child extends Parent implements I1,I2{
	int g = 90;
	void display() {
		System.out.println("Child");
	}
}
interface I1{}
interface I2{}