package com.Swing;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JFrameTest extends JFrame {
	public JFrameTest(){
		setSize(new Dimension(WIDTH,HEIGHT));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}
	//setDefaultCloseOperation�����û��ڴ˴����Ϸ���close��ʱĬ��ִ�еĲ�����
	
	//WindowConstants���ڿ��ƴ��ڹرղ����ĳ���
	//EXIT_ON_CLOSE �˳�Ӧ�ó���Ĭ�ϴ��ڹرղ���
	
	public static void main(String[] args){
		JFrameTest f=new JFrameTest();
		f.setVisible(true);
	}
public static final int WIDTH=300;
public static final int HEIGHT=200;
}
