package chapter3;

public class Instant {
	public static void main(String[] args) {
		long a = 0444;
		long b = 0x1233;
		
		System.out.println(Long.toBinaryString(b + a));
	}
}
