package com.Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MenuBar {
	public static void main(String[] args){
JFrame f=new JFrame("记事本");
Container contentPane=f.getContentPane();
contentPane.setLayout(new BorderLayout());

JMenuBar m=new JMenuBar();
JMenu file=new JMenu("文件(F)");
JMenuItem newFile=new JMenuItem("新建");
JMenuItem open=new JMenuItem("打开");
JMenuItem close=new JMenuItem("关闭");
JMenuItem exit=new JMenuItem("退出");
file.add(newFile);
file.add(open);
file.add(close);
file.add(exit);
m.add(file);
m.add(new JMenu("编辑(E)"));
m.add(new JMenu("格式(O)"));
m.add(new JMenu("帮助(H)"));

f.setJMenuBar(m);

JTextArea t=new JTextArea();
t.setEditable(true);

contentPane.add(new JScrollPane(t),BorderLayout.CENTER);

f.setVisible(true);
f.setSize(500, 200);
f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
     });

  }
}