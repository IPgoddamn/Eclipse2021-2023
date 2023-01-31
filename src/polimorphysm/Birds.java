package polimorphysm;

public class Birds {

	public static void main(String[] args) {
		Hawk h = new Hawk();
		Straus s = new Straus();
		Penguin p = new Penguin();
		Bird[] b = new Bird[4];
		b[0] = h;	//poymorphism
		b[1] = s;
		b[2] = p;
		b[3] = new Crocozyablic();
		for(Bird temp : b) {	// polymorph temp(Bird) = b(h,s,p)
			temp.move();
		}
		Animal a2 = new Dog();	// polymorphism 1 type, assigment (присвоення) 15%
	}
}
class Bird{
	void move(){}
}
class Hawk extends Bird{
	void move(){
		System.out.println("fly");
		}
}
class Straus extends Bird{
	void move(){
		System.out.println("run");
		}
}

class Penguin extends Bird{
	void move(){
		System.out.println("swim");
	}
}
class Crocozyablic extends Bird{
	void move(){
		System.out.println("jump");
	}
}