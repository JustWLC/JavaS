package com.imooc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
/**
 * 
 * @author Fire and Blood
 *
 */
public class netLayout {
public static void main(String[] args){
	Frame f=new Frame("这是一个网络布局示例");
	f.setLayout(new GridLayout(3,3));
	//使用for循环为窗口添加控件
	for(int i=0;i<9;i++){
		f.add(new Button("按钮"+i));
	}
	
	f.setSize(200,200);
	f.setVisible(true);
}
}
