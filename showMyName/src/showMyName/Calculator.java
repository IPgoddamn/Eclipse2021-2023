package showMyName;
import java.util.Scanner; 
public class Calculator {

	public static void main(String[] args) {
		
		 Scanner scn1 = new Scanner(System.in); 
		 int x1 = scn1.nextInt(); 
		 Scanner scn2 = new Scanner(System.in); 
		 int x2 = scn2.nextInt(); 
		int sum = x1 + x2;
		int sub = x1 - x2;
		int prod = x1 * x2;
		int quot = x1 / x2;
		int rem = x1 % x2;
		System.out.println(x1 + " + " + x2 + " = " + sum);
		System.out.println(x1 + " - " + x2 + " = " + sub);
		System.out.println(x1 + " * " + x2 + " = " + prod);
		System.out.println(x1 + " / " + x2 + " = " + quot);
		System.out.println(x1 + " % " + x2 + " = " + rem);
		//обрати: Run->Run Configurations->вкладка Arguments: ввести аргументи .



	}

}
