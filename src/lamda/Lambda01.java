package lamda;
import java.util.*;
import java.util.stream.*;
public class Lambda01 {

	public static void main(String[] args) {
//		Collection c = new ArrayList();
//		Stream s = c.parallelStream();
		I1 c = new Child();
		I1.m3();
		c.m2();
//		I2.m3();
	}
}
interface I1{
	void m1();
	default void m2() {System.out.println("m2");}
	static void m3() {System.out.println("m3");}
}
interface I2 extends I1{
	
}
interface I3{
	default void m2() {System.out.println("m2 I3");}
}
class Parent{
	public void m2() {System.out.println("m2 Parent");} 
}
class Child extends Parent implements I1, I3{
	public void m1() {System.out.println("m1 Child");}
//	public void m2() {System.out.println("m2 Child");} 
}