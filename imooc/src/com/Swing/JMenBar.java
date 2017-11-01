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
	JMenu file=new JMenu("文件");
	JMenuItem open=new JMenuItem("打开");
	JMenuItem close=new JMenuItem("关闭");
	JMenuItem exit=new JMenuItem("退出");
	
	file.add(open);
	file.add(close);
	file.addSeparator();
	file.add(exit);
	n.add(file);
	n.add(new JMenu("编辑"));
	
	f.setJMenuBar(n);
	f.setSize(500, 200);
	f.setVisible(true);
}


	
}

