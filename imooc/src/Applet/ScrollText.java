package Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class ScrollText extends Applet implements Runnable {
Thread t;
boolean stop=false;
String s="Pass Your World";
int p=100;
public void init(){
	this.setBackground(Color.cyan);
	this.setForeground(Color.yellow);
	this.setFont(new Font("TimeRoman",Font.BOLD,20));
}
public void start(){
	if(t==null){
		t=new Thread(this);
		t.start();
	}
}
public void stop(){
	if(t!=null){
		stop=true;
		t=null;
	}
}
public void run(){
	while(!stop){
		p-=1;
		if(p<-99){
			p=100;
		}
		repaint();
		try{
			Thread.sleep(100);
		}catch(InterruptedException e){
			System.out.println();
		}
	}
}
public void paint(Graphics g){
	g.setColor(Color.black);
	g.drawString(s, p, 50);
}
}
