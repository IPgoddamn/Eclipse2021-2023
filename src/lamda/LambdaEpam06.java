package lamda;

public class LambdaEpam06 {
	// lamda with java Constructors
	public static void main(String[] args) {
//		G g = new G() {
//			public char m(String s, int x) {
//				return s.charAt(x);
//			}
//		};
		
		G g = String::new;
		System.out.println(g.m(new char[] {'a', 'b', 'c'}));
		H h = String::new;
		System.out.println(h.m(new byte[] {66, 67, 68}));
	}
	
	interface G {
		String m(char[] chars);		
	}
	interface H {
		String m(byte[] chars);		
	}
}
