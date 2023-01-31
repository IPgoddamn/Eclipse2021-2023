package parsing;
import java.util.regex.*;
public class Handler {
	public static void main(String[] args) {
//		Pattern p = Pattern.compile("[a-zA-Z]*[Jj]ava[^,]*");
//		Matcher m = p.matcher("java, Javanese, ProJava"); //23!!!!
//		while(m.find()) {
//			System.out.println(m.group());
//		}
		Pattern p1 = Pattern.compile("[a-z]*\\d");
		Matcher m1 = p1.matcher("cab1"); //23!!!!
		while(m1.find()) {
			System.out.println(m1.group());
		}
	}
}