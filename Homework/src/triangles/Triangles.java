package triangles;

public class Triangles {

	public static void main(String[] args) {
		// 1 треугольник
		String [] point = {".",".",".",".",".",".",".","."};
		for (int n = 7 ; n>=0 ; n--) {
		for (int i = 0 ; i<point.length ; i++) {
			
			System.out.print(point[i] + " ");
			
		}
		
		point[n]= "";
		System.out.println();
		}
		// 2 трегольник 
		char [] point1 = {' ', ' ', ' ', ' ', ' ', ' ', ' ', '.'};
		for(int n = 6 ; n < point1.length ; n--) {
			for (int i = 0 ; i < point1.length; i ++) {
				System.out.print(point1[i] + " ");
				
			}
			if (n < 0) 
					break;
			point1[n]='.';
			System.out.println();
		}
		// 3 треугольник 
		System.out.println();
		System.out.println("\t");
		String s = "";
		for (int i = 0 ; i<8 ; i++ ) {
			s = s + ". ";
			System.out.println(s);
		}
		// 4 треугольник 
		System.out.println("\t");
		String ss = "";
		for (int row = 0 ; row < 8 ; row++) 
			{
			System.out.println("");
			System.out.print(ss);
			ss = ss + "  ";
			for (int col = row; col < 8 ; col++) {
				System.out.print(". ");	
			}
			
		}
		// 5 треугольник (Ялинка)
		System.out.println("\t");
		
		for (int row = 8 ; row > 0 ; row--) { //1
			System.out.println("");
			for (int a = row ; a > 0 ; a--) {
				System.out.print(" ");
			}
			for (int col = row; col< 9 ; col++) {
				System.out.print(". ");	
				}
			}
		for (int row = 8 ; row > 0 ; row--) //2
		{
		System.out.println("");
		for (int a = row ; a > 0 ; a--) {
			System.out.print(" ");
		}
		for (int col = row; col< 9 ; col++) {
			System.out.print("L ");	
			}
		}
		for (int row = 8 ; row > 0 ; row--) //3
		{
		System.out.println("");
		System.out.print("   "); // сдвинуть вправо , так же если трегольники будет разного размера 
		System.out.println(""); // растянуть треугольник 
		for (int a = row ; a > 0 ; a--) {
			System.out.print(" ");
		}
		for (int col = row; col< 9 ; col++) {
			System.out.print("3 ");	
			}
		}
	}

}
