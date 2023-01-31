package codeWars;
import static java.lang.Character.*;
public class HighestScoringWord {

	public static void main(String[] args) {
//		System.out.println(Kata.high("dmlpyx qhbjrst"));
		System.out.println(Kata1.high("man i need a taxi up to ubud"));
		char c = 'a';
		int sc = c;
		System.out.println(sc);
	}
}
class Kata {

	  static String high(String s) {
		String [] str = s.split(" ");
		int[] numbers = new int[str.length];
		int numOfWord = 0;
		int numOfWord2 = 0;
		int max = 0;
		int indexOfMax = 0;
		for (int i = 0; i < str.length; i++) {
			char [] ch = str[i].toCharArray();
			for(char element : ch) {
				if(element == 'a'||element == 'b'||element =='c'||element =='d'
				||element =='e'||element =='f'||element =='g'||element =='h'||element =='i'||element =='j') {
					numOfWord += getNumericValue(element)%10 + 1;
				}else {
				numOfWord += getNumericValue(element) - 9;
				}
//				numOfWord2 += getNumericValue(element);
//				System.out.print(numOfWord + " ");
			}
			numbers[i] = numOfWord;
			System.out.println(numOfWord + "\t" + numOfWord2);
			numOfWord = 0;
//			numOfWord2 = 0;
			max = Math.max(max, numbers[i]);
			}
		for (int i = 1; i < numbers.length; i++)
		{
		    if (numbers[i] > numbers[indexOfMax])
		    {
		        indexOfMax = i;
		    }
		}
		return str[indexOfMax];
	  }
	  
	}
 class Kata1 {

	  public static String high(String s) {
	    
	    String winner = "";
	    int highScore = 0;
	    
	    for (String word : s.split(" ")) {
	        int score = 0;
	        for (char c : word.toCharArray()) {
	          score += c - 'a' + 1; 		// c - 97 | a = 97
	          System.out.println(score);
	        }
	        if (score > highScore) {          
	          winner = word;
	          highScore = score;
	        }
	    }
	    
	    return winner;
	  }

	}