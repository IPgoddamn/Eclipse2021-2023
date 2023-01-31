package lamda;

import java.util.Arrays;

public class LambdaEpam07 {
	// lamda with java Constructors
	public static void main(String[] args) {
	G g = int[]::new;
	System.out.println(Arrays.toString(g.m(5)));
	}
	interface G {
	 int[] m (int x);		
	}

}
