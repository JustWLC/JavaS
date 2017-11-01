package com.Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ProgressMonitor;

public class ProgressBar {
public static void main(String[] args){
	JFrame f=new JFrame();
	Container c=f.getContentPane();
	c.setLayout(new BorderLayout());
	
	final ProgressMonitor monitor=new ProgressMonitor(f,"Monitoring the progress","",0,100);
	monitor.setProgress(0);
	
	JButton b=new JButton("Click to monitor the progress.");
	c.add(b);
	
	b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			ProgressTask task=new ProgressTask(monitor);
			task.start();
			
		}
	});
	f.setSize(500, 200);
	f.setVisible(true);
	f.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
}
static class ProgressTask implements Runnable{
	private boolean running;
	private Thread t;
	private ProgressMonitor monitor;
	private int value;
	
	public ProgressTask(ProgressMonitor monitor){
		this.monitor=monitor;
		running=false;
	}
	public void run(){
		while(running){
			try{
				Thread.sleep(500);
				if(monitor.isCanceled()){
					running=false;
				}
				monitor.setProgress(++value);
				monitor.setNote(value + "% complete");
				if(value>=100){
					running=false;
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public void start(){
		if(!running){
			value=0;
			monitor.setProgress(value);
			running=true;
			t=new Thread(this);
			t.start();
		}
	}
	public void stop(){
		monitor.setProgress(0);
		t=null;
	}
}
}
