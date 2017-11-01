package Applet;

import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame implements Runnable {
private Thread time=null;//时钟线程
private JLabel clock;//用于显示时间
private SimpleDateFormat format=new SimpleDateFormat("HH:mm:ss");

public void init(){
	this.setTitle("Digital Clock");
	this.setSize(200,100);
	this.setLocationRelativeTo(null);
	this.add(createLabel());
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setVisible(true);
}
public void run(){
	while(time!=null){
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		clock.setText(format.format(new Date()));
	}
	
}
public void start(){
	if(time==null){
		time =new Thread(this);
		time.start();
	}
}
public void stop(){
	time=null;
}
public DigitalClock(){
	init();
	start();
}
public JLabel createLabel(){
clock =new JLabel(format.format(new Date()),JLabel.CENTER);
clock.setFont(new Font("Times New Roman",Font.BOLD,40));
clock.setForeground(Color.blue);
return clock;
}
	
public static void main(String[] args){
	new DigitalClock();
	
}


}
