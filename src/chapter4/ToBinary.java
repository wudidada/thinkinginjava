package chapter4;

public class ToBinary{
	static void outBit(int x){
		int a = 0x8000;
		for(int i = 0; i < 16; i++) {
			int out = (x | a) == x ? 1 : 0;
			System.out.print(out);
			a >>>= 1;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int a = 0xaaaa;
		int b = 0x5555;
		
		outBit(a & b);
		outBit(a | b);
		outBit(a ^ b);
		outBit(~a);
		
		System.out.println("*************************");
		
		int c = 0x80000000;
		for(int i = 0; i < 32; i++) {
			c >>= 1;
			System.out.println(i + " : " + Integer.toBinaryString(c));
		}
		
		System.out.println("*************************");
		
		charToString('a');
		charToString(' ');
		charToString('b');

	}
	
	public static void charToString(int ch) {
		System.out.println(Integer.toBinaryString(ch));
	}
}
