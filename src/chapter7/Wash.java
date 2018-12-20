package chapter7;

public class Wash extends Detergent {
	public void scrub() {
		append(" Wash.scrub()");
		super.scrub();
	}
	
	public void sterilize() {
		append(" sterlize()");
	}
	
	public static void main(String[] args) {
		Wash x = new Wash();
		x.dilute();
		x.apply();
		x.scrub();
		x.sterilize();
		System.out.println(x);
		System.out.println("Testing base class:");
		Detergent.main(args);
	}
}
