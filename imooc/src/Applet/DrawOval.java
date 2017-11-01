package Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class DrawOval extends Applet {
	int s=50;
	int w=100;
  public void paint(Graphics g){
	 for(int i=0;i<3*20;i+=20){
		 g.drawOval(s+i/2, s+i/2, w-i, w-i);
		 g.setColor(Color.red);
	 }
  }
}
