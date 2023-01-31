package extended; // ++, +=, =?:; XOR; &&, switch, continue, break

public class Handler {

	public static void main(String[] args) {
		byte x1 = 10;
//	    x = (byte)(x + 5);
		x1 *= 5; // операція с присвоеннням не змінює розрядності оперантів , чисел після виконня арифметичних чи логічних операцій
//		System.out.println(x);
		//// increment ////
		byte y = 10;
//		y = y + 1;
		y++; //операція с інкрементов/дикрементом не змінює розрядності оперантів , чисел після виконня арифметичних чи логічних операцій
		++y;// prefix : ++y, postfix : y++
//		System.out.println(y);
		int a = 10;
		int b = a++;// postfix спочатку присвоєння потім збільшення
		int c = 10;
		int d = ++c;// prefix спочатку збільшення потім присвоєння
//		System.out.println("a = " + a);
//		System.out.println("b = " + b);
//		System.out.println("c = " + c);
//		System.out.println("d = " + d);
		int z = 10;
//		z = ++z; //11
//		++z;     //11
//		z++;     //11
		z = z++; //10 запам'ятати!!! UNIQUE FUTURE
//		System.out.println(z);
		//// if-else -> ternary operator ////
		int x = 0; // if negative -> -1 else -> +1
//		if(x<0) {
//			x--;
//		}else {
//			x++;
//		}
		x = x < 0         ? --x  :   ++x;
	//  1 =   2 (boolean) ?    3 :    4 ;
//		1 = 3,  2 = true 
//		1 = 4,  2 = false
//		System.out.println(x);
		//// XOR ////
// x1  x2   AND    OR   XOR(eXclusive OR)	 "^" (корат)	
// f   f    f      f     f
// f   t   	f      t     t
// t   f    f      t	 t	
// t   t    t      t	 f
		boolean b1 = true;
//		System.out.println(b1 ^ false);
// short-cirquit (замикальне, ланцюжок) && ||    & |
/*		boolean haveMoney = true;
		boolean haveFriends = true;
		if(haveMoney && haveFriends) {   // перебирає всі змінні звичайна AND &
			System.out.println("go to cinema");
		}else {
			System.out.println("go to homeGames");
		}
		*/
		boolean haveCash = true;
		boolean haveCard = false;
		if(haveCash || haveCard) {   // перебирає всі змінні звичайна OR | 
			System.out.println("go to cinema");
		}else {
			System.out.println("go to homeGames");
		}
		int x11 = 10, x2 = 11, x3 = 30, x4 = 29;
		if(x11++ > --x2 && x3-- > ++x4 ) { // 10 > 10 false
			x11 += 20;
		}else {
			x2 += 50;
		}
		System.out.println("x11 = " + x11); // 11  11
		System.out.println("x2 = " + x2);   // 60  60
		System.out.println("x3 = " + x3);   // 29  30
		System.out.println("x4 = " + x4);   // 30  29
		
		
	}
}
