package integerNumberCalculator;

public class Controller {
	static int add(Model m) {
		return m.x + m.y;
	}
	static int substruct(int a,int b) {
		return a - b;
	}
	static int multiply(int a,int b) {
		return a * b;
	}
	static double divide (Model m) {
		return (double)m.x / m.y;
	}
}
//          int add(int a,int b) {return a + b;}
// return type  name(parameters) {body}
//       1       2       3          4
// int x = 50;
//  1  2 3 4 5 