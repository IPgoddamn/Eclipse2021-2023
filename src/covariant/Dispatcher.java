package covariant;

public class Dispatcher {

	public static void main(String[] args) {
		DogFactory df = new DogFactory();
		Dog myDog = df.create();
		PoodelFactory pf = new PoodelFactory();
		Dog myPoodel = pf.create();		//	Dog myPoodel = new Poodel();
										// polymorphism 3 type, return(повертання), 5%
		Poodle oterPoodle = (Poodle)pf.create();	// too dangerous!!!
	}
}
class Dog{}
class Poodle extends Dog{}
class SpanishPoodle extends Poodle{}
class DogFactory{
	Dog create() {
		return new Dog();		// pattern Factory
	}
}
class PoodelFactory extends DogFactory{
Dog create() {
	return new Poodle();		// pattern Factory
	}
}
class SpanishPoodleFactory extends DogFactory{
	SpanishPoodle create() {
		return new SpanishPoodle();		
	}
}