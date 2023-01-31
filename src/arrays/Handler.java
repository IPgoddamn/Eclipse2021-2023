package arrays;

import java.util.Arrays;

public class Handler {

	public static void main(String[] args) {
//		String[] names = {"Serg","Mary","Ann","Mark","Andrew"};
		int [] dates = {21, 16, 9, 31, 20, 8 , 11, 14};
//		double[] marks = {9.4, 10.2, 9.8, 10.9, 11.3};
		// index           0     1    2     3     4
/*		for(int index = 0 ; index < dates.length; index = index + 2 ) {
			System.out.print(dates[index]+ " ");
		}
		System.out.println();
		for(int index = dates.length -1 ; index > -1; index-- ) {
			System.out.print(dates[index]+ " ");
		}*/
		// average and summa of dates
		// sum = 0 
		// 0 + 21 = 21
		int sum = 0;
		for(int index = 0 ; index < dates.length; index ++ ) {
			sum = sum + dates[index]; // 0 + 21 = sum; sum = 21;
									  // 21 + 16 = sum; sum = 37;
			
		}
		System.out.println(sum);
		double average = (double)sum / dates.length;
		System.out.println(average);
		// max of dates 
		//int max = dates[0];
		int max = (int)Double.NEGATIVE_INFINITY; // max Negative number
		for(int index = 0 ; index < dates.length; index ++ ) { 
			if ( max < dates[index] & dates[index] % 2 == 0) {// index = 3: 21<31 true
				max = dates[index];   // max = 31 
			}
		}
		System.out.println(max);
		
		int [] array1 = {7, 12, 8, 4};
		int[] array2 = {9, 3, 11, 8};
		int [] result = new int[array1.length];
		for (int i = 0 ; i<array1.length; i++) {
			result[i] = array1[i] + array2[i];
			
		}
		for (int i = 0 ; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(result));
		// конеретинація 2х массивів
		int[] array3 = {7, 12, 8, 4};
		int[] array4 = {9, 3, 11, 8, 5};
		int[] result2 = new int [array3.length + array4.length];
		for (int i = 0 ; i<array3.length; i++) {
			result2[i] = array3[i]; // 7, 12, 8, 4, 0, 0, 0, 0, 0, 0
			
		}
		for (int i = 0 ; i<array4.length; i++) {
			result2[i + array3.length] = array4[i];
		}
		System.out.println(Arrays.toString(result2));
		//поділ массиву цілих чисел на массив додатніх і від'ємних чисел
		int[] array5 = {9, -2, -5, 6, -4, 3, 8, 1}; // 9, 6, 3, 8,    -3, -5, -4;
		int countNegativeNumbers = 0 ;
		for(int i = 0; i < array5.length; i++) {
			if(array5[i] < 0) {
				countNegativeNumbers++;
			}
		}
		System.out.println(countNegativeNumbers);
		int[] negativeNumbers = new int[countNegativeNumbers]; // massive = 3
		int[] positiveNumbers = new int[array5.length - countNegativeNumbers]; //massive = 5 
		int positiveNumbersIndex = 0;
		int negativeNumbersIndex = 0;
		for(int i = 0; i < array5.length; i++) {
			if (array5[i]<0) {
				negativeNumbers[negativeNumbersIndex] = array5[i];
				negativeNumbersIndex++;
			}else {
				 positiveNumbers[positiveNumbersIndex] = array5[i];
				 positiveNumbersIndex++;
				
			}
		}
	}

}
