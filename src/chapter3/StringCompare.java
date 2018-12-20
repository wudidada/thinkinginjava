package chapter3;

public class StringCompare {
	
	//使用静态方法以便在main方法中直接使用
	static void f(boolean bool) {
		System.out.println(bool);
	}
	
	static void strCompare(String x, String y) {
		f(x == y);
		f(x.equals(y));
		f(y.equals(x));
	}
	
	public static void main(String[] args) {
		String x1 = "good", y1 = "bad";
		strCompare(x1, y1);
		
		System.out.println("***************");
		
		String x2 = "good";
		String y2 = "good";		//编译器偷懒，二者指向同一个地址。
		strCompare(x2, y2);
		
		System.out.println("***************");
		
		String x3 = new String("good");
		String y3 = new String("good");		
		strCompare(x3,y3);
	}
}
