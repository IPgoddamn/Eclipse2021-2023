package casting;

public class Dispatcher {

	public static void main(String[] args) {
		int a = 10;
		double b = 30000000000L;
		int c = a;		// int = int
		int d = (int)b;	// int = (int)double	explicity 	may be fatal error
		System.out.println(d);
		double e = a;	// double = (double)int 	implicity 
		///////////////////////
		Animal a1 = new Animal();
		Animal a2 = new Dog();		//Animal a2 = (Animal)new Dog();
		Animal a3 = new Cat();		//Animal a3 = (Animal)new Cat();
		Animal a4 = new Poodle();
//		Dog d1 = (Dog)a1;	// 		Runtime Error
		Dog d2 = (Dog)a2;	//??
//		Dog d3 = (Dog)a3;	//!!	Runtime Error
		Dog d4 = (Dog)a4;//
	}
}
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
class Poodle extends Dog{}