package com.imooc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckIn {
	public static void main(String[] args){
		Frame f=new Frame("��ס�Ǽ�");
		f.setLayout(new GridLayout(3,1));
		
		Panel p1=new Panel();
		p1.add(new Label("����"));
		p1.add(new TextField(20));
		
		Panel p2=new Panel();
		p2.add(new Label("����"));
		List li=new List(4);
		li.add("�й�");
		li.add("����");
		li.add("����");
		li.add("����");
		li.add("�Ĵ�����");
		li.add("���ô�");
		p2.add(li);
		
		Panel p3=new Panel();
		Button b=new Button("�ύ");
		b.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(1);
			}
		});
		p3.add(b);
		
	
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.setSize(400, 300);
		f.setVisible(true);
	
		
	}

}
