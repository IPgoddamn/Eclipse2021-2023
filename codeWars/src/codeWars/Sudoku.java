package codeWars;
import static codeWars.SudokuSolutionValidator.display;

import java.util.*;
public class Sudoku {
	public static void main(String[] args) {
		int[][] matrix = {
                {5, 3, 4,  6, 7, 8,  9, 1, 2},
                {6, 7, 2,  1, 9, 5,  3, 4, 8},
                {1, 9, 8,  3, 4, 2,  5, 6, 7},
                {8, 5, 9,  7, 6, 1,  4, 2, 3},
                {4, 2, 6,  8, 5, 3,  7, 9, 1},
                {7, 1, 3,  9, 2, 4,  8, 5, 6},
                {9, 6, 1,  5, 3, 7,  2, 8, 4},
                {2, 8, 7,  4, 1, 9,  6, 3, 5},
                {3, 4, 5,  2, 8, 6,  1, 7, 9}};
		SudokuSolutionValidator s = new SudokuSolutionValidator();
		display(matrix);
		System.out.println(s.checkRectangles(matrix));
	}
}
class SudokuSolutionValidator{
	int[] container = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int count = 0;
	static void display(int[][] ma) {
		int count = 0;
		for (int i = 0; i < ma.length; i++) {
			for (int j = 0; j < ma.length; j++) {
				System.out.print(ma[i][j] + " ");
				count++;
				if(count % 3 == 0) {
					System.out.print(" ");
				}
			}
		if((i+1) % 3 == 0) {
			System.out.println();
		}
			System.out.println("");
		}
	}
	boolean checkLines(int[][] ma){
		for (int[] temp : ma) {					// check rows
			int[] i = new int[temp.length];
			for (int element : temp) {
				i[count] = element;
				count++;
			}
			count = 0;
			Arrays.sort(i);
			if(Arrays.equals(i, container)) {
				continue;
			}
			return false;
		}
		for (int c = 0; c < ma.length; c++){	// check columns
			int[] i = new int[ma.length];
			for (int g = 0; g < ma.length; g++) {
				i[count] = ma[g][c];
				count++;
			}
			count = 0;
			Arrays.sort(i);
			if(Arrays.equals(i, container)) {
				continue;
			}
			return false;
		}
		return true;
	}
	boolean checkRectangles(int[][] ma){
		for (int row = 0; row < ma.length - 1; row+=3) {
		for (int col = 0; col < ma.length-1; col+=3) {
			int[] i = new int[ma.length];
			for (int g = col; g < col + 3; g++) {
				for (int c = row; c < row + 3; c++) {
					i[count] = ma[g][c];
					count++;
				}
			}
			for(int temp : i) {
				System.out.print(temp);
			}
			System.out.println();
			count = 0;
			Arrays.sort(i);
			if(Arrays.equals(i, container)) {
				continue;
			}
			return false;
		}
		}
	return true;
	}
}

//boolean checkOnNull(int[][] ma){
//for(int[] temp1 : ma) {
//	for(int temp2 : temp1) {
//		if (temp2 == 0) return false;
//	}
//}
//return true;
//}






