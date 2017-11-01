package com.Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {
public static void main(String[] args){
	JFrame f=new JFrame();
	final Container contentPane=f.getContentPane();
	JTextField result=new JTextField("0");
	result.setHorizontalAlignment(JTextField.RIGHT);
	result.setEditable(false);
	/*result.setColumns(12);*/
	JButton clear=new JButton("C");
	JButton point=new JButton(".");
	JButton count=new JButton("=");
	JButton add=new JButton("+");
	JButton subtract=new JButton("-");
	JButton multiply=new JButton("x");
	JButton divide=new JButton("/");
	JButton back=new JButton("Back");
	JButton percent=new JButton("%");
	JButton inverse=new JButton("1/x");
	
	JPanel p=new JPanel();
	p.setLayout(new BorderLayout());
	p.add(result,BorderLayout.NORTH);
	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(4,5));
	p1.add(clear);
	p1.add(back);
	p1.add(count);
	p1.add(point);
	p1.add(add);
	p1.add(subtract);
	p1.add(multiply);
	p1.add(divide);
	p1.add(percent);
	p1.add(inverse);
	
	for(int i=0;i<10;i++){
		p1.add(new JButton(""+i));
	}
	p.add(p1);
	
	contentPane.add(p);
	f.setVisible(true);
	f.setSize(500, 300);
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}
}
