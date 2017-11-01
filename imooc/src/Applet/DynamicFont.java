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
	private Font f;         //字体
	private FontMetrics fm; //字模
	public void init(){
		str="厉害了，我的哥";
		this.setSize(520,200);
		this.setBackground(Color.white);
		ch=new char[str.length()];
		ch=str.toCharArray();     //将字符串中的各个字体保存到数组中
		image=createImage(getSize().width,getSize().height);
		graphics=image.getGraphics();//创建供绘制闭屏图像使用的图形上下文
		f=new Font("",Font.BOLD,18);  
		fm=getFontMetrics(f);         //获得指定字体的字体规格
		graphics.setFont(f);          //设置组件的字体
		float hue;
		color =new Color[str.length()];
		for(int i=0;i<str.length();i++){
			hue=((float)i)/((float)str.length());
			color[i]=new Color(Color.HSBtoRGB(hue, 0.8f, 1.0f));//颜色分配（将由HSB（色相、饱和度、亮度）模型指定的颜色分价的默认RGB模型的值的集合）
			
		}
	}
	public void start(){
		if(thread==null){
			thread=new Thread(this);  //开始新的线程
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
			repaint();     //重新绘制界面
		}
    }
	public void update(Graphics g){
		int x,y;
		double a;
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, getSize().width, getSize().height);  //填充指定的矩形
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
