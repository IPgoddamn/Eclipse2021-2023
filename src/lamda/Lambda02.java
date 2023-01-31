package lamda;

public class Lambda02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
@FunctionalInterface
interface I11 {
	void m1();
//	void m2();
	default void m3() {};
	default void m4() {};
	static void m5() {};
	static void m6() {};
}