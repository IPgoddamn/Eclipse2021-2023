package trianglesByMVC;

public class Dispather {

	public static void main(String[] args) {
		View.displayDot(6, '.', "",0);
		View.displaySpace(6, ' ', "|",0);
		View.displayRectangle(6, 3, '.', null, 0);
		View.displayTriangle_FromLittleToMore_H_Left(6, 3, '.', "",0);
//		System.out.println();
//		View.displayTriangle_FromMoreToLittle_H_Left(6, '.', "",0);
//		System.out.println();
//		View.displayTriangle_FromMoreToLittle_H_Right(6, '.', "",0);
//		System.out.println();
//		View.displayTriangle_FromLittleToMore_H_Right(6, '.', "",0);
//		System.out.println();
//		View.displayTriangle_LeftToLeft(6, '.', "",0);
//		View.displayTriangle_LeftToRight(6, '.', "",0);
//		View.displayTriangles_RightToRight(6, '.', "",0);
//		View.displayTriangles_RightToLeft(6, '.', "",0);
//		View.displayTrianglesPlusRectangle_LeftToLeft(5,6, '.', "",0);
//		View.displayTrianglesPlusRectangle_LeftToRight(5,6, '.', "",0);
//		View.displayTrianglesPlusRectangle_RightToLeft(5,6, '.', "",0);
//		View.displayTrianglesPlusRectangle_RightToRight(5,6, '.', "",0);
//		View.displayTriangle_H_Middle(6, '.', null, 5);
//		View.displayTrapezoid_RectangleMiddle_TriangleLeftAndRight(10,10, '.', null, 0);
//		System.out.println();
//		View.displayTree(3, 12, '.', null, 0);
//		View.displayRocket(5,10, '.', "", 0);
	}
}
class Controller {
	static String printLine(Row m) {
		String str = m.gapsFromLeft;
		int i = 0;
		if (m.delimiter == "" || m.delimiter == null) {
			for (; i < m.row; i++) {
				str += m.symbol;
			}
		}else{
			for (; i < m.row; 
					i++) {
				str += m.symbol + m.delimiter;
			}
		}
			str += "\n";
		return str;
	}
	static String printFigure(Rectangle m) {
		String str = m.gapsFromLeft;
		for(int j = 0; j < m.col; j++) {
			int i = 0;
			if (m.delimiter == "" || m.delimiter == null) {
				for (; i < m.row; i++) {
					str += m.symbol;
				}
			}else{
				for (; i < m.row;
						i++) {
					str += m.symbol + m.delimiter;
				}
			}
				str += "\n";
		}
		return str;
	}
}
class Row{
	int row;
	char symbol;
	String delimiter;
	String gapsFromLeft = "";
	Row(int row, char symbol, String delimiter, int gapsFromLeft) {
		this.row = row;
		this.symbol = symbol;
		this.delimiter = delimiter;
		for(int i = 0 ; i < gapsFromLeft; i++)this.gapsFromLeft += " ";
	}
}
class Rectangle extends Row{
	int col;
	Rectangle(int row, int col, char symbol, String delimiter, int gapsFromLeft) {
		super(row, symbol, delimiter, gapsFromLeft);
		this.col = col;
	}
}
class Triangle extends Rectangle{
	Triangle(int row, int col, char symbol, String delimiter, int gapsFromLeft) {
		super(row, col, symbol, delimiter, gapsFromLeft);
	}
}
class Model {
	int numberOf;
	char symbol;
	String delimiter = "";
	String gapsFromLeft = "";
	Model (int numberOf, char symbol, String delimiter, int gaps){
		this.numberOf = numberOf;
		this.symbol = symbol;
		this.delimiter = delimiter;
		for(int i = 0 ; i < gaps; i++)gapsFromLeft += " ";
	}
	void modelBig (int row, char sum, String del, int gaps){
		symbol = sum;
		delimiter = del;
		for(int i = 0 ; i < gaps; i++)gapsFromLeft += " ";
		
	}
	}

class View {
	////		lvl 0       ////
	static void displayDot(int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		Row stringDots = new Row(numberOfStrings, symbol, delimiter, gapsFromRight);
		System.out.print(Controller.printLine(stringDots));
	}
	static void displaySpace(int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		Row stringGaps = new Row(numberOfStrings, symbol, delimiter, gapsFromRight);
		System.out.print(Controller.printLine(stringGaps));
	}
		////		lvl 1       ////
	static void displayRectangle(int row, int col,char symbol,String delimiter, int gapsFromRight) {
		Rectangle rectangle = new Rectangle(row, col, symbol, delimiter, gapsFromRight);
			System.out.print(Controller.printFigure(rectangle));
	}
	static void displayTriangle_FromLittleToMore_H_Left(int row, int col,
		char symbol,String delimiter, int gapsFromRight) {
		Triangle triangle = new Triangle(row, col, symbol, delimiter, gapsFromRight);
		System.out.print(Controller.printFigure(triangle));
	}
	static void displayTriangle_FromMoreToLittle_H_Left(int numberOfStrings,char symbol,
			String delimiter, int gapsFromRight) {
		for ( int i = numberOfStrings ; i > 0; i--) {
			Model triangle = new Model(i, symbol, delimiter, gapsFromRight);
			System.out.print(Controller.printFigure(triangle));
			}
		}
	
	static void displayTriangle_FromMoreToLittle_H_Right(int numberOfStrings,char symbol,
			String delimiter, int gapsFromRight) {
		for (int i = numberOfStrings; i > 0; i--) {
			Model triangle = new Model(i, symbol, delimiter, gapsFromRight);
			System.out.print(Controller.printFigure(triangle));
			gapsFromRight++;
		}
	}
	
	static void displayTriangle_FromLittleToMore_H_Right(int numberOfStrings,char symbol,
			String delimiter, int gapsFromRight)  {
		int gaps = numberOfStrings + gapsFromRight;
		for (int i = 0; i < numberOfStrings + 1; i++) {
			Model triangle = new Model(i,  symbol, delimiter, gaps);
			System.out.print(Controller.printFigure(triangle));
			gaps--;
		}
	}			
	////		lvl 2       ////		
	static void displayTriangle_LeftToLeft(int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		displayTriangle_FromLittleToMore_H_Left(numberOfStrings, symbol, delimiter, gapsFromRight);
		displayDot(numberOfStrings + 1, symbol, delimiter, gapsFromRight);
		displayTriangle_FromMoreToLittle_H_Left(numberOfStrings, symbol, delimiter, gapsFromRight);
	}
	static void displayTriangle_LeftToRight(int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		displayTriangle_FromLittleToMore_H_Left(numberOfStrings, symbol, delimiter, gapsFromRight);
		displayDot(numberOfStrings + 1, symbol, delimiter, gapsFromRight);
		displayTriangle_FromMoreToLittle_H_Right(numberOfStrings, symbol, delimiter, gapsFromRight + 1);
	}
	static void displayTriangles_RightToRight(int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		displayTriangle_FromLittleToMore_H_Right(numberOfStrings, symbol, delimiter, gapsFromRight + 1);
		displayDot(numberOfStrings + 1, symbol, delimiter, gapsFromRight);
		displayTriangle_FromMoreToLittle_H_Right(numberOfStrings, symbol, delimiter, gapsFromRight + 1);
	}	
	static void displayTriangles_RightToLeft(int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		displayTriangle_FromLittleToMore_H_Right(numberOfStrings, symbol, delimiter, gapsFromRight +1);
		displayDot(numberOfStrings + 1, symbol, delimiter,gapsFromRight);
		displayTriangle_FromMoreToLittle_H_Left(numberOfStrings, symbol, delimiter,gapsFromRight);
//////////////////////////////////////////////////////////////////////////////////////////////////
	}	
	static void displayTrianglesPlusRectangle_LeftToLeft(int col, int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		displayTriangle_FromLittleToMore_H_Left(numberOfStrings, symbol, delimiter, gapsFromRight);
		displayRectangle(col, numberOfStrings + 1, symbol, delimiter,gapsFromRight);
		displayTriangle_FromMoreToLittle_H_Left(numberOfStrings, symbol, delimiter, gapsFromRight);
	}
	static void displayTrianglesPlusRectangle_LeftToRight(int col, int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		displayTriangle_FromLittleToMore_H_Left(numberOfStrings, symbol, delimiter, gapsFromRight);
		displayRectangle(col, numberOfStrings + 1, symbol, delimiter,gapsFromRight);
		displayTriangle_FromMoreToLittle_H_Right(numberOfStrings, symbol, delimiter, gapsFromRight + 1);
	}
	static void displayTrianglesPlusRectangle_RightToRight(int col,int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		displayTriangle_FromLittleToMore_H_Right(numberOfStrings, symbol, delimiter, gapsFromRight + 1);
		displayRectangle(col, numberOfStrings + 1, symbol, delimiter,gapsFromRight);
		displayTriangle_FromMoreToLittle_H_Right(numberOfStrings, symbol, delimiter, gapsFromRight + 1);
	}	
	static void displayTrianglesPlusRectangle_RightToLeft(int col, int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		displayTriangle_FromLittleToMore_H_Right(numberOfStrings, symbol, delimiter, gapsFromRight +1);
		displayRectangle(col, numberOfStrings + 1, symbol, delimiter,gapsFromRight);
		displayTriangle_FromMoreToLittle_H_Left(numberOfStrings, symbol, delimiter, gapsFromRight);
	}
	////          lvl 3         ////
	static void displayTriangle_H_Middle(int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		int gaps = numberOfStrings + gapsFromRight;
		int k = 0;
		for(int i=0;i < numberOfStrings ;i++) {
		      for(k = 1;k < i*2 + 1;k++) {
		      }
		      Model triangle = new Model(k,  symbol, delimiter, gaps);
		    	System.out.print(Controller.printFigure(triangle));
		    	gaps--;
		    }
	}
	static void displayTrapezoid_RectangleMiddle_TriangleLeftAndRight(int numberOfrows, int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		int gaps = numberOfStrings + gapsFromRight;
		int k = 0;
		for(int i=0;i < numberOfrows;i++) {
		      for(k = 0;k < (i*2) + (numberOfStrings * 2);k++) {
		      }
		      Model triangle = new Model(k,  symbol, delimiter, gaps);
		    	System.out.print(Controller.printFigure(triangle));
		    	gaps--;
		    }
	}
	
	////			lvl 4  	       ////
	static void displayTree(int col, int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		displayTriangle_H_Middle(numberOfStrings/3, symbol, delimiter, gapsFromRight + (numberOfStrings / 3) + (numberOfStrings/3));
		displayTriangle_H_Middle(numberOfStrings/2, symbol, delimiter, gapsFromRight + (numberOfStrings / 2));
		displayTriangle_H_Middle(numberOfStrings, symbol, delimiter, gapsFromRight);
		displayRectangle(col, numberOfStrings/3 + 1 , symbol, delimiter, gapsFromRight + (numberOfStrings / 2) - 1);
	}
	
	static void displayRocket(int numberOfRows, int numberOfStrings,char symbol,String delimiter, int gapsFromRight) {
		displayTriangle_H_Middle(numberOfStrings, symbol, delimiter, gapsFromRight + 10);
		displayRectangle(5,numberOfStrings * 2, symbol, delimiter, gapsFromRight + 5);
		displayTrapezoid_RectangleMiddle_TriangleLeftAndRight(numberOfRows, numberOfStrings, symbol, delimiter , gapsFromRight);
		displayRectangle(10,numberOfStrings*2, symbol, delimiter, gapsFromRight + 5);
		displayTrapezoid_RectangleMiddle_TriangleLeftAndRight(numberOfStrings, numberOfStrings, symbol, delimiter, gapsFromRight);
	}
}
