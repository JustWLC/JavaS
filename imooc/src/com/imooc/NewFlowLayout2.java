package com.imooc;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class NewFlowLayout2 {
public static void main(String[] args){
	Frame f=new Frame("FlowLayout");
	f.setLayout(new FlowLayout());
	for(int i=0;i<5;i++)
		f.add(new Button("°´Å¥"+i));
	f.setSize(500, 200);
	f.setVisible(true);
}
}
