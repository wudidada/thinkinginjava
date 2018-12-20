package chapter5;

public class Bird {
	String s;
	
	public Bird(){
		System.out.println("i am a bird!");
	}
	
	Bird(String s){
		this.s = s;
		System.out.println(s + ": i am a bird!");
	}
	
	Bird getBird() {
		System.out.println("get a bird");
		return this;
	}
	
	public static void main(String[] args) {
		Bird bird = new Bird();
		
		Bird bird2 = new Bird("bird2");
		
		Bird bird3 = bird2.getBird();
		
		System.out.println(bird3.s);
	}
}
