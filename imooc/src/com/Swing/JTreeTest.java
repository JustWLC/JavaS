package com.Swing;

import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class JTreeTest {
public static void main(String[] args){
	JFrame f=new JFrame("��ʾ��");//��������
	//�����û��ڴ˴����Ϸ���close��ʱĬ��ִ�еĲ���
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.getContentPane();
	Box box =Box.createHorizontalBox();//����Box�����
	JTree tree1=new JTree();
	tree1.putClientProperty("JTree.lineStyle", "Angled");//�������������ļ�/ֵ
	JScrollPane scrollPane1=new JScrollPane(tree1);//�����������
	tree1.setAutoscrolls(true);
	JTree tree2=new JTree();
	JScrollPane scrollPane2=new JScrollPane(tree2);
	//��Box������ӹ������
	box.add(scrollPane1, BorderLayout.WEST);
	box.add(scrollPane2, BorderLayout.EAST);
	f.getContentPane().add(box, BorderLayout.CENTER);
	f.setSize(300, 240);
	f.setVisible(true);
	
}
}
