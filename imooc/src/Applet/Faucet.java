package Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Faucet extends Applet  implements Runnable {
final int Max=7000;    //ˮ�ε�������
Drop d[];              //����һ��ˮ�ζ���
int width,height,X,Y;  //����AppletС����Ŀ��͸ߣ���XYΪ��������
Image off;             //����һ��ͼƬ����
Graphics graphics;     //����һ��Graphics����
Thread thread;         //����һ���̶߳���

public void init(){    //AppletС�����ʼ��
	this.setSize(400,400);
	this.setBackground(Color.gray);
	this.width=getSize().width;
	this.height=getSize().height;
	d=new Drop[Max];
	for(int i=0;i<Max;i++){
		d[i]=new Drop();
		off=createImage(width,height);
		graphics=off.getGraphics();
	}
}
public void start(){   //��ʼִ��С����
	thread=new Thread(this);
	thread.start();
}
public void stop(){    //ֹͣС����
	thread=null;
}
public void update(Graphics g){   //���»���С����
	paint(g);
}
public void paint(Graphics g){    //�������
	g.drawImage(off, 0, 0, this);
}
public void run() {          //�����߳�
boolean reset=false;
int i,t=0;
while(true){
	graphics.clearRect(0, 0, width, height);  //���ָ�����εı�Ӱɫ
	graphics.setColor(Color.YELLOW);           //���õ�ǰ��ɫΪ��ɫ
	graphics.drawLine(0, 15, 10, 15);         //��һ��ֱ��
	for(i=0;i<Max;i++){
		graphics.fillOval((int)d[i].X, (int)d[i].Y, 2, 2);
		d[i].X=d[i].X+d[i].newX;
		if(d[i].X>10){
			d[i].Y+=d[i].newY*d[i].time/1000;
			d[i].newY=(int)9.8*d[i].time;
			d[i].time++;
			
		}
		if(d[i].Y>height){
			d[i].reset();
		}
	}
	repaint();
	try{
		Thread.sleep(20);
		
	}catch(InterruptedException e){
		
	}
}
	}

}
class Drop{               //ˮ����
	double X,Y;
	double newX,newY;
	int time;
	public Drop(){
		reset();
	}
	public void reset(){       //���»���ˮ��λ�úʹ�С
		X=(int)(Math.random()*-40);
		Y=(int)(Math.random()*5+10);
		newX=Math.random()*3+1.0;
		newY=0;
		time=0;
	}
}