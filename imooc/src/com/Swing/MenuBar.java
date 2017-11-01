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
JFrame f=new JFrame("���±�");
Container contentPane=f.getContentPane();
contentPane.setLayout(new BorderLayout());

JMenuBar m=new JMenuBar();
JMenu file=new JMenu("�ļ�(F)");
JMenuItem newFile=new JMenuItem("�½�");
JMenuItem open=new JMenuItem("��");
JMenuItem close=new JMenuItem("�ر�");
JMenuItem exit=new JMenuItem("�˳�");
file.add(newFile);
file.add(open);
file.add(close);
file.add(exit);
m.add(file);
m.add(new JMenu("�༭(E)"));
m.add(new JMenu("��ʽ(O)"));
m.add(new JMenu("����(H)"));

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