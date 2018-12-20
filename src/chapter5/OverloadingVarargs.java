package chapter5;



public class OverloadingVarargs {
	
	static void f(String... args) {
		for(String str : args) {
			System.out.println(str);
		}
	}
	
	public static void main(String... args) {
		f(new String[] {"a","b","c"});
		
		System.out.println("*************");
		
		f("d","e","f");
		
		System.out.println("*************");
		
		for(String str : args) {
			System.out.println(str);
		}
	}
}
