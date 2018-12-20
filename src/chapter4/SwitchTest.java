package chapter4;

public class SwitchTest {
	public static void main(String[] args) {
		
		for(int i = 0; i < 15; i++) {
			System.out.print(i + " % 4 = ");
			int c = i % 4;
			switch(c) {
			case 0:
				System.out.println("0, case0");
				//break;
			case 1:
				System.out.println("1, case1");
				//break;
			case 2:
				System.out.println("2, case2");
				//break;
			case 3:
				System.out.println("3, case3");
				//break;
			default:
				System.out.println("default");
			
			}
		}
	}
}
