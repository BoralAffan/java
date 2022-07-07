package com.Affan.Clock;
import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat DayFormat;
    SimpleDateFormat DateFormat;
    JLabel timeLabel;
    JLabel DayLabel;
    JLabel DateLabel;
    String day;
    String time;
    String date;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CLOCK");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);


        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        DayFormat = new SimpleDateFormat("EEEE");
        DateFormat = new SimpleDateFormat("MMMMM dd, yyyy");


        timeLabel = new JLabel();
        timeLabel.setFont(new Font("verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        DayLabel = new JLabel();
        DayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));

        DateLabel =  new JLabel();
        DateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));

        this.add(timeLabel);
        this.add(DayLabel);
        this.add(DayLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

          day = DayFormat.format(Calendar.getInstance().getTime());
            DayLabel.setText(day);

            date = DateFormat.format(Calendar.getInstance().getTime());
            DateLabel.setText(date);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
