package alarm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Reminder implements ActionListener {
	JFrame frame;
	JButton start;
	JButton stop;
	
	JTextField minute;
	JLabel minute_text;
	JTextField second;
	JLabel second_text;
	
	Timer timer;
	TimerTask task;
	Boolean isStart;		//���Ƶ����ʼ��ʼ��ť���ٿ���
	int time;
	
	
	Reminder() {
		//ҳ�沼��
		minute = new JTextField();
		minute.setBounds(50, 30, 30, 30);
		minute_text = new JLabel("��");
		minute_text.setBounds(80, 30, 30, 30);
		
		second = new JTextField();
		second.setBounds(100, 30, 30, 30);
		second_text = new JLabel("��");
		second_text.setBounds(130, 30, 30, 30);
		
		start = new JButton("��ʼ");
		start.setBounds(25, 85, 60, 40);
		stop = new JButton("ֹͣ");
		stop.setBounds(105, 85, 60, 40);
		
		//��ť���ϼ�����
		start.addActionListener(this);	
		stop.addActionListener(this);	
		
		frame = new JFrame("alarm");
		frame.add(minute);
		frame.add(minute_text);
		frame.add(second);
		frame.add(second_text);
		frame.add(start);
		frame.add(stop);
		frame.setSize(210, 190);
		frame.setLocation(600, 300);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);	//����رպ�ʹ�����˳���Ĭ��ΪHIDE_ON_CLOSE
		frame.getRootPane().setDefaultButton(start);	//�����س���������ʼ
		isStart = false;
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//�����ʼʱ����
		if(e.getSource() == start) {
			if(!isStart) {
				isStart = true;
				start();
			}
		}	
			
		//���ֹͣʱ����
		if(e.getSource() == stop) {
			stop();
		}
	}
	
	
	private void start() {
		//��������Ĭ��Ϊ0
		String min_str = minute.getText().equals("") ? "0" : minute.getText();
		String sec_str = second.getText().equals("") ? "0" : second.getText();
		
		int min_num = Integer.parseInt(min_str);
		int sec_num = Integer.parseInt(sec_str);
		time = min_num * 60 + sec_num;
		
		if(time == 0) {
			return;
		}
		//ʹ��������ܱ༭
		minute.setEditable(false);
		second.setEditable(false);
		
		//����Timer��ʵ�ּ�ʱ
		timer = new Timer();
		task = new TimerTask() {
			public void run() {
				time--;
				minute.setText(String.valueOf(time / 60));
				second.setText(String.valueOf(time % 60));
				//��ʱ���� ֹͣ��ʱ �������� 
				if(time == 0) {
					frame.setAlwaysOnTop(true);							//�������ö�����Ϣ������֮�ö�
					JOptionPane.showMessageDialog(frame, "ʱ�䵽�ˣ�");
					stop();
				}
			}
		};
		timer.scheduleAtFixedRate(task, 1000, 1000);
	}
	
	private void stop() {
		//ȡ����ʱ���� �ָ���ʼ��ť
		if(timer != null) {
			timer.cancel();
			timer.purge();
			clearTime();		//�������������������
			minute.setEditable(true);
			second.setEditable(true);
			frame.setAlwaysOnTop(false);
			isStart = false;
		}
	}
	
	private void clearTime() {
		minute.setText("");
		second.setText("");	
	}
	
	public static void main(String[] args) {
		new Reminder();
	}
}
