package Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class Faucet extends Applet  implements Runnable {
final int Max=7000;    //水滴的最大个数
Drop d[];              //声明一个水滴对象
int width,height,X,Y;  //声明Applet小程序的宽和高，以XY为坐标中心
Image off;             //声明一个图片对象
Graphics graphics;     //声明一个Graphics对象
Thread thread;         //声明一个线程对象

public void init(){    //Applet小程序初始化
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
public void start(){   //开始执行小程序
	thread=new Thread(this);
	thread.start();
}
public void stop(){    //停止小程序
	thread=null;
}
public void update(Graphics g){   //重新绘制小程序
	paint(g);
}
public void paint(Graphics g){    //绘制组件
	g.drawImage(off, 0, 0, this);
}
public void run() {          //运行线程
boolean reset=false;
int i,t=0;
while(true){
	graphics.clearRect(0, 0, width, height);  //清除指定矩形的背影色
	graphics.setColor(Color.YELLOW);           //设置当前颜色为白色
	graphics.drawLine(0, 15, 10, 15);         //画一条直线
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
class Drop{               //水滴类
	double X,Y;
	double newX,newY;
	int time;
	public Drop(){
		reset();
	}
	public void reset(){       //重新绘制水滴位置和大小
		X=(int)(Math.random()*-40);
		Y=(int)(Math.random()*5+10);
		newX=Math.random()*3+1.0;
		newY=0;
		time=0;
	}
}
