package javaDoc;

public class Dispatcher {

	public static void main(String[] args) {
		//int [] a= {5,2,7};
		//System.out.println(a);
		int a [] = new int[3];
		//System.out.println(a[1]);
		//System.out.println(a);
		a[0]= 2;// 1 форма записи
		a[1]= 5;
		a[2]= 7;
		int[] b = {-3,9,1}; // 2 форма записи
		int[] c = new int[3];
		c[0] = a[0]+b[0];
		c[1] = a[1] + b[1];
		c[2] = a[2] + b[2];
		System.out.println("a = {"+a[0]+","+a[1]+","+a[2]+"}");
		System.out.println("b = {"+b[0]+","+b[1]+","+b[2]+"}");
		System.out.println("c = {"+c[0]+","+c[1]+","+c[2]+"}");
		
	}

}
