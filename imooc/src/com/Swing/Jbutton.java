package com.Swing;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jbutton {

public static void main(String[] args){
	JFrame f=new JFrame("����һ����ť");
	Container contentpane=f.getContentPane();
	/*����һ���µ�Container������ֱ����չContainer������������������������ģ�
	 * ���������뱻λ�ڱ���������и��ߴ���ĳһ��������������*/
	JButton b =new JButton("��ť");
	//����һ������ʼ�ı��İ�ť
	//���û���������ֵ�λ�ã�ϵͳĬ��ֵ�Ὣ��������ͼ�ε��ұ��м�λ�á�
	//�����ı������ͼ���ˮƽ�����λ�á�
	b.setHorizontalTextPosition(JButton.CENTER);
	//�����ı������ͼ��Ĵ�ֱ�����λ��
	b.setVerticalTextPosition(JButton.BOTTOM);
	contentpane.add(b);
	f.pack();
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(1);
		}
	});
	
}
}
