package files;

import java.io.*;

public class Handler3 {

	public static void main(String[] args) {
		try {
			m();
		} catch (Exception e) {
			System.out.println("Final Handling");
		}

	}
	static void m() {
		try {
			int x = 10 / 0;
		} catch (Exception e) {
			System.out.println("Preliminary Handling");
			throw e;
		}
		
	}
}
