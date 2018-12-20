package chapter5;

class Shit{
	String str;
	{
		str = "str";
		System.out.println("str is initialized");
	}
	
	Shit(){
		System.out.println("Shit()");
	}
}

public class ObjectIntilizeEx {
	public static void main(String[] args) {
		Shit shit = new Shit();
	}
}
