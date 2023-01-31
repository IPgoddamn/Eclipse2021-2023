package codeWars;
import java.util.Arrays;
public class AreTheySame {

	public static void main(String[] args) {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		System.out.println(AreSame.comp(a, b));

	}

}
class AreSame {
	
	static boolean comp(int[] a, int[] b) {
		boolean boo = false;
		Arrays.sort(a);
		int amount = 1;
		for (int i1 = 1; i1 < a.length; i1++) {
				if(a[i1] != a[i1 - 1]){
		            amount++;
				}
			}
		int[] a1 = new int[amount];
		int c = 0;
		int unique = 0;
		for (int i = 0 ; i < a.length; i = i) {
			for (int j = 0; j < a.length; j++) {
				if(a[i] == a[j]) {
					unique++;
				}
			}
				a1[c++] = a[i];
				i += unique;
				unique = 0;
		}
		int count = 0;
		for (int temp1 = 0; temp1 <a1.length; temp1++) {
			for (int temp2 = 0; temp2 <b.length; temp2++) {
				if(b[temp2] == a1[temp1] *a1[temp1]) {
					count++;
				}
			}
		}
		if (count == b.length) boo = true;
		if(a == null || b == null){
		      boo = false;
		    }
    return boo;
  }
}
// has some problems but i don t know which
////////////////////////////////////////////////////////
/*	boolean toReturn = true;

if(a == null || b == null){
  return false;
}
	if(a.length != b.length) {
		return false;
	}
	for(int i=0; i<b.length; i++) {
		a[i] = a[i]*a[i];
	}
	Arrays.sort(a); Arrays.sort(b);
	for(int i=0; i<a.length; ++i)
		if(a[i] != b[i])
			return false;
return toReturn;*/