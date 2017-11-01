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
	add(new JLabel("�ı���"));
	text=new JTextField(10);
	add(text);
	add(new JButton("��ť"));
	button= new JButton("ȷ��");
	add(button);
	add(new JLabel("ѡ���"));
	checkbox1=new JCheckBox("ϲ������");
	checkbox2=new JCheckBox("ϲ����Ӱ");
	checkbox3=new JCheckBox("ϲ���Ķ�");
	add(checkbox1);
	add(checkbox2);
	add(checkbox3);
	add(new JLabel("��ѡ��ť"));
	group=new ButtonGroup();
	radio1=new JRadioButton("��");
	radio2=new JRadioButton("Ů");
	group.add(radio1);
	group.add(radio2);
	add(radio1);
	add(radio2);
	add(new JLabel("��������"));
	comBox=new JComboBox();
	comBox.addItem("A");
	comBox.addItem("B");
	comBox.addItem("C");
	add(comBox);
    add(new JLabel("�ı���"));
    area=new JTextArea(6,12);
    add(new JScrollPane(area));
	
	
}

}