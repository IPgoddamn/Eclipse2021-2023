package handler;

public class Dispatcher {

	public static void main(String[] args) {
		System.out.println(Controller.function(2, 3));
		Controller c = new Controller ();
		int d = c.diss(10, 5);
		System.out.println(d);
	}

}
