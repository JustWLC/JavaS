package com.imooc;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class CardLayoutDemo {
	public static void main(String[] args){
		final Frame f=new Frame("�߽粼����");
		final CardLayout c=new CardLayout(5,10);
		f.setLayout(c);
		ActionListener listener=new ActionListener(){
			public void actionPerformed(ActionEvent e){
				c.next(f);
			}
		};
		for(int i=1;i<5;i++){
			Button b=new Button("�����л�"+i);
			b.addActionListener(listener);
			f.add(b);
		}
		f.setSize(200, 200);
		f.setVisible(true);
	}

}
