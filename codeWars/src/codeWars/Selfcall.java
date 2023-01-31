package codeWars;
public class Selfcall {
	int state = 0;		// t2 = this.state			t1 = t.state
	Selfcall (int s){ 		//		2/2						 1/5
		state = s;		//								 
		}				//
	int go (Selfcall t) {				//	t2 = this.state			t1 = t.state					t2 = this.state			t1 = t.state
		if (this.state == 2) {		//		  2						 1			ret???	// 1		  2						 5
			t.state = 5;			//		  2                      5          ret???  // 2		  5                      5
			go(this);				//		  5						 5
		}							//
		return ++this.state;		//
	}
	public static void main(String[] args) {
		Selfcall t1 = new Selfcall(1);
		Selfcall t2 = new Selfcall(2);
		System.out.println(t1.go(t2) + " " + t2.go(t1));
	}
}