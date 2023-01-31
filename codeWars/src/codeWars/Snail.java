package codeWars;

public class Snail {

	public static void main(String[] args) {
		int[][] x = { 
					{ 1, 2, 3, 10 },
					{ 4, 5, 6, 11 },
					{ 7, 8, 9, 12 },
					{ 13, 14, 15, 16}
					};
		int [][] y = {{}};
		SnailTo.snail(y);
	}
}
class SnailTo {
	public static int[] snail(int[][] array) {
		int count = 0;
		int length = array.length;
		int[] result = new int[length * length * 2];
		int[] c = new int[0];
		System.out.println(array.length);
		if(array[0].length == 0)return c;
		for(int j = length; j > 0; j--) {
			for (int i = length - j; i < j; i++) {
				result[count] = array[length - j][i];
				count++;
				System.out.println("1 loop");
			}
			for (int i = length - j + 1; i < j; i++) {
				result[count] = array[i][j - 1];
				count++;
				System.out.println("2 loop");
			}
			
			for (int i = j - 2; i > length - j - 1; i--) {
				result[count] = array[j - 1][i];
				count++;
				System.out.println("3 loop");
			}
			for (int i = j - 2; i > length - j; i--) {
				result[count] = array[i][length - j];
				count++;
				System.out.println("4 loop");
			}
			System.out.println("next entrance");
		}
		for (int i : result) {
			System.out.print(i + " ");
		}
		return result;
	}
}