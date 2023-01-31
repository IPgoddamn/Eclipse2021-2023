package lamda;

public class LambdaEpam04 {
	// отличие лямбда виражений от анинмных классов
	public static void main(String[] args) {
		G g = new G() {
			public void m() {
				System.out.println("A");
				System.out.println(this);
			}
			
		};
//		g = () -> {
//			System.out.println("L");
////			System.out.println(this); 	// <-- Error!!!
//		};
		LambdaEpam04 t = new LambdaEpam04();
		t.n();
	}
	
	interface G {
		void m();
	}
	void n(){
		G g  = () -> {
			System.out.println("L");
			System.out.println(this); 	
		};
		g.m();
	}
}
