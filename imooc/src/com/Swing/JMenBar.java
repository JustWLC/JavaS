package com.Swing;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JMenBar {
public static void main(String[] args){
	JFrame f=new JFrame();
	Container c=f.getContentPane();
	c.setLayout(new BorderLayout());
	
	JMenuBar n=new JMenuBar();
	JMenu file=new JMenu("�ļ�");
	JMenuItem open=new JMenuItem("��");
	JMenuItem close=new JMenuItem("�ر�");
	JMenuItem exit=new JMenuItem("�˳�");
	
	file.add(open);
	file.add(close);
	file.addSeparator();
	file.add(exit);
	n.add(file);
	n.add(new JMenu("�༭"));
	
	f.setJMenuBar(n);
	f.setSize(500, 200);
	f.setVisible(true);
}


	
}

