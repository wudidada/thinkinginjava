package alarm;

import java.util.Timer;
import java.util.TimerTask;

public class test {
	
	public static void main(String[] args) {
		Integer a = 5;
		change(a);
		System.out.println(a);
	}
	
	static public void change(Integer num) {
		num++;
		System.out.println(num);
	}
}

