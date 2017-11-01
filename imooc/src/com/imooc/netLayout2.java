package com.imooc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class netLayout2 {
	public static void main(String[] args){
		Frame f=new Frame("这是GridBaglayout示例");
		f.setLayout(new GridBagLayout());
		GridBagConstraints gbcs=new GridBagConstraints();
		//设置横向坐标和纵向坐标，并加入那按钮
		gbcs.gridx=0;
		gbcs.gridy=0;
		f.add(new Button("按钮一"),gbcs);
		gbcs.gridx=0;
		gbcs.gridy=1;
		f.add(new Button("按钮二"),gbcs);
		gbcs.gridx=1;
		gbcs.gridy=0;
		f.add(new Button("按钮三"),gbcs);
		gbcs.gridx=1;
		gbcs.gridy=1;
		f.add(new Button("按钮四"),gbcs);
		f.setSize(200, 200);
		f.setVisible(true);
	}

}
