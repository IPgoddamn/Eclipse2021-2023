package arraysBinarySearch;

import java.util.Arrays;

public class Handler {

	public static void main(String[] args) {
		int x[] = {12, 7, 19, 5, 6, 3, 11, 18, 9, 15};
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.binarySearch(x, 15));
	}

}
//     int x [] { 1... 100}
// Arrays.binarySearch(x, 62)
// x > 50 yes ->  50 ... 100
// x > 75 no -> 50 ... 75 ect.