package chapter7;

class Cleanser2 {
	private String s = "Cleanser";
	public void append(String a) {
		s += a;
	}
	public void dilute() {
		append(" dilute()");
	}
	public void apply() {
		append(" apply()");
	}
	public void scrub() {
		append(" scrub()");
	}
	public String toString() {
		return s;
	}
	
	public static void main(String[] args) {
		Cleanser2 x = new Cleanser2();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}

public class Detergent2 {
	Cleanser2 cleanser = new Cleanser2();
	
	public void dilute() {
		cleanser.dilute();
	}
	
	public void apply() {
		cleanser.apply();
	}
	
	public void scrub() {
		cleanser.append(" Detergent.scrub()");
		cleanser.scrub();
	}
	
	public void foam() {
		cleanser.append(" foam()");
	}
	
	public String toString() {
		return cleanser.toString();
	}
	
	public static void main(String[] args) {
		Detergent2 x = new Detergent2();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}
}
