                                                                     package com.Swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonTest {
JFrame f=null;
JRadioButton r4=null;
JRadioButton r5=null;
JRadioButtonTest(){
	f=new JFrame("��ѡ��ʾ��");
	Container contentPane=f.getContentPane();
	contentPane.setLayout(new GridLayout(2,1));
	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(1,3));
	p1.setBorder(BorderFactory.createTitledBorder("ѡ����ϲ���ĳ���"));
	JRadioButton r1=new JRadioButton("����");
	JRadioButton r2=new JRadioButton("�Ϻ�");
	JRadioButton r3=new JRadioButton("���");
	p1.add(r1);
	p1.add(r2);
	p1.add(r3);
	
	contentPane.add(p1);
	f.pack();
	f.setVisible(true);
	f.setSize(300, 300);
	/*f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});*/
	
}
public static void main(String[] args){
	new JRadioButtonTest();
}
}

