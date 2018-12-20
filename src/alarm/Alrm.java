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
            // 设置  
            String strtime = JOptionPane.showInputDialog("输入时间：hh:mm");  
            String t[] = strtime.split(":");  
            int hh = Integer.parseInt(t[0]);  
            int mm = Integer.parseInt(t[1]);  
            video = JOptionPane.showInputDialog("输入音频路径：（为空则不需要音频）");  
            if (!new File(video).exists())  
                video = null;  
            msg = JOptionPane.showInputDialog("闹钟提示信息：");  
  
            // 计算  
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
  
            // 等待  
            Thread.sleep(time);  
  
            // 执行  
            if (video != null) {  
                try {  
                    Runtime.getRuntime().exec("start " + video);  
                } catch (Exception e) {  
                    msg += "\n音频文件加载失败！";  
                }  
            }  
            JOptionPane.showMessageDialog(new JFrame(), strtime + "\n" + msg);  
        } catch (Exception e) {  
            JOptionPane.showMessageDialog(new JFrame(), "闹钟任务失败，原因未明！");  
        }  
    }  
} 