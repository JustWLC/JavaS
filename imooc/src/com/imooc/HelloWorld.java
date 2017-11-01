package com.imooc;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class HelloWorld extends JFrame{
JMenuBar menubar;
JMenu menu,submenu;
JMenuItem Item1,Item2;
public HelloWorld(){}
public HelloWorld(String s,int x,int y,int w,int h){
		init(s);
		setLocation(x,y);
		setSize(w,h);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
	}
void init(String s){
	setTitle(s);
	menubar=new JMenuBar();
	menu=new JMenu("菜单");
	submenu=new JMenu("软件项目");
	Item1=new JMenuItem("Java话题");
	Item2=new JMenuItem("动画话题");
	Item1.setAccelerator(KeyStroke.getKeyStroke('A'));
	Item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK));
	menu.add(Item1);
	menu.addSeparator();
	menu.add(Item2);
	menu.add(submenu);
	submenu.add(new JMenuItem("汽车销售系统"));
	submenu.add(new JMenuItem("农场信息系统"));
	menubar.add(menu);
	setJMenuBar(menubar);
	
}
}
