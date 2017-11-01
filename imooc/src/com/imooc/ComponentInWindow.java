package com.imooc;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComponentInWindow extends JFrame {
JTextField text;
JButton button;
JCheckBox checkbox1,checkbox2,checkbox3;
JRadioButton radio1,radio2;
ButtonGroup group;
JComboBox comBox;
JTextArea area;
public ComponentInWindow(){
	init();
	setVisible(true);
	setSize(320,300);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
void init(){
	setLayout(new FlowLayout());
	add(new JLabel("文本框"));
	text=new JTextField(10);
	add(text);
	add(new JButton("按钮"));
	button= new JButton("确定");
	add(button);
	add(new JLabel("选择框"));
	checkbox1=new JCheckBox("喜欢音乐");
	checkbox2=new JCheckBox("喜欢电影");
	checkbox3=new JCheckBox("喜欢阅读");
	add(checkbox1);
	add(checkbox2);
	add(checkbox3);
	add(new JLabel("单选按钮"));
	group=new ButtonGroup();
	radio1=new JRadioButton("男");
	radio2=new JRadioButton("女");
	group.add(radio1);
	group.add(radio2);
	add(radio1);
	add(radio2);
	add(new JLabel("下拉区域"));
	comBox=new JComboBox();
	comBox.addItem("A");
	comBox.addItem("B");
	comBox.addItem("C");
	add(comBox);
    add(new JLabel("文本区"));
    area=new JTextArea(6,12);
    add(new JScrollPane(area));
	
	
}

}
