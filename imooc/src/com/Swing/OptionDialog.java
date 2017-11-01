  package com.Swing;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionDialog {
public static void main(String[] args){
	JFrame f=new JFrame();
	Container c=f.getContentPane();
	
	final JButton b=new JButton("Popup Dialog");
	c.add(b);
	b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			int ch=JOptionPane.showConfirmDialog(b, "«Î—°‘Ò£°");
			if(ch==0){
				System.out.println("yes");
			}else if(ch==1){
				System.out.println("no");
			}else if(ch==2){
				System.out.println("cancel");
			}
		}
	});
	f.setVisible(true);
	f.setSize(500, 300);
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}
}
