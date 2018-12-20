package chapter5;

class Person {
	void eatApple(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("yummy£¡");
	}
}

class Peeler {
	Apple peel(Apple apple) {
		System.out.println("peeled an apple");
		return apple;
	}
}

class Apple {
	Apple getPeeled() {
		return new Peeler().peel(this);
	}
}
public class PassingThis {
	public static void main(String[] args) {
		new Person().eatApple(new Apple());
	}
}
