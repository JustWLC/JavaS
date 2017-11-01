package Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class DrawString extends Applet{
	public void paint(Graphics g){
		g.setFont(new Font("TimeRoman",Font.BOLD,18));
		g.setColor(Color.BLACK);
		g.drawString("ÐÕÃû£ºLI",10 , 40);
	}

}
