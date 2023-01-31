package showMyName;

public class JavaTime {

	public static void main(String[] args) {
		int a = 13456; // сюда вводить число
		int b = 60;
		int d = a / b;
		int f = a % b;
		System.out.println("figure = " + a);
		if (d >=1 || f >=1) {
			if(d > 1 & f == 1) { 
				System.out.println("Time:\n" + d + " hours and " + f + " minute\n" + d + ":" + f);
			}
			
			if (d == 1 & f == 1 ) { 
				System.out.println("Time:\n" + d + " hour and " + f + " minute\n" + d + ":" + f);
			}
			if(f > 1 & d ==1) { 
					System.out.println("Time:\n" + d + " hour and " + f + " minutes\n" + d + ":" + f);
				}
			}
			if(f > 1 & d > 1) { 
					System.out.println("Time:\n" + d + " hours and " + f + " minutes\n" + d + ":" + f);
				}
		}
	}
	

		

		
		
		
	

		



