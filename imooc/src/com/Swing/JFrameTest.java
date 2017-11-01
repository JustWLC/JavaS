package com.Swing;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JFrameTest extends JFrame {
	public JFrameTest(){
		setSize(new Dimension(WIDTH,HEIGHT));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
	//setDefaultCloseOperation设置用户在此窗体上发起“close”时默认执行的操作。
	
	//WindowConstants用于控制窗口关闭操作的常量
	//EXIT_ON_CLOSE 退出应用程序默认窗口关闭操作
	
	public static void main(String[] args){
		JFrameTest f=new JFrameTest();
		f.setVisible(true);
	}
public static final int WIDTH=300;
public static final int HEIGHT=200;
}
