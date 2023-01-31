package codeWars;

public class MexicanWave {

	public static void main(String[] args) {
		for(String temp : MexicanWave1.wave(" two words"))System.out.println(temp);
		char [] ch = {'j','a','v'};
		String str = "two Words";
	}

}
class MexicanWave1 {
    static String[] wave(String str) {
    	int count = 0;
    	for (int i = 0; i < str.length(); i++) {
    		if(str.charAt(i) == ' ')continue;
    		count++;
    	}
//    	System.out.println(count);
        String[] s = new String [count];	
        int n = 0;
        for (int i = 0; i < str.length(); i++){
        	char[] arr = str.toCharArray();
        	if (arr[i] == ' '){
        		continue;
        	}else {
        	System.out.println(n);
        	arr[i] = Character.toUpperCase(arr[i]);
        	s[n] = String.valueOf(arr);
        	n++;
        	}
        }
        return s;
    }
}