package com.imooc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 void addActionListener(ActionListener I):�÷��������������ָ���Ķ�����������
 �Խ��շ��Դ˰�ť�Ķ����¼���
 **/
public class panelNewButton {
public static void main(String[] args){
	Frame f=new Frame("Button");
	Button b=new Button();
	b.setLabel("����һ����ť�������ǹرմ���");
	
	b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			System.exit(1);
		}
	});
	f.add(b);
	f.setSize(200,200);
	f.setVisible(true);
}
}
