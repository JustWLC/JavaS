package com.imooc;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panelNewLable {
public static void main(String[] args){
	Frame f=new Frame("����һ����ǩʾ��");
	Button b=new Button();
	Label label=new Label("I am a Label");//����һ��JLabel��ǩ
	label.setBackground(Color.blue);
	label.setAlignment(Label.CENTER);
	
	b.addActionListener( new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.exit(1);
		}
	});
	f.add(b);
	f.add(label);
	
	f.setSize(200, 200);
	f.setVisible(true);
}
}
