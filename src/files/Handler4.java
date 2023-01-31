package files;

import java.io.*;

public class Handler4 {

	public static void main(String[] args)  throws IOException{
		
		try {
			File f1 = new File("D:\\workspace\\Handler\\src\\files\\file3");
			f1.createNewFile();
//			System.exit(0);
			int x = 10 / 0;
		} catch (IOException e) {
			System.out.println("Exc");
			int y = 10 / 0;
		} finally{
			System.out.println("Fin");
			int z = 10 / 0;
		}
	}

}
