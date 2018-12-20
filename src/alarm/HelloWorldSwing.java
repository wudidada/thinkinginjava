package alarm;
import javax.swing.*;

public class HelloWorldSwing {
	public static void main(String[] args) {
		JFrame f = new JFrame("hello");
		
		JButton b = new JButton("click");
		b.setBounds(0, 0, 100, 40);
		
		JButton c = new JButton("click");
		
		f.add(b);
		
		f.setSize(400, 500);
		//f.setLayout(null);
		f.setVisible(true);
	}
}
