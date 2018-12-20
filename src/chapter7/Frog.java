package chapter7;

class Amphibian {
	public void croak() {
		System.out.println("guaguagua");
	}
	
	public void run() {
		System.out.println("runrunrun");
	}
	
	public static void grow(Amphibian f) {
		System.out.println("A amphibian is growing");
		f.croak();
	}
	
}

public class Frog extends Amphibian {
	public void croak() {
		System.out.println("wawawa");
	}
	
	public void jump() {
		System.out.println("jumpjumpjump");
	}
	public static void main(String[] args) {
		Frog frog = new Frog(); 
		frog.run();
		Amphibian.grow(frog);	
	}
}


