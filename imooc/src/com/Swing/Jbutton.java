package com.Swing;

import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Jbutton {

public static void main(String[] args){
	JFrame f=new JFrame("这是一个按钮");
	Container contentpane=f.getContentPane();
	/*构造一个新的Container。可以直接扩展Container，但在这种情况下是轻量级的，
	 * 并且它必须被位于本机组件树中更高处的某一个父容器包含。*/
	JButton b =new JButton("按钮");
	//创建一个带初始文本的按钮
	//如果没有设置文字的位置，系统默认值会将文字置于图形的右边中间位置。
	//设置文本相对于图标的水平方向的位置。
	b.setHorizontalTextPosition(JButton.CENTER);
	//设置文本相对于图标的垂直方向的位置
	b.setVerticalTextPosition(JButton.BOTTOM);
	contentpane.add(b);
	f.pack();
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(1);
		}
	});
	
}
}
