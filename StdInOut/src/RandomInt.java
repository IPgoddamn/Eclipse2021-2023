
public class RandomInt {

	public static void main(String[] args) {
	/*	int n=Integer.parseInt(args[0]);
		double r = Math.random();
		int value = (int)(r*n);
		System.out.println(value);
		*/
		int count = 0;
		double sum = 0;
		while( !StdIn.isEmpty()) {
			double value = StdIn.readDouble();
			sum = sum + value;
			count++;
					
		}
		
		double average = sum/count;
		
		StdOut.println("is avarage" + average);
		}

}
