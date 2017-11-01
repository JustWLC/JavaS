package com.Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
/*Graphics类是所有图形上下文的抽象基类
允许应用程序在组件(已经在各种设备上实现)以及闭屏图像上进行绘制*/
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest 
{
public static void main(String[] args)
{
	PanelFrame f= new PanelFrame();
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	
	});
	f.setVisible(true);
  }
}
class PanelFrame extends JFrame
{
	public PanelFrame(){
		setTitle("使用面板");
		setSize(500,300);
		MyPanel p=new MyPanel();
		Container con=getContentPane();
		con.add(p);
	}
	
}
class MyPanel extends JPanel
{
	public void paintComponent(Graphics g){
		g.drawString("这是显示在面板上的信息", 120, 100);
		g.setColor(Color.LIGHT_GRAY);
	}
	
}

