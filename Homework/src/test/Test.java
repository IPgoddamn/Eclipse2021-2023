package test;
import java.util.ArrayList;
import java.util.Arrays;
public class Test {

	public static void main(String[] args) {
	/////// exercise 2.1 //////// 
		/*    int[] array = {4,6,-17,12,3,9,-8,-19,20,0};
		        ArrayList pos = new ArrayList();
		        ArrayList neg = new ArrayList();
		        for (int element : array) {
		            if (element < 0) {
		                neg.add(element);
		            } else {
		                pos.add(element);
		            }
		        }
		        System.out.println(neg);
		        System.out.println(pos);*/
		    
		      /////// exercise 2.2 //////// смущает немного
		     int[] arr1 = {5,7,9,10,13,2};
		       int[] arr2 = {10,12,4,3,7,9,20,14};
		       double average1 = 0;
		       double average2 = 0;


		       for (int element : arr1) {
		           average1 += element;
		      }
		      for (int element : arr2) {
		           average2 += element;
		      }

		          average1 /= arr1.length;
		          average2 /= arr2.length;

		          int[] tempArray = new int[arr1.length + arr2.length];
		          int count = 0;

		          for (int i = 0; i < arr1.length; i++) {
		              tempArray[i] = arr1[i];
		              count++;
		          }

		          for (int element : arr2) {
		              tempArray[count++] = element;
		          }

		          System.out.println(Arrays.toString(tempArray));

		          double maxAvg = Math.max(average1, average2);
		          double minAvg = Math.min(average1, average2);
		          System.out.println(minAvg + " " + maxAvg);

		          ArrayList result = new ArrayList();

		          for (int element : tempArray) {
		              if (element < maxAvg && element > minAvg) {
		                  result.add(element);
		              }
		          }

		          System.out.println(result);
	}

}
