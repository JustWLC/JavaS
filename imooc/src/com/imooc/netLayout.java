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
	Frame f=new Frame("����һ�����粼��ʾ��");
	f.setLayout(new GridLayout(3,3));
	//ʹ��forѭ��Ϊ������ӿؼ�
	for(int i=0;i<9;i++){
		f.add(new Button("��ť"+i));
	}
	
	f.setSize(200,200);
	f.setVisible(true);
}
}
