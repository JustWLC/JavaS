package com.Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SelectCourse {
public static void main(String[] args){
	JFrame f=new JFrame();
	final Container contentPane=f.getContentPane();
	Box box,box1,box2;
	final JTextArea t1=new JTextArea();
	JPanel p=new JPanel();
	p.setLayout(new GridLayout(2,3));
	p.setBorder(BorderFactory.createTitledBorder("请选择课程："));
	final JCheckBox c1=new JCheckBox("组织行为学");
	final JCheckBox c2=new JCheckBox("管理经济学");
	final JCheckBox c3=new JCheckBox("财务会计学");
	final JCheckBox c4=new JCheckBox("企业管理学");
	final JCheckBox c5=new JCheckBox("市场营销学");
	final JCheckBox c6=new JCheckBox("创业管理学");
	p.add(c1);
	p.add(c2);
	p.add(c3);
	p.add(c4);
	p.add(c5);
	p.add(c6);
	JButton button=new JButton("提交");
	button.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			StringBuffer sb=new StringBuffer();
			if(c1.isSelected())sb.append(c1.getText()).append("  ");
			if(c2.isSelected())sb.append(c1.getText()).append("  ");
			if(c3.isSelected())sb.append(c1.getText()).append("  ");
			if(c4.isSelected())sb.append(c1.getText()).append("  ");
			if(c5.isSelected())sb.append(c1.getText()).append("  ");
			if(c6.isSelected())sb.append(c1.getText()).append("  ");
			t1.setText(sb.toString());
			
		}
	});
	box1=Box.createVerticalBox();
	box1.add(new JScrollPane(t1),BorderLayout.CENTER);
	
	box2=Box.createVerticalBox();
	box2.add(p,BorderLayout.CENTER);
	box2.add(Box.createVerticalStrut(3));
	box2.add(button);
	
	box=Box.createVerticalBox();
	box.add(box1);
	box.add(Box.createVerticalStrut(20));
	box.add(box2);
	
	contentPane.add(box);
	
	f.setVisible(true);
	f.setSize(500, 300);
    f.addWindowListener(new WindowAdapter(){
    	public void windowClosing(WindowEvent e){
    		System.exit(0);
    	}
    });	
}
}
