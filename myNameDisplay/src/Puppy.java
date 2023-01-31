
public class Puppy {
	// fields of class
	int body;
	int paw;
	boolean tail;
	boolean fur;
	
	double weight;
	int height;
	String breed;
	// methods
	void run() {
		System.out.println("run");
	}
	
	void jump() {
		System.out.println("jump");
	}
	
	void bark (int n) {
		for(int i = 0; i<n ; i++) 
	System.out.print("gav ");
		
		System.out.println();
	}
	
	
	String getBreed() {
		return breed;
	}
}
