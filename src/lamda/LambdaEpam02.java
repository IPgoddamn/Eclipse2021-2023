package lamda;

public class LambdaEpam02 {

	public static void main(String[] args) {
		Gg g = new Gg () {
			public void m(int x) {
				System.out.println("Anonimus");
				System.out.println(x);
			}
		};
		Gg g1 = (int x) -> {
			System.out.println("Lamda");
		};
		g1 = (int x) -> System.out.println("Easier Lamda"); // 1 only one statement
		g1 = (x)-> System.out.println(x);		// 2
		g1 = x -> System.out.println(x);		// 3
		g.m(8);
		g1.m(7);
		n((int x) -> System.out.println("ok"));
	}
	static void n (Gg g) {
	g.m(8);
	}
}
interface Gg {
	void m(int x);
}
