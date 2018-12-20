package chapter7;

class AA {
	AA(int i) {
		System.out.println("AA()");
	}
}

class BB {
	BB(int i) {
		System.out.println("BB()");
	}
}

public class CC extends AA {
	
	BB b;		//实例变量初始化在基类初始化之后
	
	CC() {
		super(1);
		b = new BB(1);
	}
	
	public static void main(String[] args) {
		CC c = new CC();
	}
}
