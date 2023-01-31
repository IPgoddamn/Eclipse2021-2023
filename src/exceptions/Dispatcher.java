package exceptions;
public class Dispatcher {
	public static void main(String[] args) {
		System.out.println("Strart");
		m1();
		System.out.println("End");
	}
	static void m1(){
		System.out.println("Start m1");
		try {
			
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("ArrayIndexOutOfBoundsExc");
		}
		m2();
		System.out.println("End m1");
	}
	static void m2(){
		System.out.println("Start m2");
		int [] x = {200, 500, 600, 100, 1100};
		for (int i = 0; i < 6; i++) {
			try {
			System.out.println(2000 / (x[i] - 100));
			}catch(ArithmeticException ae) {
				System.out.println("ArithmeticExc");
			}catch(ArrayIndexOutOfBoundsException aie) {
				System.out.println("ArrayIndexOutOfBoundsExc");
			}catch(RuntimeException sie) {
				System.out.println("RuntimeExc");
			}
		}
		System.out.println("End m2");
	}
}
// System.out.
// System.err.