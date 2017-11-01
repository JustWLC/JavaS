package Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;

public class DynamicFont extends Applet implements Runnable {

	String str=null;
	Thread thread=null;
	char[] ch;
	int p=0;
	Image image;
	int one=1;
	int two=30;
	int three=30;
	Graphics graphics;
	Color[] color;
	private Font f;         //����
	private FontMetrics fm; //��ģ
	public void init(){
		str="�����ˣ��ҵĸ�";
		this.setSize(520,200);
		this.setBackground(Color.white);
		ch=new char[str.length()];
		ch=str.toCharArray();     //���ַ����еĸ������屣�浽������
		image=createImage(getSize().width,getSize().height);
		graphics=image.getGraphics();//���������Ʊ���ͼ��ʹ�õ�ͼ��������
		f=new Font("",Font.BOLD,18);  
		fm=getFontMetrics(f);         //���ָ�������������
		graphics.setFont(f);          //�������������
		float hue;
		color =new Color[str.length()];
		for(int i=0;i<str.length();i++){
			hue=((float)i)/((float)str.length());
			color[i]=new Color(Color.HSBtoRGB(hue, 0.8f, 1.0f));//��ɫ���䣨����HSB��ɫ�ࡢ���Ͷȡ����ȣ�ģ��ָ������ɫ�ּ۵�Ĭ��RGBģ�͵�ֵ�ļ��ϣ�
			
		}
	}
	public void start(){
		if(thread==null){
			thread=new Thread(this);  //��ʼ�µ��߳�
			thread.start();
		}
	}
	public void stop(){
		if(thread!=null){
			thread.interrupt();
		}
	}
	public void run() {
		while(thread!=null){
			try{
				thread.sleep(200);
			}catch(InterruptedException e){
				
			}
			repaint();     //���»��ƽ���
		}
    }
	public void update(Graphics g){
		int x,y;
		double a;
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, getSize().width, getSize().height);  //���ָ���ľ���
		p+=one;
		p%=7;
		for(int i=0;i<str.length();i++){
			a=((p-i*one)%7)/4.0*Math.PI;
			x=30+fm.getMaxAdvance()*i+(int)(Math.cos(a)*two);
			y=80+(int)(Math.sin(a)*three);
			graphics.setColor(color[(p+i)%str.length()]);
			graphics.drawChars(ch, i, 1, x, y);
		}
		paint(g);
	}
	public void paint(Graphics g){
		g.drawImage(image, 0, 0, this);
	}

}
