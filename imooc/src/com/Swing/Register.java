package com.Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Register {
public static void main(String[] args){
	JFrame f=new JFrame();
	Container contentPane=f.getContentPane();
	contentPane.setLayout(new BorderLayout());
	JPanel p=new JPanel();
	p.setLayout(new GridLayout(4,2));
	p.setBorder(BorderFactory.createTitledBorder("请输入注册信息"));
	
	JLabel l1=new JLabel("姓名",JLabel.CENTER);
	JLabel l2=new JLabel("性别",JLabel.CENTER);
	JLabel l3=new JLabel("年龄",JLabel.CENTER);
	JTextField t1=new JTextField(10);
	JTextField t2=new JTextField(10);
	JTextField t3=new JTextField(10);
	p.add(l1);
	p.add(t1);
	p.add(l2);
	p.add(t2);
	p.add(l3);
	p.add(t3);
	
	JButton b=new JButton("提交");
	p.add(new Panel());
	p.add(b);
	
	contentPane.add(p);
	f.setSize(500, 300);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
	
}
}
