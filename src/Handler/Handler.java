package Handler;

public class Handler {

	public static void main(String[] args) {
		//int b2 = 0b1_0001_1101; // 0001_0001_1101 0b двійкова
		//int b1 = 0x11D; // hexadecimal 0x, 0X шістнадцяткова
		//int b = 0b100_011_101;
		//        4   3   5
		//int o2 = 0435; //octal 0 вісімкова система
		//System.out.println(b2);
		//System.out.println(b1); 
		//System.out.println(o2);	
		int i1 = 1000000000;
		long i2 = 1500000000;
		long result = i1 + i2;
		System.out.println(result);
		}

}
// 725 = 7*10**2 + 2*10**1 + 5*10**0 
// 1011010101 = 1*2**9 +0*2**8 +1*2**7 +1*2**6 +0*2**5 +1*2**4 +0*2**3 +1*2**2 +0*2**1 +1*2**0
// 9876543210   2**9 + 2**7 + 2**6 + 2**4 + 2**2 + 2**0
//              512 + 128 + 64 + 16 + 4 + 1 = 725
// 285 dec = ???bin
// 285/2 1
// 142/2 0
// 71/2  1
// 35/2  1
// 17/2  1
// 8/2   0
// 4/2   0
// 2/2   0
// 1     1
// Додавання в двійковій системі 1 + 0 = 1; 1 + 1 = 10
// 10110 Bin -> 16 + 4 + 2 =     22 dec
// 11011 bin -> 16 + 8 + 2 + 1 = 27 dec
// -----
// 110001 bin -> 32 + 16 + 1 =   49 dec
// 0 0000 0
// 1 0001 1
// 2 0010 2
// 3 0011 3
// 4 0100 4
// 5 0101 5
// 6 0110 6
// 7 0111 7
// 8 1000 8
// 9 1001 9
// 10 1010 A 
// 11 1011 B
// 12 1100 C 
// 13 1101 D
// 14 1110 E
// 15 1111 F
// 16 