package learn.ch6.timer;

import javax.swing.*;
//import javax.swing.Timer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
//import java.util.Timer;

/**
 * Created by qqins on 2017/11/2 22:10
 */
public class TimerTest {
    public static void main(String[] args) {
        ActionListener listener=new TimePrinter();
        Timer t = new Timer(1000, listener);
        t.start();
        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);

    }
}

class TimePrinter implements ActionListener{
    public void actionPerformed(ActionEvent event){
        System.out.println("At the tone,the time is"+ new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
