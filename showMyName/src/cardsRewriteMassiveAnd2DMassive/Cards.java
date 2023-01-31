package cardsRewriteMassiveAnd2DMassive;

public class Cards {

	public static void main(String[] args) {
		String [][] x = {{ "♠", "♥", "♣", "♦"} , {"9", "10", "В" , "Д", "К", "A"}};
//						    00   01   02   03     11    12    13    14   15   16 "♠", "♥", "♣", "♦"}
		String [] y = {"9♠", "10♠", "В♠" , "Д♠", "К♠", "A♠","9♥", "10♥", "В♥" , "Д♥", "К♥", "A♥",
				       "9♣", "10♣", "В♣" , "Д♣", "К♣", "A♣","9♦", "10♦", "В♦" , "Д♦", "К♦", "A♦"};
		for(int i = 0; i < x.length-1; i++) {
			for(int j = 0; j < x[i].length; j++) {	
				for(int c = 0; c < x[1].length; c++) {
					System.out.print(x[1][c]);
					System.out.print(x[i][j] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
/*		for(int q = 0 ; q < 7 ; q ++) {
			int a = (int) Math.round(Math.random()*6);                    // 11 00   1   0
			int b = (int)Math.round(Math.random()*3);
			for(int r = 0; r < 100; r ++);
			
			System.out.println("вы получили карту :" + x[0][b] + x[1][a]);
		
		}*/
		System.out.println("1 игрок получает такие карты :");
		int u = 23;
		int e = 23;
		for(int r = 0; r <6; r++) {
			int a = (int)Math.round(Math.random()*e); //23
			 System.out.print(y[a] + "  ");
			 String temp = y[u];
			 y[u] = y[a];
			 y[a] = temp;
				--e;
				--u;
			}
		System.out.println();
		System.out.println("2 игрок получает такие карты :");
		int u1 = u;
		int e1 = e;
		for(int r = 0; r <6; r++) {
			int a = (int)Math.round(Math.random()*e1); //23
			 System.out.print(y[a] + "  ");
			 String temp = y[u1];
			 y[u1] = y[a];
			 y[a] = temp;
				--e1;
				--u1;
			}
		System.out.println();
		System.out.println("3 игрок получает такие карты :");
		int u2 = u1;
		int e2 = e1;
		for(int r = 0; r <6; r++) {
			int a = (int)Math.round(Math.random()*e2); //23
			 System.out.print(y[a] + "  ");
			 String temp = y[u2];
			 y[u2] = y[a];
			 y[a] = temp;
				--e2;
				--u2;
			}
		System.out.println();
		System.out.println("4 игрок получает такие карты :");
		int u3 = u2 ;
		int e3 = e2 ;
		for(int r = 0; r <6; r++) {
			int a = (int)Math.round(Math.random()*e3); //23
			 System.out.print(y[a] + "  ");
			 String temp = y[u3];
			 y[u3] = y[a];
			 y[a] = temp;
				--e3;
				--u3;
			}
//			System.out.println(u + " " + e);
//			System.out.println(y[0] + " " + y[1]);  // check on repeat
	}
}
