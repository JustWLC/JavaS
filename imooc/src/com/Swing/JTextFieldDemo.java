package com.Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldDemo {
	public static void main(String[] args){
JFrame f=new JFrame("�ı���������ʾ��");
f.setLayout(new GridLayout(2,1));
Container contentPane=f.getContentPane();
contentPane.setLayout(new BorderLayout());
JPanel jpanel=new JPanel();
JPanel jpane2=new JPanel();
jpanel.setLayout(new GridLayout(2,2));
/*jpanel.setBorder(BorderFactory.createTitledBorder("��������ĵ�¼��Ϣ"));*/
JLabel lable3=new JLabel("���ƴ��¼ϵͳ��",JLabel.CENTER);
JLabel lable1=new JLabel("�û�����",JLabel.CENTER);
JLabel label2=new JLabel("���룺",JLabel.CENTER);
JTextField t1=new JTextField(10);
JPasswordField t2=new JPasswordField();
t2.setEchoChar('@');

jpane2.add(lable3);
jpanel.add(lable1);
jpanel.add(t1);
jpanel.add(label2);
jpanel.add(t2);
contentPane.add(jpane2,BorderLayout.NORTH);
contentPane.add(jpanel,BorderLayout.SOUTH);
f.setSize(700, 150);
f.setVisible(true);
f.addWindowListener(new WindowAdapter(){
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
});

}
}