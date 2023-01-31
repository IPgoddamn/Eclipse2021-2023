package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Handler {
	public static void main(String[] args)  throws IOException{
		File f1 = new File("D:\\workspace\\Handler\\src\\files\\file1"); // "D:/workspace/Handler/src/files/file1"
		File f2 = new File("D:\\workspace\\Handler\\src\\files\\file2");
//		System.out.println(f1.exists());
//		System.out.println(f1.length());
//		int x = 10 / 0;	// ?????	unchecked exception
		ArrayList<String> als = new ArrayList<>();
//		try {
			BufferedReader br = new BufferedReader(new FileReader(f1)); // ?????	checked exception
			String temp = "";
			while ((temp = br.readLine()) != null) {
				// System.out.println(temp);
				als.add(temp);

			}
			br.close();
//			System.out.println(als);
//			f2.createNewFile();
			PrintWriter pw = new PrintWriter(f2);
			for(String s : als) {
			pw.println(s);
			}
			pw.flush();
			pw.close();
//		} catch (FileNotFoundException fnfe) {
//		} catch (IOException ioe) {}
	}
}
