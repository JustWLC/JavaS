package AWTEvent;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class ChangeColor {
	public static void main(String[] args){
		JFrame f=new JFrame("ChangeColor");
		Container c=f.getContentPane();
		JMenuBar m=new JMenuBar();
		JButton red=new JButton("ºìÉ«");
		JButton green=new JButton("ÂÌÉ«");
		JButton Yellow=new JButton("»ÆÉ«");
		
		m.add(red);
		m.add(green);
		m.add(Yellow);
		
		red.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				c.setBackground(Color.red);
				c.repaint();
			}
		});
		green.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				c.setBackground(Color.green);
				c.repaint();
			}
		});
		Yellow.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				c.setBackground(Color.yellow);
				c.repaint();
			}
		});
		f.setJMenuBar(m);
		f.setVisible(true);
		f.setSize(200, 200);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
	}
}
