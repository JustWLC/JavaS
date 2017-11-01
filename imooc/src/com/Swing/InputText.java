package com.Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class InputText {
public static void main(String[] args){
	JFrame f=new JFrame("Register");
	Container contentPane=f.getContentPane();
	contentPane.setLayout(new GridLayout());
	Box box,box1,box2;
	final JTextArea t1,t2;
	t1=new JTextArea();
	t2=new JTextArea();
	
	JButton b=new JButton("Ã·Ωª");
	b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			t2.setText(t1.getText());
		}
	});
	box1=Box.createVerticalBox();
	box1.add(new JScrollPane(t1),BorderLayout.CENTER);
	
	box2=Box.createVerticalBox();
	box2.add(new JScrollPane(t2),BorderLayout.CENTER);
	box2.add(b);
	
	box=Box.createVerticalBox();
	box.add(box1);
	box.add(Box.createVerticalStrut(20));
	box.add(box2);
	
	contentPane.add(box);
	
	f.setSize(500, 300);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}
}
