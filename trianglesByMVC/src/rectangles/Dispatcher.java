package rectangles;

public class Dispatcher {

	public static void main(String[] args) {
		Model m1 = new Model (1, 1, 3, 3, 1, 3, 5, 5);
		
		View.display(Controller.ifElse(m1));

	}
}
class Model {
	int ax1,ax2,bx1,bx2,ay1,ay2,by1,by2;
	Model (int xa1, int ya1, int xb1, int yb1, int xa2, int ya2, int xb2, int yb2){
		ax1 = xa1;
		ax2 = xa2;
		ay1 = ya1;
		ay2 = ya2;
		bx1 = xb1;
		bx2 = xb2;
		by1 = xb1;
		by2 = xb2;
	}
	
}
class Controller{
	static String ifElse (Model m){
	if (m.bx1 > m.ax2 ) return "point";				//(ax1, ay1, bx1, by1, ax2, ay2, bx2, by2);
	if (m.ax2 > m.ax1 && m.ax2 < m.bx1 && m.by1 == m.ax2) return "vertically line";
	return "No cross";
	}
}
class View{
	static void display (String s) {
		System.out.println("Rectangle intersect : \n" + s);
	}
	
}

