package lamda;

public class LambdaEpam01 {

	public static void main(String[] args) {
		int x = 7;
		G g = new G () {
			public void m() {
//				x = 8;
				System.out.println("Anonimus");
			}
		};
		G g1 = () -> {
//			x = 5;
			System.out.println("Lamda");
		};
		g1 = () -> System.out.println("Easier Lamda"); // only one statement
		g.m();
		g1.m();
		n(() -> System.out.println("ok"));
	}
	static void n (G g) {
	g.m();
	}
}
@FunctionalInterface
interface G {
	void m();
}