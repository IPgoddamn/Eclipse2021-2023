package files;

public class Dispatcher5 {

	public static void main(String[] args) {
		System.out.println("Start main");
		try {
			throw new MyException(5);
		} catch (Exception e) {}
	}

}
class MyException extends Exception{
	MyException(int x){
		System.out.println(x);
		this.process();
	}
	void process() {
		System.out.println("Action without goto");
	}
}