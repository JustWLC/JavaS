package com.Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FontSize {
public static void main(String[] args){
	JFrame f=new JFrame();
	Container c=f.getContentPane();
	c.setLayout(new BorderLayout());
	
	JPanel p=new JPanel();
	p.setLayout(new BorderLayout());
	
	JPanel sp=new JPanel();
	JRadioButton r9=new JRadioButton("9");
	JRadioButton r12=new JRadioButton("12");
	JRadioButton r18=new JRadioButton("18");
	JRadioButton r22=new JRadioButton("22");
	sp.add(r9);
	sp.add(r12);
	sp.add(r18);
	sp.add(r22);
	ButtonGroup bg=new ButtonGroup();
	bg.add(r9);
	bg.add(r12);
	bg.add(r18);
	bg.add(r22);
	
	p.add(sp,BorderLayout.NORTH);
	
	final JTextArea t=new JTextArea();
	p.add(new JScrollPane(t), BorderLayout.CENTER);
	
	r9.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			t.setFont(new Font("TimeRoman",Font.PLAIN,9));
		}
	});
	r12.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			t.setFont(new Font("TimeRoman",Font.PLAIN,12));
		}
	});
	r18.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			t.setFont(new Font("TimeRoman",Font.PLAIN,18));
		}
	});
	r22.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			t.setFont(new Font("TimeRoman",Font.PLAIN,22));
		}
	});
	
	c.add(p);
	
	f.setVisible(true);
	f.setSize(500, 200);
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}
}
