package javaDoc;
import java.util.Scanner;
public class Lotery {

	public static void main(String[] args) {
	while(1<10) {
		System.out.println("Введите двухзначное число");
		Scanner in = new Scanner(System.in);
		int guess = in.nextInt();
		int x1 = guess/10;
		int x2 = guess%10;
		long random1 = Math.round(Math.random()*9);
		long random2 = Math.round(Math.random()*9);
		System.out.println("" + random1 + random2);
		
		if (x1 == random1&&x2==random2) {
			System.out.println("поздравляю вы выграли 10000$");	
		
		}else if (x1 == random1 || x2==random2) { 
			System.out.println("поздравляю вы выграли 1000$");		
		
		}else if (x2 == random1 || x1==random2) {
			System.out.println("поздравляю вы выграли 1000$");	
		
		}else if (x2 == random1&&x1==random2) {
			System.out.println("поздравляю вы выграли 3000$");	
		
		}else{
			System.out.println("извините, вы проиграли");
		}
	  }
	}

}
