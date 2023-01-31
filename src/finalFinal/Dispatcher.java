package finalFinal;

public class Dispatcher {
	final static int Y = 20;
	final int DATE;			// int DATE = 0;
	Dispatcher(int DATE){	// в кожному об'єкті ця змінна буде своя, тому не потрібно модифікатор static
		this.DATE = DATE;
	}
	final int B = init();
	int init() {
		return 100;
	}
	
	public static void main(String[] args) {
		final int x = 10;
//		x++;
		final Test t = new Test();
		t.a = 60;	// ?????
//		t = new Test();		// не можна присвоїти інший Test
		
	}
}
/*
final class Parent{
	void m() {System.out.println("parent");}
}
class Child extends Parent{
	void m() {System.out.println("child");} 
}
*/
class Test{
	int a = 50;
}