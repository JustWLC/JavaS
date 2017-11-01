package com.Swing;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class JComboBoxTest {
JFrame f=null;
JComboBoxTest(){
	f=new JFrame("JComboBoxDemol");//����һ��JFrame����
	Container contentPane=f.getContentPane();//����һ������
	contentPane.setLayout(new GridLayout(1,2));
	//����һ���ַ������飬�������ʼ��
	String[] str={"�ʹ�","̩ɽ","��ɽ","�żҽ�","�ú�԰"};
	Vector vector=new Vector();
	/*Vector�����ʵ�ֿ������Ķ������顣������һ��������������ʹ�������������з��ʵ������
	���ǣ�Vector�Ĵ�С���Ը�����Ҫ�������С������Ӧ����Vector�������ӻ��Ƴ���Ĳ�����*/
	vector.addElement("����");
	vector.addElement("�Ϻ�");
	vector.addElement("�ൺ");
	vector.addElement("����");
	vector.addElement("�ɶ�");
	vector.addElement("����");
	JComboBox combo1=new JComboBox(str);//����һ��JComboBox����
	//����JComboBox�����ṩ��addItem��������������һ����Ŀ����JComboBox������
	combo1.addItem("̩ɽ");
	combo1.setBorder(BorderFactory.createTitledBorder("����ȥ�ĸ������棿"));
	JComboBox combo2=new JComboBox(vector);
	combo2.setBorder(BorderFactory.createTitledBorder("��ϲ���ĳ���"));
	contentPane.add(combo1);
	contentPane.add(combo2);
	f.pack();
	f.setVisible(true);

	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}
public static void main(String[] args){
	new JComboBoxTest();
}
}
