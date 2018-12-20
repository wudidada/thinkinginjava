package chapter5;

public class Rock {
	String str1 = "str1";	//定义时就被初始化，实例化被赋值一次
	String str2;			//通过构造器初始化，实例化时被赋值两次，null及“str2”
	String str3 = str2;		
	
	Rock(){
		str2 = "str2";
	}
	
	public static void main(String[] args) {
		Rock rock = new Rock();
		System.out.println("str1: " + rock.str1);
		System.out.println("str2: " + rock.str2);
		System.out.println("str1: " + rock.str3);
	}
}
