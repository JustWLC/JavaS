package com.imooc;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListTest {
	public static void main(String[] args){
Frame f=new Frame("这是一个列表示例");
f.setLayout(new GridLayout(1,2));
Label lb=new Label("请选择右边的年份");
lb.setAlignment(Label.CENTER);
List list=new List(7,true);
list.add("2007年");
list.add("2008年");
list.add("2009年");
list.add("2010年");
f.add(lb);
f.add(list);
f.setSize(400,400);
f.setVisible(true);
f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
});
}
}
