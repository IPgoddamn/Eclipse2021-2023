package ifElse;

public class IfElse {
	public static void main(String[] args) {
		int x1 = 20;
		int x2 = 30;
		boolean result = x1 >= x2; 
		System.out.println(result); //true or false  
		System.out.println(x1 != x2);
		System.out.println(result = true);
		int myMoney = 60;
		int ticketPrice = 60;
		boolean haveFreeFriends = false;
		if(myMoney>= ticketPrice){
			if(haveFreeFriends) {
				System.out.println("Go to Cinema");
	//		}else {
	//			System.out.println("Go to HomeGames");	
			}
		}else {
			System.out.println("Go to HomeGames");
		//}
//		boolean test = true;
//		System.out.println(!test);	
//		boolean haveEnuoghMoney = myMoney>= ticketPrice;
//		if (haveFreeFriends & haveEnuoghMoney) {
//			System.out.println("Go to Cinema");
//			
//		}else {
//			System.out.println("Go to HomeGames");
//	boolean haveCash = false;
//	boolean haveCard = false;
//	if(haveCash | haveCard) {
//	}else {
//		System.out.println("Go to HomeGames");
	//	int r1ax =2; int r1ay =1; int r1bx = 6; double r1by = 2.5;
	//	int r2ax =7; double r2ay =1.5; double r2bx = 7.5; int r2by = 3;	
		 
	
// x1      x2   AND &   or |
// false false false   false
// false true  false   true
// true  true  true    true
		
	}
}
}


