package inner;

public class Dispatcher {

	public static void main(String[] args) {
		 Outer.Inner i = new Outer().new Inner();
		 i.display();
		 Outer.InnerStatic is = new Outer.InnerStatic();
		 is.display();
	}

}
class Outer{				// top-level class
//	Inner i;		// композиція
	private int x = 10;
	static int y = 30;
	protected class Inner{	// regular inner class	
		int x = 20;
		void display() {
			System.out.println(Outer.this.x);	// 10
			System.out.println(x);				// 20
		}
		
	}
	static class InnerStatic {	// nested class - вкладенний класс
		void display() {
//			System.out.println(x);
			System.out.println(y);
		}
	}	
	void m () {
		int a = 50;				// effectively final
		class InnerLocal{
			void display() {
				System.out.println(Outer.this.x++);
				System.out.println(a);	
			}
		}
//		a++;
	}
}
// add(int x, int y) x,y
// add(Object x, Object y)
