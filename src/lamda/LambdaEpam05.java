package lamda;

public class LambdaEpam05 {
	// lamda with java methods
	public static void main(String[] args) {
		G g = new G() {
			public char m(String s, int x) {
				return s.charAt(x);
			}
		};
		
		g = String::charAt;
		char ch = g.m("asdf", 2);
		System.out.println(ch);
	}
	
	interface G {
		char m(String s, int x);		// String#charAt(int) ==> char
	}
}
