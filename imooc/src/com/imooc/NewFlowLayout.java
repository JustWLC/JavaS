package com.imooc;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class NewFlowLayout extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1=new Button("��ťһ");
	Button b2=new Button("��ť��");
	Button b3=new Button("��ť��");
	Button b4=new Button("��ť��");
    NewFlowLayout(){
    	this.setTitle("FlowLayout");
    	this.setLayout(new FlowLayout());
    	this.add(b1);
    	this.add(b2);
    	this.add(b3);
    	this.add(b4);
    	this.setBounds(100,100,250,250);
    	this.setVisible(true);
    }
    public static void main(String[] args){
    	new NewFlowLayout();
    }

}

