package codeWars;
public class Xbonacci {
	public static void main(String[] args) {
/*	int c = 8;
	int d = 0;
	int i = 1;
	for(; i < c+1 ; i++) {
		d = d + i;
	}
	System.out.println("summation(" + c + ")" + "->" + d);
	i = 1;
	System.out.print(i);
	for(i +=1; i < c+1 ; i++) {
		System.out.print("+"+ i);
	}*/
		xbonacci(new double []{0,1},10);
		 for (double temp : xbonacci(new double [] {1, 0, 1, 0, 1, 1, 1, 1, 1, 0},7)) {
	    	  System.out.println(temp);
		 }
	}
	
	public static double[] xbonacci(double[] signature, int n) {
//		if(n < signature.length + 1) return signature;
	      double [] exit = new double [n];
	      int i = -1;
	      double fuck = 0;
	      for (double temp : signature) {
	    	  i++;
	    	  exit[i] = signature[i];
	      }			
	    	  for (int c = signature.length; c < exit.length; c++){
	    		  for (int b = 0; b < signature.length; b++){  //signature.length = 2 , i = 1
	    		  	fuck += exit[i-b];  // fuck = 0 + 2 ;  
	    	  }
	    		  i++;
	    		  exit[c] = fuck;
	    		  fuck = 0;
	    	  }
	      return exit;
	  }
}
// [0,1,1,2,3,5,8,13,21,34]
// [1,1,2,3,5,8,13,21,34,55]
// [0,0,0,0,1,1,2,4,8,16]
// 1 , 2, 3, 5, 8, 13 , 21...
/* int t1 = 1;
 * int t2 = 1 + 0 ; t2= 1
 * int t3 = t2 + t1; t3 = 2
 * int t4 = t3 + t2 ; t4 = 3
 * int t5 = t4 + t3; t5 = 5
 */
