package com.Swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextAreaTest {
public static void main(String[] args){
	JFrame f=new JFrame("文本区示例");
	Container contentPane=f.getContentPane();
	contentPane.setLayout(new BorderLayout());
	JPanel jpanel=new JPanel();
	JTextArea jta=new JTextArea(10,20);
	jta.setCaretColor(Color.green);
	jta.setBackground(Color.GRAY);
	
	jpanel.add(jta);
	contentPane.add(jpanel);
	f.setSize(500, 200);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}
}
