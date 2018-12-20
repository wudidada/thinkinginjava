package chapter4;

import java.util.Random;

public class ForEachString {
	public static void main(String[] args) {
		
		for(char c : "hello world!".toCharArray()) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		System.out.println("************************");
		
		Random random = new Random(47);
		float[] f = new float[10];
		
		for(int i = 0; i < 10; i++) {
			f[i] = random.nextFloat();
		}
		
		for(float x : f) {			//增强for循环只能读取，不能写入
			System.out.println(x);
		}
	}
}
