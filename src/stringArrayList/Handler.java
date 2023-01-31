package stringArrayList;

import java.util.Arrays;      // !!!!!!!!!!!!!!!!!

public class Handler {

	public static void main(String[] args) {
		String string = "Java Forever! Java Rules!";
////     	 length()     ////
//		int stringLength = string.length();
//		System.out.println(stringLength);
//		System.out.println(string.length());
////     	endsWith(String suffix), startsWith(String suffix)      ////
//		boolean ends = string.endsWith("ever!");
//		System.out.println(ends);
//		System.out.println(string.startsWith("Jav"));
////		charAt(int index)		////		
//		char letter = string.charAt(2);
//		System.out.println(letter);
////		indexOf			////
		
//		System.out.println(string.indexOf("For"));
////		replace			////
//		String newString = string.replace("Java", "Python");
//		System.out.println(newString);
////		substring		////
//		String sub = string.substring(6, 7);  // 1 індекс илкюзив = включено , 2 індекс єксклюзів Виключено
//		System.out.println(sub);
////		toLowerCase(), toUpperCase()		/////
//		System.out.println(string.toUpperCase());
////		String[] array = string.split(" ");		////
		String[] array = string.split(" ");	
		for(String temp : array) {
			System.out.print(temp);
		}
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
/*		int[] x = {7, 9, 4, 2, 6, 1};
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.binarySearch(x, 5)); // insertion point
		*/
	}

}
//1, 2, 4, 6, 7, 9		elements
//0  1  2  3  4  5  	indexes
//1, 2 ,3, 4, 5, ...   insertion point = 3 - 3 - 1 = -4
//         3