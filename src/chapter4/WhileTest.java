package chapter4;

public class WhileTest {
	static boolean condition() {
		double result = Math.random();
		System.out.print("result = " + result);
		return result < 0.9;
	}
	
	public static void main(String[] args) {
		while(condition()) {
			System.out.println(", inside while()");
		}
		System.out.println(", outside while()");
	}
}
