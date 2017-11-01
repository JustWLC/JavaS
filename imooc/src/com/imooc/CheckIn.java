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
		Frame f=new Frame("入住登记");
		f.setLayout(new GridLayout(3,1));
		
		Panel p1=new Panel();
		p1.add(new Label("姓名"));
		p1.add(new TextField(20));
		
		Panel p2=new Panel();
		p2.add(new Label("国籍"));
		List li=new List(4);
		li.add("中国");
		li.add("美国");
		li.add("法国");
		li.add("韩国");
		li.add("澳大利亚");
		li.add("加拿大");
		p2.add(li);
		
		Panel p3=new Panel();
		Button b=new Button("提交");
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
