package chapter4;

public class Fibonacci {
	
	static void output(int count) {
		int num1 = 1;
		int num2 = 1;
		
		if(count < 1) {
			System.out.println("please input a num at least 1");
			return;
		}
		
		System.out.println(num1 + " ");
		
		while(count > 1) {
			System.out.println(num2);
			num2 = num1 + num2;
			num1 = num2 - num1;
			count--;
		}
	}
	public static void main(String[] args) {
		
		if(args[0].length() == 0) {
			System.out.println("please input a number");
		}
		
		int a = Integer.parseInt(args[0]);
		
		output(a);
			
	}
}
