package Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

public class LightFont extends Applet implements Runnable{
	private String text;
	private Font font;
	private int fontsize;
	private Thread t;
	private int position=100;
	private int tsize=20;
	private int twidth=0;
	private int fheight,baseLine,w;
	public void init(){
		text="江苏科技大学";
		fontsize=30;
		font=new Font("TimesRoman",Font.BOLD,fontsize);
		FontMetrics fm=getFontMetrics(font);
		fheight=fm.getHeight();
		baseLine=getSize().height/2+fheight/3;
		twidth=fm.stringWidth(text);
		w=fm.stringWidth(text);
		w=(getSize().width-w)/2;
		position=w;
		this.setBackground(Color.black);
	}
	public void start(){
		if(t==null){
			t=new Thread(this);
			t.start();
		}
	}
	public void stop(){
		t.interrupt();
		t=null;
	}
	public void run(){
		while(true){
			repaint();
			try{
				t.sleep(30);
			}catch(InterruptedException e){
				
			}
		}
	}
	public void update(Graphics g){
		paint(g);
	}
	public void paint(Graphics g){
		g.setFont(font);
        g.setColor(Color.red);
        g.drawString(text, w, baseLine);
        g.clipRect(position, 0, tsize, getSize().height);
        g.setColor(Color.white);
        g.drawString(text, w, baseLine);
        position=(position+1)%(twidth+100);
        
	}

}
