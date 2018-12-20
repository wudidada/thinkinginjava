package chapter4;

public class VampireNum {
	
	static int out(int a, int b) {
		return a * 10 + b;
	}
	
	static int reOut(int a, int b) {
		return b * 10 + a;
	}
	
	static boolean isVamNum(int num) {
		if(num % 100 == 0) {
			return false;
		}
		int a = num / 1000;
		int b = (num %1000) / 100;
		int d = num % 10;
		int c = (num % 100 - d) / 10;
		
		if(out(a, b) * out (c, d) == num) {
			return true;
		} else if(out(a, b) * reOut(c, d) == num) {
			return true;
		} else if(reOut(a, b) * out(c, d) == num) {
			return true;
		} else if(reOut(a, b) * reOut(c, d) == num) {
			return true;
		}
		
		if(out(a, c) * out (b, d) == num) {
			return true;
		} else if(out(a, c) * reOut(b, d) == num) {
			return true;
		} else if(reOut(a, c) * out(b, d) == num) {
			return true;
		} else if(reOut(a, c) * reOut(b, d) == num) {
			return true;
		}
		if(out(a, d) * out (b, c) == num) {
			return true;
		} else if(out(a, d) * reOut(b, c) == num) {
			return true;
		} else if(reOut(a, d) * out(b, c) == num) {
			return true;
		} else if(reOut(a, d) * reOut(b, c) == num) {
			return true;
		}
		
		return false;
			
	}
	
	public static void main(String[] args) {
		for(int i = 1000; i < 10000; i++) {
			if(isVamNum(i)) {
				System.out.println(i);
			}
		}
	}
}
