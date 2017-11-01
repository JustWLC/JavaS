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
		f=new JFrame("����¼�ʾ��");
		Container contentPane=f.getContentPane();
		contentPane.setLayout(new GridLayout(2,1));
		b=new JButton("��ť");
	
		label=new JLabel("��ʼ״̬����û������¼�",JLabel.CENTER);
		b.addMouseListener(this);
		contentPane.add(label);
		contentPane.add(b);
		f.pack();
		f.setVisible(true);
		f.addWindowListener(this);
		f.setSize(500, 500);
	}
	public void mousePressed(MouseEvent e){
		label.setText("���Ѿ�������갴ť");
	}
	public void  mouseClicked(MouseEvent e){
		label.setText("�㵥����ť");
	}
	public void mouseEntered(MouseEvent e){
		label.setText("����ѽ��밴ť");
	}
	public void mouseExited(MouseEvent e){
		label.setText("������뿪��ť");
	}
	public void mouseReleased(MouseEvent e){
		label.setText("���Ѿ�ʰ����갴ť");
	}
	public static void main(String[] args){
		new MouseTest();
	}
	

}
