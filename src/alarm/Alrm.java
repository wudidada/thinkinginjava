package alarm;

import java.io.File;  
import java.util.Calendar;  
  
import javax.swing.JFrame;  
import javax.swing.JOptionPane;  
  
public class Alrm {  
    public static void main(String args[]) {  
        long time;  
        String video = null;  
        String msg = null;  
        try {  
            // ����  
            String strtime = JOptionPane.showInputDialog("����ʱ�䣺hh:mm");  
            String t[] = strtime.split(":");  
            int hh = Integer.parseInt(t[0]);  
            int mm = Integer.parseInt(t[1]);  
            video = JOptionPane.showInputDialog("������Ƶ·������Ϊ������Ҫ��Ƶ��");  
            if (!new File(video).exists())  
                video = null;  
            msg = JOptionPane.showInputDialog("������ʾ��Ϣ��");  
  
            // ����  
            hh -= Calendar.getInstance().get(Calendar.HOUR_OF_DAY);  
            mm -= Calendar.getInstance().get(Calendar.MINUTE);  
            if (mm < 0) {  
                mm += 60;  
                hh--;  
            }  
            if (hh < 0) {  
                hh += 24;  
            }  
            time = ((hh * 60 + mm) * 60 - Calendar.getInstance().get(  
                    Calendar.SECOND)) * 1000;  
  
            // �ȴ�  
            Thread.sleep(time);  
  
            // ִ��  
            if (video != null) {  
                try {  
                    Runtime.getRuntime().exec("start " + video);  
                } catch (Exception e) {  
                    msg += "\n��Ƶ�ļ�����ʧ�ܣ�";  
                }  
            }  
            JOptionPane.showMessageDialog(new JFrame(), strtime + "\n" + msg);  
        } catch (Exception e) {  
            JOptionPane.showMessageDialog(new JFrame(), "��������ʧ�ܣ�ԭ��δ����");  
        }  
    }  
} 