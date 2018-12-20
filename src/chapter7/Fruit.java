package chapter7;

class Food {
	Food(int i) {
		System.out.println("Food(" + i + ")");
	}
}

public class Fruit extends Food {
	Fruit(){
		super(0);
		System.out.println("Fruit()");
	}
	
	Fruit(int i){
		super(i);
		System.out.println("Fruit()");
	}
	
	public static void main(String[] args) {
		new Fruit();
		new Fruit(8);
	}
}
