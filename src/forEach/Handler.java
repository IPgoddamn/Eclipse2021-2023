package forEach;

public class Handler {

	public static void main(String[] args) {
		int [] x = {4, 8, 2, 5};  // 5 9 3 6
//		for(int i = 0; i < x.length; i++) {
//			x[i]++;
//			System.out.println(x[i]);
//		}
		for(int temp : x) {	   //foreach
			temp++;			   // не можна робити 2 дії в цьому циклі
		}
		for(int temp : x) {
			System.out.println(temp); // значення не змінилися
			
//			if(temp == 8) {
//				break;
//			}
		}
		
	}

}
