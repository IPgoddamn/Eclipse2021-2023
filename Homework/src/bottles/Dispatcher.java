package bottles;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Dispatcher {

	public static void main(String[] args) {
		File f1 = new File("D:\\workspace\\Homework\\src\\bottles\\botles1");
		File f2 = new File("D:\\workspace\\Homework\\src\\bottles\\botles2");
		File f3 = new File("D:\\workspace\\Homework\\src\\bottles\\botles3");
		List <String> result = new ArrayList<>();
		try {
			result.addAll(Controller.b(f1));
			result.addAll(Controller.b(f2));
			result.addAll(Controller.b(f3));
		} catch (FileNotFoundException fnfe) {
			System.out.println("File not found");
		} catch (IOException ioe) {
			System.out.println("IOExc");
		}
		String temp = result.get(0);
		String [] res = temp.split(" ");
		for (String string : res) {
			System.out.println(string);
		}
	}

}
class Files{
	File f1 = new File("D:\\workspace\\Homework\\src\\bottles\\botles1");
	File f2 = new File("D:\\workspace\\Homework\\src\\bottles\\botles2");
	File f3 = new File("D:\\workspace\\Homework\\src\\bottles\\botles3");
}
class Controller { 
	static String temp = "";
	static List<String> b(File f) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		BufferedReader b1 = new BufferedReader(new FileReader(f));
		while ((temp = b1.readLine()) != null) {
		list.add(temp);
		}
		list.remove(0);
		return list;
	}
}
