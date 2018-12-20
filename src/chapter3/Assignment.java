package chapter3;

class Tank {
	float level;
}

public class Assignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		
		t1.level = 2;
		t2.level = 3;
		
		System.out.println("t1.level = " + t1.level );
		System.out.println("t2.level = " + t2.level );
		
		t1 = t2;
		t2.level = 4;
		
		System.out.println("t1.level = " + t1.level );
		System.out.println("t2.level = " + t2.level );
		

		
	}
}
