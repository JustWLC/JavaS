package com.Swing;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PhoneBook {
public static void main(String[] args){
	JFrame f=new JFrame("电话簿");
	Container contentPane=f.getContentPane();
	Box box,box1,box2;
	JTextField name,email,phone;
	JButton button;
	
	name=new JTextField(12);
	email=new JTextField(12);
	phone=new JTextField(12);
	button =new JButton("录入");
	
	box1=Box.createVerticalBox();
	box1.add(new JLabel("输入姓名"));
	box1.add(Box.createVerticalStrut(60));
	box1.add(new JLabel("输入email"));
	box1.add(Box.createVerticalStrut(60));
	box1.add(new JLabel("输入电话"));
	box1.add(Box.createVerticalStrut(50));
	box1.add(new JLabel("单机录入"));
	
	box2=Box.createVerticalBox();
	box2.add(name);
	box2.add(Box.createVerticalStrut(8));
	box2.add(email);
	box2.add(Box.createVerticalStrut(8));
	box2.add(phone);
	box2.add(Box.createVerticalStrut(8));
	box2.add(button);
	
	box=Box.createHorizontalBox();
	box.add(box1);
	box.add(Box.createHorizontalStrut(10));
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
