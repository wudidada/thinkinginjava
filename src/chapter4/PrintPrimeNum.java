package chapter4;

public class PrintPrimeNum {
	
	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 2; i < 100; i++) {
			for(int j = 2; j < i; j++) {
				/*if(i % j == 0) {
					count++;
					System.out.println("num" + count + ": " + i);
					break;
				}*/
				
				if(i % j == 0) {
					break;
				} else if(j == i - 1) {
					count++;
					System.out.println("num" + count + ": " + i);
				}
			}
		}
	}
}
