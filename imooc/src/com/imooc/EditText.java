package com.imooc;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditText {
public static void main(String[] args){
	Frame f=new Frame("ÎÄ±¾±à¼­Æ÷");
	f.setLayout(new BorderLayout());
	Panel t=new Panel();
	t.setLayout(new FlowLayout());
	t.add(new Button("File"));
	t.add(new Button("Edit"));
	t.add(new Button("Format"));
	t.add(new Button("view"));
	t.add(new Button("Help"));
	f.add(t, BorderLayout.NORTH);
	
	Panel a=new Panel();
	a.add(new TextArea());
	f.add(a,BorderLayout.CENTER);
	Panel s=new Panel();
	Button b=new Button("¹Ø±Õ");
	b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.exit(1);
		}
	});
	a.add(b);
	
	f.add(a,BorderLayout.SOUTH);
	f.setSize(600, 600);
	f.setVisible(true);
	
	
   }
}