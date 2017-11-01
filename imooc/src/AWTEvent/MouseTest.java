package AWTEvent;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseTest extends WindowAdapter
                      implements MouseListener{
	JFrame f=null;
	JButton b=null;
	JLabel label=null;
	public MouseTest(){
		f=new JFrame("鼠标事件示例");
		Container contentPane=f.getContentPane();
		contentPane.setLayout(new GridLayout(2,1));
		b=new JButton("按钮");
	
		label=new JLabel("起始状态，还没有鼠标事件",JLabel.CENTER);
		b.addMouseListener(this);
		contentPane.add(label);
		contentPane.add(b);
		f.pack();
		f.setVisible(true);
		f.addWindowListener(this);
		f.setSize(500, 500);
	}
	public void mousePressed(MouseEvent e){
		label.setText("你已经按下鼠标按钮");
	}
	public void  mouseClicked(MouseEvent e){
		label.setText("你单击按钮");
	}
	public void mouseEntered(MouseEvent e){
		label.setText("光标已进入按钮");
	}
	public void mouseExited(MouseEvent e){
		label.setText("光标已离开按钮");
	}
	public void mouseReleased(MouseEvent e){
		label.setText("你已经拾起鼠标按钮");
	}
	public static void main(String[] args){
		new MouseTest();
	}
	

}
