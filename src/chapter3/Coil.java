package chapter3;

import java.util.Random;

public class Coil {
	int num;
	String side;
	
	public Coil() {
		Random random = new Random();
		num = random.nextInt(10);
		if(num <= 4) {
			side = "zheng";
		}else {
			side = "fan";
		}
	}
	
	public static void main(String[] args) {
		Coil a = new Coil();
		Coil b = new Coil();
		
		System.out.println(a.side);
		System.out.println(b.side);
	}
}
