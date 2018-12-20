package chapter3;

public class BitOps {
	public static void main(String[] args) {
		int a = 0xaaaa;
		int b = 0x5555;
		
		System.out.println(Integer.toBinaryString(a & b));
		System.out.println(Integer.toBinaryString(a | b));
		System.out.println(Integer.toBinaryString(a ^ b));
		System.out.println(Integer.toBinaryString(~a));
		
		System.out.println("");
		
		int c = 0x80000000;
		for(int i = 0; i < 32; i++) {
			c >>= 1;
			System.out.println(i + " : " + Integer.toBinaryString(c));
		}
		
		System.out.println("*************************");
		
		charToString('a');
		charToString(' ');
		charToString(' ');

	}
	
	public static void charToString(int ch) {
		System.out.println(Integer.toBinaryString(ch));
	}
}
