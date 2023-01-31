package codeWars;
public class MultiplicationOfNumbers {

	public static void main(String[] args) {
/*		long num = 999;
		int count = 0;
		while (true) {
		String s = String.valueOf(num);
		String[] arr1 = s.split("");
		long [] arr2 = new long[arr1.length];
		if(arr2.length == 1)break;
		long sum = 0;
		int i = 0;
		for(String ex : arr1) {
			sum = Long.parseLong(ex);
			arr2[i++] = sum;
		}
		for (long temp : arr2) {
			System.out.println(temp);
		}
		long summa = 1;
		for(int lg = 0; lg < arr2.length; lg++) {
			summa *= arr2[lg];
		}
		num = summa;
		count++;
		System.out.println(summa);
		}
		System.out.println(count);
		*/
		System.out.println(Persist.persistence(99)); // 81 , 8 * 1 = 8
		System.out.println(39%10);	// 9
		System.out.println(9%10);	// 81
		System.out.println(9/10);	// 0
	}

}
/*class Persist {
	  public static int persistence(long n) {
	    long m = 1, r = n;
	    int count = 0;
	    if (r / 10 == 0)
	      return 0;

	    for (r = n; r != 0; r /= 10) {
	      m *= r % 10;
	      count++;
	    }
	    return count + 1;
	    
	  }
}
*/
 class Persist {
  public static int persistence(long n) {
    long m = 1, r = n;

    if (r / 10 == 0)
      return 0;

    for (r = n; r != 0; r /= 10)
      m *= r % 10;

    return persistence(m) + 1;
  }
 }
