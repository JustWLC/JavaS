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
	f=new JFrame("JComboBoxDemol");//创建一个JFrame对象
	Container contentPane=f.getContentPane();//定义一个容器
	contentPane.setLayout(new GridLayout(1,2));
	//定义一个字符串数组，并将其初始化
	String[] str={"故宫","泰山","黄山","张家界","颐和园"};
	Vector vector=new Vector();
	/*Vector类可以实现可增长的对象数组。与数组一样，它包含可以使用整数索引进行访问的组件。
	但是，Vector的大小可以根据需要增大或缩小，以适应创建Vector后进行添加或移除项的操作。*/
	vector.addElement("北京");
	vector.addElement("上海");
	vector.addElement("青岛");
	vector.addElement("广州");
	vector.addElement("成都");
	vector.addElement("西安");
	JComboBox combo1=new JComboBox(str);//定义一个JComboBox对象
	//利用JComboBox类所提供的addItem（）方法，加入一个项目到此JComboBox对象中
	combo1.addItem("泰山");
	combo1.setBorder(BorderFactory.createTitledBorder("你想去哪个景点玩？"));
	JComboBox combo2=new JComboBox(vector);
	combo2.setBorder(BorderFactory.createTitledBorder("你喜欢的城市"));
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
