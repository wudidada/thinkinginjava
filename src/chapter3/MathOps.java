package chapter3;

import java.util.Random;

public class MathOps {
	public static void main(String[] args) {
		int i, j;
		
		Random rand = new Random(4);
		i = rand.nextInt(100) + 1;
		j = rand.nextInt(100) + 1;
		
		System.out.println("i = " + i + ";j = " + j);
		
	}
}
