
public class App {

	public static void main(String[] args) {
		Puppy dog1;
		dog1= new Puppy();
		dog1.body = 1;
		dog1.paw = 4;
		dog1.tail = true;
		dog1.fur = true;
		
		dog1.weight = 15;
		dog1.height = 63;
		dog1.breed = "Haski";
		
		dog1.jump();
		dog1.bark(4);
		dog1.getBreed();
	}
}
