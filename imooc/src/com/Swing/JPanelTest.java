package com.Swing;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
/*Graphics��������ͼ�������ĵĳ������
����Ӧ�ó��������(�Ѿ��ڸ����豸��ʵ��)�Լ�����ͼ���Ͻ��л���*/
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
		setTitle("ʹ�����");
		setSize(500,300);
		MyPanel p=new MyPanel();
		Container con=getContentPane();
		con.add(p);
	}
	
}
class MyPanel extends JPanel
{
	public void paintComponent(Graphics g){
		g.drawString("������ʾ������ϵ���Ϣ", 120, 100);
		g.setColor(Color.LIGHT_GRAY);
	}
	
}

