package test;

public class Test2 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = s1;
		String s3 = new String("hello");
		System.out.println(s1 == s3);
	}
}
