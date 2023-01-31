package package1;
import package2.Test2;
import package2.ParentReadThis;
public class Dispatcher extends ParentReadThis {
	public static void main(String[] args) {
		Test1 t1 = new Test1();
		System.out.println(t1.x1);
		System.out.println(t1.x2);
		System.out.println(t1.x3);
//		System.out.println(t1.x4);
		t1.dispaly();
		Test2 t2 = new Test2();
		System.out.println(t2.z1);	// public
//		System.out.println(t2.z2);	// protected
//		System.out.println(t2.z3); 	// default
//		System.out.println(t2.z4);	// private
//		Parent t3 = new Parent();
		Dispatcher t3 = new Dispatcher();
		System.out.println(t3.y1);	// public
		System.out.println(t3.y2);	// protected	????
//		System.out.println(t3.y3);	// default
//		System.out.println(t3.y4);	// private
	}

}
class Test1{
	public int x1 = 10;
	protected int x2 = 20;
	int x3 = 30;
	private int x4 = 40;
	void dispaly () {
		System.out.println(x4);
//		Dispatcher t4 = new Dispatcher();
//		System.out.println(t4.y2);
	}
}