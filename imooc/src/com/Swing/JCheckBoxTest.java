package com.Swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JCheckBoxTest {
JFrame f=null;
JCheckBoxTest(){
	f=new JFrame("��ѡ��ʾ��");
	Container contentPane=f.getContentPane();
	contentPane.setLayout(new GridLayout(2,1));
	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(1,3));
	p1.setBorder(BorderFactory.createTitledBorder("ѡ������Ҫȥ�ĳ���"));
	
	JCheckBox c1=new JCheckBox("����");
	JCheckBox c2=new JCheckBox("����");
	JCheckBox c3=new JCheckBox("�Ϻ�");
	p1.add(c1);
	p1.add(c2);
	p1.add(c3);
	
	contentPane.add(p1);
	
	f.pack();
	f.setSize(200, 200);
	f.setVisible(true);
	/*f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});*/
	
		
	}
	public static void main(String[] args){
		new JCheckBoxTest();
	
}
}
