package interfaces;

public interface I1 {
void display();				// abstract public
}
interface I2 {
	void m();
}
class Test implements I1,I2{
	public void display() {};
	public void m() {};
}
interface I3 extends I1, I2{
	void m3();
}
class Test2 implements I3{
	@Override					// annotation 		metadata  
	public void display() {};
	public void m() {};
	public void m3() {};
}
class Parent{
	void display() {}
}
class Child extends Parent{
//	@Override
	void display(int x) {}			// override			overload!!!!
}