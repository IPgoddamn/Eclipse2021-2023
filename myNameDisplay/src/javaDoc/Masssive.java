package javaDoc;


public class Masssive {

	public static void main(String[] args) {
		
		int arr[] = new int [5];//index 0 - 149
		
		for (int index = 0; index< arr.length;++index) {
		double random = Math.random();
		if (random<0.5) {
			arr[index] = -1;
		}else {
				arr[index] = 1;
		}
		//if (index<arr.length -1)
		//	System.out.print(",");
		System.out.print("{");
		
		System.out.print(arr[index]+ "," + " ");
		
		}
		System.out.print(arr[arr.length-1]);
		System.out.print("}");
	

}
}
