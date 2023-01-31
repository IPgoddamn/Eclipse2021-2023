package integerNumberCalculator;

public class Test {

	public static void main(String[] args) {
		int num2 = 10;
		int num = 0;
		for (int i = 0; i < num2; i++) {
			if((num2 % 10) == 0)num++;
		}
		System.out.println(num);
	}
}
