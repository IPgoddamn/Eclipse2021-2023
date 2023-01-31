package lamda;

public class LambdaEpam03 {

	public static void main(String[] args) {
		G g = new G() {
			public void m() {
				A.n();
			}
		};
		A a = new A();
		g = a::n2; //reference to instance method of class;

		g.m();
		g = A::n; //reference to static method of class;
	}
	

	interface G {
		void m();
	}

	static class A {
		static void n() {
			System.out.println("A.n");
		}
		void n2() {
			
		}
	}
}