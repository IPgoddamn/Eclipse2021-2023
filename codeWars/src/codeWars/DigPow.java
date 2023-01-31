package codeWars;
import static codeWars.DigPoww.digPow;
public class DigPow {
	public static void main(String[] args) {
		System.out.println(digPow(91, 1));
	}
}

	class DigPoww {
		static long digPow(int n, int p) {
			String str = Integer.toString(n);
			String[] s = str.split("");
			long c = 0;
			for (int i = 0; i < str.length(); i++) {
				c += Math.round(Math.pow(Integer.parseInt(s[i]), p));
				p++;
			}
				if (c % n == 0)
					return c / n;
				else return -1;
		}
	}
	/*
	public static long digPow(int n, int p) {
		long temp = 0;
		String[] value = String.valueOf(n).split("");
		for (int i = 0; i < value.length; i++) {
			temp += Math.pow(Double.parseDouble(value[i]), (p + i));
		}
		return temp % n == 0 ? temp / n : -1;
	}
	*/