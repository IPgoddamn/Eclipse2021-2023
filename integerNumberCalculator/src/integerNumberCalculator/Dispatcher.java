package integerNumberCalculator;

public class Dispatcher {

	public static void main(String[] args) {
//		int a = 5;
		Model m1 = new Model(50, 8);
		Model m2 = new Model(90, 12);
		Model m3 = new Model(2, 5);
		int sum = Controller.multiply(2, 5);
		View.display(sum);
//		m1.x = 50;
//		m1.y = 8;
//		m2.x = 90;
//		m2.y = 12;
//		Controller c = new Controller();
		int summa = Controller.add(m1);
//		View v = new View();
		View.display(summa);
		double div = Controller.divide(m2);
		View.display(div);
	}
}
// 50 + 8   m1
// 90 / 12  m2
// int a = 5;
// int a;
// a = 5;
// Model m1; 
// m1 = new Model(); // reference 