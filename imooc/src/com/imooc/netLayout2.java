package com.imooc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class netLayout2 {
	public static void main(String[] args){
		Frame f=new Frame("����GridBaglayoutʾ��");
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbcs=new GridBagConstraints();
		//���ú���������������꣬�������ǰ�ť
		gbcs.gridx=0;
		gbcs.gridy=0;
		f.add(new Button("��ťһ"),gbcs);
		gbcs.gridx=0;
		gbcs.gridy=1;
		f.add(new Button("��ť��"),gbcs);
		gbcs.gridx=1;
		gbcs.gridy=0;
		f.add(new Button("��ť��"),gbcs);
		gbcs.gridx=1;
		gbcs.gridy=1;
		f.add(new Button("��ť��"),gbcs);
		f.setSize(200, 200);
		f.setVisible(true);
	}

}
