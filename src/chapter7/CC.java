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
	
	BB b;		//ʵ��������ʼ���ڻ����ʼ��֮��
	
	CC() {
		super(1);
		b = new BB(1);
	}
	
	public static void main(String[] args) {
		CC c = new CC();
	}
}
