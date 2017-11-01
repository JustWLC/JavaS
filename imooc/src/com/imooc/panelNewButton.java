package com.imooc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
 void addActionListener(ActionListener I):该方法的作用是添加指定的动作侦听器，
 以接收发自此按钮的动作事件。
 **/
public class panelNewButton {
public static void main(String[] args){
	Frame f=new Frame("Button");
	Button b=new Button();
	b.setLabel("这是一个按钮，功能是关闭窗口");
	
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
