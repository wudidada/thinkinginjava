package chapter4;

import java.util.Random;

public class RandomInt {
	
	public static void main(String[] args) {
		Random random = new Random();
		int now = random.nextInt();
		for(int i = 0; i < 24; i++) {
			int next = random.nextInt();
			System.out.print("time" + (i + 1) + ": ");
			if(now > next) {
				System.out.println(now + " > " + next);
			}else if(now == next) {
				System.out.println(now + " = " + next);
			}else {
				System.out.println(now + " < " +next);
			}
			now = next;
		}
	}
}
