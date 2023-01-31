package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {

	public static void main(String[] args) {
		Parent1 p1 = new Child1();
		p1.display();
		Parent1 p2 = new Parent1() {
			public void display() {
				System.out.println("Anonymous");
			}
		};
		p2.display();
		Parent1 p3 = () -> {
			System.out.println("Lambda");
		};
		p3.display();
//		List <Integer> ls6 = new ArrayList<Integer>();	// Java SE6
//		List <Integer> ls7 = new ArrayList<>();			// Java SE7	!!!!!
//		List <Integer> ls8 = new ArrayList();			// Java SE8
		List <Integer> li = new ArrayList<>(Arrays.asList(5, 3, 4, 3));	//!!!!!
		I12 summa = new Controller();
		System.out.println(summa.process(li));
		I12 max = new I12() {
			public int process(List<Integer> li) {
				int max = (int)Double.NEGATIVE_INFINITY;
				for(int temp : li) {
					if (max < temp) {
						max = temp;
					}
				}
				return max;
			}
		};
		System.out.println(max.process(li));
		I12 min = (list) -> {
			int min1 = (int)Double.POSITIVE_INFINITY;
			for(int temp : li) {
				if (min1 > temp) {
					min1 = temp;
				}
			}
			return min1;
		};
		
		System.out.println(min.process(li));
		
	}
}
@FunctionalInterface
interface I12{
	int process(List<Integer> li);
}
class Controller implements I12{	//sum
	public int process(List<Integer> li) {
		int sum = 0;
		for(int temp : li) {
			sum += temp;
		}
		return sum;
	}
}
@FunctionalInterface
interface Parent1{
	void display();
}
class Child1 implements Parent1{
	public void display(){
		System.out.println("Child");
	}
}
