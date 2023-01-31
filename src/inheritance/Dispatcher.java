package inheritance;

public class Dispatcher {

	public static void main(String[] args) {
	Child c = new Child();
	System.out.println(c.x + " " + c.y);

	}

}
class Parent{
	int x = 10;
}
class Child extends Parent{
	int y = 20;
}